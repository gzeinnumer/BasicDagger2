package com.gzeinnumer.basicdagger2.dagger;


import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import com.gzeinnumer.basicdagger2.DaggerApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//todo 3
@Module public class AppModule {
    private final DaggerApplication application;

    public AppModule(DaggerApplication app) {
        this.application = app;
    }

    // apa yang akan di dapatkan disini
    //3 disini, tiga juga di base activity
    @Provides
    @Singleton
    Context providesApplicationContext(){
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context app){
        return app.getSharedPreferences("MY_PREF_TITLE", Context.MODE_PRIVATE);
    }

    //todo 14
    //dagger akan membutkan function untuk memanggil ini
    @Provides
    Resources provideResource(){
        return application.getResources();
    }
}
