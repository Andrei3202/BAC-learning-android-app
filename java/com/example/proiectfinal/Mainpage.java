package com.example.proiectfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mainpage extends AppCompatActivity {
    Button button,button2,button3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        button = (Button) findViewById(R.id.clickBtn);
        button2 = (Button) findViewById(R.id.clickBtn2);
        button3 = (Button) findViewById(R.id.clickBtn3);
        Intent intent = getIntent();
        String getEmail = intent.getStringExtra("email");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Mainpage.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.materie_menu,
                        popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new
                                                             PopupMenu.OnMenuItemClickListener() {
                                                                 @Override
                                                                 public boolean onMenuItemClick(MenuItem menuItem) {
                                                                     if(menuItem.getTitle().equals("Romana")){
                                                                         Intent i = new Intent(Mainpage.this, Romana.class);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Matematica")){
                                                                         Intent i = new Intent(Mainpage.this, Matematica.class);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Informatica")){
                                                                         Intent i = new Intent(Mainpage.this, Informatica.class);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Fizica")){
                                                                         Intent i = new Intent(Mainpage.this, Fizica.class);
                                                                         startActivity(i);
                                                                     }
                                                                     return true;


                                                                 }
                                                             });
                popupMenu.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Mainpage.this, button3);
                popupMenu.getMenuInflater().inflate(R.menu.materie_menu,
                        popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new
                                                             PopupMenu.OnMenuItemClickListener() {
                                                                 @Override
                                                                 public boolean onMenuItemClick(MenuItem menuItem) {
                                                                     if(menuItem.getTitle().equals("Romana")){
                                                                         Intent i = new Intent(Mainpage.this, ModelRo.class);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Matematica")){
                                                                         Intent i = new Intent(Mainpage.this, ModelMate.class);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Informatica")){
                                                                         Intent i = new Intent(Mainpage.this, ModelInfo.class);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Fizica")){
                                                                         Intent i = new Intent(Mainpage.this, ModelFizica.class);
                                                                         startActivity(i);
                                                                     }
                                                                     return true;


                                                                 }
                                                             });
                popupMenu.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Mainpage.this, button2);
                popupMenu.getMenuInflater().inflate(R.menu.materie_menu,
                        popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new
                                                             PopupMenu.OnMenuItemClickListener() {
                                                                 @Override
                                                                 public boolean onMenuItemClick(MenuItem menuItem) {
                                                                     if(menuItem.getTitle().equals("Romana")){
                                                                         Intent i = new Intent(Mainpage.this, quizRomana.class);
                                                                         i.putExtra("email",getEmail);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Matematica")){
                                                                         Intent i = new Intent(Mainpage.this, quizMatematica.class);
                                                                         i.putExtra("email",getEmail);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Informatica")){
                                                                         Intent i = new Intent(Mainpage.this, quizInformatica.class);
                                                                         i.putExtra("email",getEmail);
                                                                         startActivity(i);
                                                                     }
                                                                     if(menuItem.getTitle().equals("Fizica")){
                                                                         Intent i = new Intent(Mainpage.this, quizFizica.class);
                                                                         i.putExtra("email",getEmail);
                                                                         startActivity(i);
                                                                     }
                                                                     return true;


                                                                 }
                                                             });
                popupMenu.show();
            }
        });
    }
}