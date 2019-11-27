package com.gzeinnumer.basicdagger2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    //todo 8
    @Inject public SharedPreferences preft;
    @Inject public Context context;
    @Inject public Resources res;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //todo 9
        ((DaggerApplication) getApplication()).getAppComponent().inject(this);

    }
}
