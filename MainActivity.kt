package com.seydanur.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seydanur.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("oncreate calistirildi")

    }

    override fun onStart() {
        super.onStart()
        println("onstart calistirildi")
    }

    override fun onResume() {
        super.onResume()
        println("onResume calistirildi")
    }

    override fun onPause() {
        super.onPause()
        println("onpause calistirildi")
    }

    override fun onStop() {
        super.onStop()
        println("onstop calistirildi")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy calistirildi")
    }
    fun sonrakiSayfa(view: View){
        val intent= Intent(this,activitytwo::class.java)
        val kullaniciGirdisi=binding.editText.text.toString()
        intent.putExtra("isim",kullaniciGirdisi)
        startActivity(intent)
        //finish()//geri dönme durmlarinda taamamen hafizadan siler derstroy eder log in
    // gibi durumlarda geriye dönüslerde güvenlik acigi olusmaz

       // val kullaniciGirdisi=binding.editText.text.toString()
      // binding.textView.text="İsim: ${kullaniciGirdisi}"

    }





}