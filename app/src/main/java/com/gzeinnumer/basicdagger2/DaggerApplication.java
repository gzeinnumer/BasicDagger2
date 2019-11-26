package com.gzeinnumer.basicdagger2;

import android.app.Application;

import com.gzeinnumer.basicdagger2.dagger.AppComponent;
import com.gzeinnumer.basicdagger2.dagger.AppModule;
import com.gzeinnumer.basicdagger2.dagger.DaggerAppComponent;

public class DaggerApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
