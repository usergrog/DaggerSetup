package com.grog.daggersetup.di

import android.content.Context
import com.grog.daggerlib.ClassAppA
import com.grog.daggerlib.ClassLibA
import com.grog.daggerlib.di.AppScope
import com.grog.daggerlib.di.LibComponentA
import com.grog.daggerlib.di.LibScreenScope
import dagger.Component

@AppScope
@Component( dependencies = arrayOf(LibComponentA::class), modules = arrayOf(AppModuleA::class))
interface AppComponentA {
    fun provideContext(): Context
    fun provideClassAppA(): ClassAppA
    fun provideClassLibA(): ClassLibA
}