package com.trafficsignrecognition.model.handler;

import com.trafficsignrecognition.model.predict.PythonScriptCaller;
import com.trafficsignrecognition.model.upload.FileAccepter;
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

    public List<String> predict(MultipartFile file) {

        String filePath = fileAccepter.accept(file);
        List<String> predictResult = pythonScriptCaller.call(filePath);

        return predictResult;
    }
}
