package com.vk59.daggersample

import android.provider.ContactsContract
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class StorageModule {
    // You can Named to define each component otherwise it will be a mistake.
    // Another way to do it is making annotation yourself using Qualifier
    @Named("prod")
    @Provides
    fun provideDatabaseHelper() = DatabaseHelper()

    @Named("test")
    @Provides
    fun provideDatabaseHelperTest() = DatabaseHelper()
}