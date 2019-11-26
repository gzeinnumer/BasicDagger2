package com.gzeinnumer.basicdagger2.dagger;

import com.gzeinnumer.basicdagger2.BaseActivity;
import com.gzeinnumer.basicdagger2.DaggerApplication;
import com.gzeinnumer.basicdagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerApplication application);
//    void inject(MainActivity mainActivity);
    void inject(BaseActivity baseActivity);
}
