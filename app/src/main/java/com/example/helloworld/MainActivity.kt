package com.example.helloworld

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val fontFamily = listOf(Typeface.MONOSPACE, Typeface.SERIF, Typeface.SANS_SERIF)
    private val textStyle = listOf(Typeface.NORMAL, Typeface.BOLD, Typeface.ITALIC)
    private val backgroundImg = listOf(R.drawable.hill, R.drawable.bunga)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView1)

        button.setOnClickListener {
            val randomFontFamily = Random.nextInt(1, 100) % fontFamily.size
            val randomTextStyle = Random.nextInt(1, 100) % textStyle.size
            val randomBg = Random.nextInt(1, 100) % backgroundImg.size
            imageView.setImageResource(backgroundImg[randomBg])
            textView.setTypeface(fontFamily[randomFontFamily], textStyle[randomTextStyle])
        }
    }
}