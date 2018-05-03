package com.trafficsignrecognition.model.service.impl.upload;

import com.trafficsignrecognition.properties.PathProperty;
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
    private PathProperty pathProperty;

    public String accept(MultipartFile file) {

        String baseDir = pathProperty.getUploadDir();
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
