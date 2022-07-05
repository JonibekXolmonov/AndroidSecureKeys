package com.example.androidsecurekeys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var serverKey = BuildConfig.SERVER_KEY
    private var smsKey = BuildConfig.SMS_KEY

    private external fun getPublicKey(): String?
    private external fun getPrivateKey(): String?

    init {
        System.loadLibrary("keys")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "onCreate: $serverKey")
        Log.d("TAG", "onCreate: $smsKey")
        Log.d("TAG", "onCreate: ${getPrivateKey()}")
        Log.d("TAG", "onCreate: ${getPublicKey()}")
    }
}