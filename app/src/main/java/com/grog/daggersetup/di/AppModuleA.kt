package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppA
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModuleA(internal var appContext: Context) {
    @Provides
    @AppSingletonA
    open fun provideContext(): Context {
        return appContext
    }

    @Provides
    @AppSingletonA
    open fun provideClassLibA(): ClassAppA {
        return ClassAppA()
    }

}