package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModuleB() {

    @Provides
    @AppSingletonB
    open fun provideClassLibB(): ClassAppB {
        return ClassAppB()
    }

}