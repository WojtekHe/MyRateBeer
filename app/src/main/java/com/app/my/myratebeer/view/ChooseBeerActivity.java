package com.app.my.myratebeer.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.app.my.myratebeer.R;
import com.app.my.myratebeer.contract.ChooseBeerContract;
import com.app.my.myratebeer.presenter.ChooseBeer;

import java.io.File;

import butterknife.OnClick;

public class ChooseBeerActivity extends AppCompatActivity
        implements ChooseBeerContract.View {

    private ChooseBeerContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_beer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Wybierz piwo");

        presenter = ChooseBeer.createInstance(this);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_choose_beer, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    @OnClick(R.id.fab)
    public void onNewBeerClick() {

    }

    @Override
    public File getStoragePath() {
        return getApplication()
                .getExternalFilesDirs("")[1];
    }
}
