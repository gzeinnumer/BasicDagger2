package com.gzeinnumer.basicdagger2;

import android.app.Application;

import com.gzeinnumer.basicdagger2.dagger.AppComponent;
import com.gzeinnumer.basicdagger2.dagger.AppModule;
import com.gzeinnumer.basicdagger2.dagger.DaggerAppComponent;

//todo 4
//same like Universal Context/MyApp
public class DaggerApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        //todo 5
        //build first
        //todo 6
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        appComponent.inject(this);
    }

    //todo 7
    public AppComponent getAppComponent(){
        return appComponent;
    }
}
