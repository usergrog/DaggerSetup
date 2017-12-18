package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppA
import com.grog.daggerlib.di.AppScope
import com.grog.daggerlib.di.LibScope
import dagger.Module
import dagger.Provides

@Module
open class AppModuleA(internal var appContext: Context) {
    @Provides
    @AppScope
    open fun provideContext(): Context {
        return appContext
    }

    @Provides
    @AppScope
    open fun provideClassAppA(): ClassAppA {
        return ClassAppA()
    }

}