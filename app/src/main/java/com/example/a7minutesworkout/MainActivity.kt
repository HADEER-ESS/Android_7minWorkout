package com.example.a7minutesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnStartFl?.setOnClickListener {
            val intent = Intent(this ,  WorkoutActivityScreen::class.java)
//            Toast.makeText(this, "Start btn clicked" , Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }

    //To Avoid Memory Leak we have destroy the binding and set it back to null

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}