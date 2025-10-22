package com.example.proiectfinal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ModelRo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_ro);
        GridView gv = (GridView) findViewById(R.id.gridview);
        gv.setAdapter(new com.example.proiectfinal.ImageAdapterRo(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                Intent i = new Intent(getApplicationContext(),
                        com.example.proiectfinal.FullImageActivityRo.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}