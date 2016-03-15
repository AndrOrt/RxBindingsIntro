package com.donnfelker.rxbindingsintro;

import android.app.Application;

import timber.log.Timber;

public class IntroApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
