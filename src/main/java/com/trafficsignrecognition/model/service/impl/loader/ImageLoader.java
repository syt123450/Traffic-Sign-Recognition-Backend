package com.trafficsignrecognition.model.service.impl.loader;

import com.trafficsignrecognition.properties.PathProperty;
import com.trafficsignrecognition.properties.ServerProperty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class ImageLoader {

    private static Logger logger = Logger.getLogger(ImageLoader.class);

    private static final String MOVE_REJECT_RAW = "mv %s/%s %s/%s";
    private static final String MOVE_ACCEPT_RAW = "mv %s/%s %s/%s/%s";
    private static final String REJECT_PATH_RAW = "http://%s:%s/reject/%s";
    private static final String ACCEPT_PATH_RAW = "http://%s:%s/accept/%s/%s";
    private static String MOVE_REJECT_TEMPLATE;
    private static String MOVE_ACCEPT_TEMPLATE;
    private static String REJECT_PATH_TEMPLATE;
    private static String ACCEPT_PATH_TEMPLATE;

    @Autowired
    private ServerProperty serverProperty;

    @Autowired
    public void setMoveScript(PathProperty pathProperty) {
        MOVE_REJECT_TEMPLATE = String.format(MOVE_REJECT_RAW,
                pathProperty.getUploadDir(),
                "%s",
                pathProperty.getRejectDir(),
                "%s");
        MOVE_ACCEPT_TEMPLATE = String.format(MOVE_ACCEPT_RAW,
                pathProperty.getUploadDir(),
                "%s",
                pathProperty.getAcceptDir(),
                "%s",
                "%s");
        REJECT_PATH_TEMPLATE = String.format(REJECT_PATH_RAW,
                serverProperty.getServerAddress(),
                serverProperty.getServerPort(),
                "%s");
        ACCEPT_PATH_TEMPLATE = String.format(ACCEPT_PATH_RAW,
                serverProperty.getServerAddress(),
                serverProperty.getServerPort(),
                "%s",
                "%s");
    }

    public String loadAccepted(String fileName, int classname) {

        logger.info("Load accepted image.");

        String moveScript = String.format(MOVE_ACCEPT_TEMPLATE, fileName, String.format("%05d", classname), fileName);

        try {
            Process ps = Runtime.getRuntime().exec(moveScript);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String newPath = String.format(ACCEPT_PATH_TEMPLATE, String.format("%05d", classname), fileName);

        return newPath;
    }

    public String loadUnaccepted(String fileName) {

        logger.info("Load unaccepted images.");

        String moveScript = String.format(MOVE_REJECT_TEMPLATE, fileName, fileName);

        try {
            Process ps = Runtime.getRuntime().exec(moveScript);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String newPath = String.format(REJECT_PATH_TEMPLATE, fileName);

        return newPath;
    }
}
