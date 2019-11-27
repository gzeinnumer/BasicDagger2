package com.gzeinnumer.basicdagger2.dagger;

import com.gzeinnumer.basicdagger2.BaseActivity;
import com.gzeinnumer.basicdagger2.DaggerApplication;

import javax.inject.Singleton;

import dagger.Component;

//todo 2
//ignore red
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    //todo 5
    void inject(DaggerApplication application);
//    void inject(MainActivity mainActivity);
    //todo 11
    //pada todo11 ini, komentarkan MainActivity, dan buat untuk BaseActivity
    void inject(BaseActivity baseActivity);
}
