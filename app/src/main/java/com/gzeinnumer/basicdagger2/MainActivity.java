package com.gzeinnumer.basicdagger2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


//todo 10 ubah extend bagian ini jadi BaseActivity
public class MainActivity extends BaseActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 11
        textView = findViewById(R.id.tv);

        Log.d("MYZEIN", "onCreate: Before "+ preft.getInt("Number",0));

        preft.edit().putInt("Number", 6).apply();

        Log.d("MYZEIN", "onCreate: After "+ preft.getInt("Number",0));

        //todo 12
//        textView.setBackgroundColor(context.getResources().getColor(android.R.color.holo_red_dark));
        //todo 13
        //komentarkan todo12 dan buat stp todo14, untuk pelamahamn lebih tentang dagger
        //liat pada AppModul dan BaseActivity

        //todo 15
        //kamu bsa panggil dengan cara ini
        textView.setBackgroundColor(res.getColor(android.R.color.holo_red_dark));

        //todo 16
        //name in mainfest

    }
}
