package com.grog.daggerlib.di

import com.grog.daggerlib.ClassLibA
import com.grog.daggerlib.ClassLibB
import dagger.Component

@LibScreenScope
@Component(dependencies=arrayOf(LibComponentA::class), modules = arrayOf(LibModuleB::class))
interface LibComponentB {
    fun provideClassLibA(): ClassLibA
    fun provideClassLibB(): ClassLibB
}