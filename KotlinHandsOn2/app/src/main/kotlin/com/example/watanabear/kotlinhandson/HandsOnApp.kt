package com.example.watanabear.kotlinhandson

import android.app.Application
import com.example.watanabear.kotlinhandson.dagger.AppComponent
import com.example.watanabear.kotlinhandson.dagger.ClientModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by ryo on 2017/05/31.
 */
open class HandsOnApp :Application() {

    val component: AppComponent = create()

    open fun create():AppComponent = DaggerHandsOnApp_HandsOnAppComponent.create()

    @Component(modules = arrayOf(ClientModule::class))
    @Singleton
    interface HandsOnAppComponent: AppComponent
}