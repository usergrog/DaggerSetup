package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppA
import com.grog.daggerlib.ClassAppB
import com.grog.daggerlib.ClassLibA
import com.grog.daggerlib.ClassLibB
import com.grog.daggerlib.di.LibComponentB
import com.grog.daggersetup.MainActivity
import dagger.Component
import javax.inject.Singleton

@AppSingletonB
@Component(dependencies=arrayOf(AppComponentA::class, LibComponentB::class), modules = arrayOf(AppModuleB::class))
interface AppComponentB {
    fun provideContext(): Context
    fun provideClassAppB(): ClassAppB
    fun provideClassAppA(): ClassAppA
    fun provideClassLibA(): ClassLibA
    fun provideClassLibB(): ClassLibB

    fun inject(o : MainActivity)
}