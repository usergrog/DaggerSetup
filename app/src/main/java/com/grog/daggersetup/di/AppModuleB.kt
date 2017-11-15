package com.grog.daggersetup.di

import com.grog.daggerlib.ClassAppB
import com.grog.daggerlib.di.LibScreenScope
import dagger.Module
import dagger.Provides

@Module
open class AppModuleB() {

    @Provides
    @LibScreenScope
    open fun provideClassLibB(): ClassAppB {
        return ClassAppB()
    }

}