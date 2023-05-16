package com.example.droidcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageId = intent.getIntExtra("KEY_IMAGEM", R.drawable.donut_circle);
        val imageName = intent.getStringExtra("KEY_IMAGEM_NAME").orEmpty();

        val ivImage = findViewById<ImageView>(R.id.iv_image_response);
        val tvImageName = findViewById<TextView>(R.id.tv_texte_image_response);

        ivImage.setImageResource(imageId);
        tvImageName.text = imageName;
    }
}