package com.grog.daggersetup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.grog.daggerlib.ClassAppA
import com.grog.daggerlib.ClassAppB
import com.grog.daggerlib.ClassLibA
import com.grog.daggerlib.ClassLibB
import com.grog.daggerlib.di.DaggerLibComponentA
import com.grog.daggersetup.di.AppModuleA
import com.grog.daggersetup.di.AppModuleB
import com.grog.daggersetup.di.DaggerAppComponentA
import com.grog.daggersetup.di.DaggerAppComponentB
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    @Inject
    lateinit var classAppA :ClassAppA
    @Inject
    lateinit var classAppB : ClassAppB
    @Inject
    lateinit var classLibA : ClassLibA
    @Inject
    lateinit var classLibB : ClassLibB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerAppComponentB.builder()
                .appComponentA(DaggerAppComponentA.builder()
                        .appModuleA(AppModuleA(applicationContext))
                        .libComponentA(DaggerLibComponentA.builder().build())
                        .build())
                .build().inject(this)

        Log.v(TAG , classAppA.result())
        Log.v(TAG , classAppB.result())
        Log.v(TAG , classLibA.result())
        Log.v(TAG , classLibB.result())
    }
}
