package com.grog.daggerlib.di

import com.grog.daggerlib.ClassLibA
import dagger.Module
import dagger.Provides

@Module
open class LibModuleA() {

    @Provides
    @LibScope
    open fun provideClassLibA(): ClassLibA {
        return ClassLibA()
    }

}