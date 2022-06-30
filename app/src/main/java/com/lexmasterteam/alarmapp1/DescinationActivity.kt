package com.lexmasterteam.alarmapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lexmasterteam.alarmapp1.databinding.ActivityDescinationBinding

class DescinationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDescinationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescinationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}