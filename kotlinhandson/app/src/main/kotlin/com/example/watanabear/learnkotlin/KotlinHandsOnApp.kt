package com.example.watanabear.learnkotlin

import android.app.Application
import com.example.watanabear.learnkotlin.dagger.AppComponent
import com.example.watanabear.learnkotlin.dagger.ClientModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by ryo on 2017/05/22.
 */
class KotlinHandsOnApp: Application() {

    val component: AppComponent = createComponent()

    open fun createComponent(): AppComponent =
        DaggerKotlinHandsOnApp_KotlinClientAppComponent.create()

    @Component(modules = arrayOf(ClientModule::class))
    @Singleton
    interface KotlinClientAppComponent: AppComponent
}