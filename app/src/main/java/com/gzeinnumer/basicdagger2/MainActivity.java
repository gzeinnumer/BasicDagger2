package com.gzeinnumer.basicdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv);

        Log.d("MYZEIN", "onCreate: Before "+ preft.getInt("Number",0));

        preft.edit().putInt("Number", 6).apply();

        Log.d("MYZEIN", "onCreate: After "+ preft.getInt("Number",0));

//        textView.setBackgroundColor(context.getResources().getColor(android.R.color.holo_red_dark));
        //liat pada AppModul dan BaseActivity
        textView.setBackgroundColor(res.getColor(android.R.color.holo_red_dark));

    }
}
