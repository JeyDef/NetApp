package com.jey.netapp.di.modules

import android.app.Application

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

@Module
class AppModule(var mApplication: Application) {

    @Provides
    @Singleton
    internal fun providesApplication(): Application {
        return mApplication
    }
}
