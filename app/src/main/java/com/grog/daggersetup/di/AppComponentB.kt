package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppA
import com.grog.daggerlib.ClassAppB
import com.grog.daggerlib.ClassLibA
import com.grog.daggerlib.ClassLibB
import com.grog.daggerlib.di.AppScreenScope
import com.grog.daggerlib.di.LibModuleB
import com.grog.daggerlib.di.LibScreenScope
import com.grog.daggersetup.MainActivity
import dagger.Component

@LibScreenScope
@Component(dependencies=arrayOf(AppComponentA::class), modules = arrayOf(AppModuleB::class, LibModuleB::class))
interface AppComponentB {
    fun provideContext(): Context
    fun provideClassAppB(): ClassAppB
    fun provideClassAppA(): ClassAppA
    fun provideClassLibA(): ClassLibA
    fun provideClassLibB(): ClassLibB

    fun inject(o : MainActivity)
}