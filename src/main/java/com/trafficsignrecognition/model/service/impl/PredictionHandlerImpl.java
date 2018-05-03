package com.trafficsignrecognition.model.service.impl;

import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.service.PredictionHandler;
import com.trafficsignrecognition.model.service.RecordHandler;
import com.trafficsignrecognition.model.service.impl.loader.ImageLoader;
import com.trafficsignrecognition.model.service.impl.predict.PredictionResponseGenerator;
import com.trafficsignrecognition.model.service.impl.predict.PythonScriptCaller;
import com.trafficsignrecognition.model.service.impl.upload.FileAccepter;
import com.trafficsignrecognition.properties.AcceptanceProperty;
import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by ss on 2018/3/30.
 */

@Service
@Profile("dev")
public class PredictionHandlerImpl implements PredictionHandler {

    @Autowired
    private FileAccepter fileAccepter;
    @Autowired
    private PythonScriptCaller pythonScriptCaller;
    @Autowired
    private RecordHandler recordHandler;
    @Autowired
    private ImageLoader imageLoader;
    @Autowired
    private AcceptanceProperty acceptanceProperty;

    public PredictionResponse predict(MultipartFile file) {

        String filePath = fileAccepter.accept(file);
        List<String> predictResult = pythonScriptCaller.call(filePath);

        PredictionResponse response = PredictionResponseGenerator.generate(predictResult);

        String fileName = file.getOriginalFilename();

        boolean accept = response.getResults().get(0).getAccuracy() > acceptanceProperty.getThreshold();

        String imagePath;
        if (accept) {
            imagePath = imageLoader.loadAccepted(fileName, response.getResults().get(0).getClassID());
        } else {
            imagePath = imageLoader.loadUnaccepted(fileName);
        }

        recordHandler.addNewRecord(response.getResults().get(0), imagePath);

        return response;
    }
}
