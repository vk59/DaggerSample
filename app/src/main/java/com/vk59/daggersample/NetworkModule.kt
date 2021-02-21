package com.vk59.daggersample

import dagger.Module
import dagger.Provides


@Module
class NetworkModule {
    @Provides
    fun provideNetworkUtils() = NetworkUtils()
}