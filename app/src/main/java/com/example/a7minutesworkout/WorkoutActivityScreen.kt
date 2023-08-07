package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7minutesworkout.databinding.ActivityWorkoutScreenBinding

@Suppress("DEPRECATION")
class WorkoutActivityScreen : AppCompatActivity() {

    private var binding :ActivityWorkoutScreenBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkoutScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(
            binding?.activityScreenActionBar
        )
        binding?.activityScreenActionBar?.setNavigationOnClickListener {

            if(supportActionBar !== null){
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
            //back btn to navigate to previous screen
//            onBackPressed()
//            super.onBackPressed()
//            onBackPressedDispatcher.onBackPressed()
            onBackPressed()
        }
    }
}