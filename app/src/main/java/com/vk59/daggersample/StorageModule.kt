package com.vk59.daggersample

import dagger.Module
import dagger.Provides


@Module
class StorageModule {
    @Provides
    fun provideDatabaseHelper() = DatabaseHelper()
}