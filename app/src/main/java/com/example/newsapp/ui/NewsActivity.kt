package com.example.newsapp.ui

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.databinding.ActivityNewsBinding


class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navigationView = binding.bottomNavigationView
        val navController = binding.newsNavHostFragment.getFragment<NavHostFragment>().navController
        navigationView.setupWithNavController(navController)
    }
}



