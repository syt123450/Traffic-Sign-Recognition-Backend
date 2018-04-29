package com.trafficsignrecognition.model.service.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Paths;

/**
 * Created by ss on 2018/3/30.
 */

@Service
public class FileAccepter {

    @Autowired
    private Environment env;

    public String accept(MultipartFile file) {

        String baseDir = env.getProperty("upload.baseDir");
        String fileName = file.getOriginalFilename();
        String filepath = Paths.get(baseDir, fileName).toString();

        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(filepath)));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
                return "Fail to upload file.";
            }
            return filepath;
        } else {
            return "File is empty";
        }
    }

}
