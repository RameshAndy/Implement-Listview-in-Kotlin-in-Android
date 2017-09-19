package com.ram.example.kotlinlistview

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

public class DetailsActivity (): AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.details_activity)
    }
}