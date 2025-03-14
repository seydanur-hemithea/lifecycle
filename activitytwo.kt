package com.seydanur.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seydanur.lifecycle.databinding.ActivityActivitytwoBinding
import com.seydanur.lifecycle.databinding.ActivityMainBinding

class activitytwo : AppCompatActivity() {
    private lateinit var binding: ActivityActivitytwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivitytwoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         val mainintent=intent
         val yollananIsim=mainintent.getStringExtra("isim")

        binding.textView2.text=yollananIsim
    }
   /* fun firstaktivity(view: View){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }*/

}