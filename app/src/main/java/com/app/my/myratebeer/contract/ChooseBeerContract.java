package com.app.my.myratebeer.contract;

import com.app.my.myratebeer.R;

import java.io.File;

import butterknife.OnClick;

/**
 * Created by WojciechH on 2018-04-23.
 */

public interface ChooseBeerContract {

    interface View {

        void onNewBeerClick();

        File getStoragePath();
    }

    interface Presenter {

    }
}
