package com.grog.daggerlib.di

import android.content.Context
import com.grog.daggerlib.ClassLibB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class LibModuleB() {

    @Provides
    @LibSingletonB
    open fun provideClassLibB(): ClassLibB {
        return ClassLibB()
    }

}