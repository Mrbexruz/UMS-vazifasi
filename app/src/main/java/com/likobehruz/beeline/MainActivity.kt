package com.likobehruz.beeline

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.likobehruz.beeline.databinding.ActivityMainBinding
import com.likobehruz.beeline.fragment.HomeFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment= HomeFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.main, homeFragment)
            .commit()

    }
}