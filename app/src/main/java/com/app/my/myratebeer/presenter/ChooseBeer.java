package com.app.my.myratebeer.presenter;

import com.app.my.myratebeer.contract.ChooseBeerContract;
import com.app.my.myratebeer.model.Values;
import com.app.my.myratebeer.view.ChooseBeerActivity;

/**
 * Created by WojciechH on 2018-04-23.
 */

public class ChooseBeer implements ChooseBeerContract.Presenter {

    private ChooseBeerContract.View view;

    private static ChooseBeer instance;

    private ChooseBeer(ChooseBeerContract.View view) {
        this.view = view;
        createValues();
    }

    private void createValues() {
        Values.createInstance().setStoragePath(view.getStoragePath());
    }

    public static ChooseBeerContract.Presenter createInstance(ChooseBeerContract.View chooseBeerActivity) {
        instance = new ChooseBeer(chooseBeerActivity);
        return instance;
    }
}
