package com.example.harsh_gmp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView ivGif;
    String url = "https://www.wired.com/wp-content/uploads/images_blogs/design/2013/09/Boglio_02.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivGif = findViewById(R.id.ivGif);

        Glide.with(getApplicationContext()).load(url).into(ivGif);

    }
}
