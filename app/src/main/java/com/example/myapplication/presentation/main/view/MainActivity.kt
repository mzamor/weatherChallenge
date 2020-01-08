package com.example.myapplication.presentation.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.example.myapplication.R

class MainActivity :  AppCompatActivity(), SearchView.OnQueryTextListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
