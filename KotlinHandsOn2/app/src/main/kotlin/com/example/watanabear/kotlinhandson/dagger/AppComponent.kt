package com.example.watanabear.kotlinhandson.dagger

import com.example.watanabear.kotlinhandson.MainActivity

interface AppComponent {

    fun inject(mainActivity: MainActivity)
}