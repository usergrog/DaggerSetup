package com.grog.daggerlib.di

import android.content.Context
import com.grog.daggerlib.ClassLibA
import com.grog.daggerlib.ClassLibB
import dagger.Component
import javax.inject.Singleton

@LibSingletonB
@Component(dependencies=arrayOf(LibComponentA::class), modules = arrayOf(LibModuleB::class))
interface LibComponentB {
    fun provideClassLibA(): ClassLibA
    fun provideClassLibB(): ClassLibB
}