package com.example.watanabear.learnkotlin.dagger

import com.example.watanabear.learnkotlin.MainActivity

/**
 * Created by ryo on 2017/05/22.
 */
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}