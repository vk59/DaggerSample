package com.vk59.daggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Named("prod")
    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Named("test")
    @Inject
    lateinit var databaseHelperTest: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.component.injectMainActivity(this)
    }
}