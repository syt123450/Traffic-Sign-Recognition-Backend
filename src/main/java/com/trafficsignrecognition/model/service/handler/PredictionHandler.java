package com.trafficsignrecognition.model.service.handler;

import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.service.predict.PredictionResponseGenerator;
import com.trafficsignrecognition.model.service.predict.PythonScriptCaller;
import com.trafficsignrecognition.model.service.upload.FileAccepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by ss on 2018/3/30.
 */

@Service
public class PredictionHandler {

    @Autowired
    private FileAccepter fileAccepter;
    @Autowired
    private PythonScriptCaller pythonScriptCaller;
    @Autowired
    private RecordHandler recordHandler;

    public PredictionResponse predict(MultipartFile file) {

        String filePath = fileAccepter.accept(file);
        List<String> predictResult = pythonScriptCaller.call(filePath);

        PredictionResponse response = PredictionResponseGenerator.generate(predictResult);

        String fileName = file.getOriginalFilename();
        recordHandler.addNewRecord(fileName, response.getResults().get(0));

        return response;
    }
}
