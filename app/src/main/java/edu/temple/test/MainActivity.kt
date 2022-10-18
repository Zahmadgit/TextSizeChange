package edu.temple.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import org.w3c.dom.Text
import android.view.View
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity{

    lateinit var textViewModel: TextViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create and attach fragments if not already exist
        if (savedInstanceState == null) {
            textViewModel = TextViewModel()

            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_1, SizeFragment())
                .add(R.id.container_2, TextViewModel())
                .commit()
        } else {
            // Grab reference to previously added fragment
            textViewModel = supportFragmentManager.findFragmentById(R.id.container_2) as TextViewModel
        }

    }


}