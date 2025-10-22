package com.example.proiectfinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivityFizica extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modelbac);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        com.example.proiectfinal.ImageAdapterFizica imageAdapter = new
                com.example.proiectfinal.ImageAdapterFizica(this);
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.ImagineMica[position]);
    }
}
