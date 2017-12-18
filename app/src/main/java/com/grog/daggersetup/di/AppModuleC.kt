package com.grog.daggersetup.di

import com.grog.daggerlib.ClassAppA
import com.grog.daggerlib.ClassAppB
import com.grog.daggerlib.ClassAppC
import com.grog.daggerlib.di.AppScope
import com.grog.daggerlib.di.LibScreenScope
import dagger.Module
import dagger.Provides

@Module
open class AppModuleC {

    @Provides
    @AppScope
    open fun provideClassLibC(classAppA : ClassAppA): ClassAppC {
        return ClassAppC(classAppA)
    }

}