package com.trafficsignrecognition.model.service.impl.loader;

import com.trafficsignrecognition.properties.PathProperty;
import com.trafficsignrecognition.properties.ServerProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class ImageLoader {

    private static final String MOVE_REJECT_RAW = "mv %s/%s %s/%s";
    private static final String MOVE_ACCEPT_RAW = "mv %s/%s %s/%s/%s";
    private static final String REJECT_PATH_RAW = "http://localhost:%s/reject/%s";
    private static final String ACCEPT_PATH_RAW = "http://localhost:%s/accept/%s/%s";
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
                serverProperty.getServerPort(),
                "%s");
        ACCEPT_PATH_TEMPLATE = String.format(ACCEPT_PATH_RAW,
                serverProperty.getServerPort(),
                "%s",
                "%s");
    }

    public String loadAccepted(String fileName, int classname) {

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
