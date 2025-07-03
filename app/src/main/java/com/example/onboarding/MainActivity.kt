package com.example.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Fragment2.OnDataPass {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, Fragment2())
            .commit()
    }

    override fun onDataPass(name: String) {
        val fragment3 = Fragment3()
        val bundle = Bundle()
        bundle.putString("name", name)
        fragment3.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment3)
            .addToBackStack(null)
            .commit()
    }
}
