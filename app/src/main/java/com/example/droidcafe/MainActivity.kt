package com.example.droidcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @DrawableRes
    private var imageId: Int = 0;
    private var imageName: String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv_donuts = findViewById<ImageView>(R.id.iv_donuts);
        val iv_ice_cream = findViewById<ImageView>(R.id.iv_ice_cream);
        val iv_fro_yo = findViewById<ImageView>(R.id.iv_fro_yo);
        val btnf_cart = findViewById<FloatingActionButton>(R.id.btnf_cart);

        iv_donuts.setOnClickListener() {
            imageId = R.drawable.donut_circle;
            imageName = getString(R.string.donuts_text);
            Toast.makeText(this, imageName, Toast.LENGTH_LONG).show();
        }

        iv_ice_cream.setOnClickListener() {
            imageId = R.drawable.icecream_circle;
            imageName = getString(R.string.ice_cream_text);
            Toast.makeText(this, imageName, Toast.LENGTH_LONG).show();
        }

        iv_fro_yo.setOnClickListener() {
            imageId = R.drawable.froyo_circle;
            imageName = getString(R.string.fro_yo_text);
            Toast.makeText(this, imageName, Toast.LENGTH_LONG).show();
        }

        btnf_cart.setOnClickListener() {
            val openScreenIntent = Intent(this, SecondActivity::class.java).also {
                it.putExtra("KEY_IMAGEM", imageId);
                it.putExtra("KEY_IMAGEM_NAME", imageName);
                startActivity(it);
            };
        }
    }
}
