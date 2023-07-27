package com.example.java3hw5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.java3hw5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        var n = intent.getIntExtra("num2", 0)
        binding.tv.text = (n).toString()
        binding.btnPlus.setOnClickListener {
            if (n == 10) {
                val intent = Intent(this, SecondActivity::class.java);
                intent.putExtra("num", n)
                startActivity(intent)
                finish()
            } else {
                binding.tv.text = (++n).toString()
            }
        }
    }
}