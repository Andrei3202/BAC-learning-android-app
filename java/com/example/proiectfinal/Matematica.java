package com.example.proiectfinal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
public class Matematica extends AppCompatActivity {
    Button button;
    ImageView image;
    int i=1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematica);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        image = (ImageView) findViewById(R.id.imageView1);
        button = (Button) findViewById(R.id.btnChangeImage);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (i == 1) {
                    image.setImageResource(R.drawable.integrale);
                    button.setText("Derivate");
                    i=0;
                } else {
                    image.setImageResource(R.drawable.derivate);
                    button.setText("Integrale");
                    i=1;
                }
            }
        });
    }
}