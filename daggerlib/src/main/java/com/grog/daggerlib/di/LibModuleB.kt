package com.grog.daggerlib.di

import com.grog.daggerlib.ClassLibB
import dagger.Module
import dagger.Provides

@Module
open class LibModuleB() {

    @Provides
    @LibScreenScope
    open fun provideClassLibB(): ClassLibB {
        return ClassLibB()
    }

}