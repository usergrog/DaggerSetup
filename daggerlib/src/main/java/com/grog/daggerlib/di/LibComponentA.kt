package com.grog.daggerlib.di

import android.content.Context
import com.grog.daggerlib.ClassLibA
import dagger.Component
import javax.inject.Singleton

@LibSingletonA
@Component(modules = arrayOf(LibModuleA::class))
interface LibComponentA {
    fun provideClassLibA(): ClassLibA
}