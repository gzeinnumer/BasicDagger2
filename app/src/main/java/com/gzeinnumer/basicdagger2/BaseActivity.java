package com.gzeinnumer.basicdagger2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ResourceBundle;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    //sesuai dengan app modul
    @Inject public SharedPreferences preft;
    @Inject public Context context;
    @Inject public Resources res;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((DaggerApplication) getApplication()).getAppComponent().inject(this);

    }
}
