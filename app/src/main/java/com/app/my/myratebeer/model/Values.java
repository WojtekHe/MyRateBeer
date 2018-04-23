package com.app.my.myratebeer.model;

import java.io.File;

/**
 * Created by WojciechH on 2018-04-23.
 */

public class Values {

    private static Values instance;

    private static File storagePath;

    private Values() {}

    public static Values getInstance() {
        return instance;
    }

    public static Values createInstance() {
        instance = new Values();
        return instance;
    }

    public Values setStoragePath(File path) {
        instance.storagePath = path;
        return instance;
    }

    public static File getStoragePathFile() {
        return storagePath;
    }
}
