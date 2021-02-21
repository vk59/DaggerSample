package com.vk59.daggersample

import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}