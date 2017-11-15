package com.grog.daggerlib.di

import com.grog.daggerlib.ClassLibA
import dagger.Component

@LibScope
@Component(modules = arrayOf(LibModuleA::class))
interface LibComponentA {
    fun provideClassLibA(): ClassLibA
}