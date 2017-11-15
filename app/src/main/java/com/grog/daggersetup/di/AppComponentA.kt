package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppA
import dagger.Component
import javax.inject.Singleton

@AppSingletonA
@Component(modules = arrayOf(AppModuleA::class))
interface AppComponentA {
    fun provideContext(): Context
    fun provideClassAppA(): ClassAppA
}