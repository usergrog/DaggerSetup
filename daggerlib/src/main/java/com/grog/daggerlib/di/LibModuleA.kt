package com.grog.daggerlib.di

import android.content.Context
import com.grog.daggerlib.ClassLibA
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class LibModuleA() {

    @Provides
    @LibSingletonA
    open fun provideClassLibA(): ClassLibA {
        return ClassLibA()
    }

}