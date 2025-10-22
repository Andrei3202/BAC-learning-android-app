package com.example.proiectfinal;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.content.Intent;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    Button login,create,show;
    EditText insert_username, insert_password;
    String username, password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.clickBtn);
        create = (Button) findViewById(R.id.clickBtn2);
        insert_username = (EditText) findViewById(R.id.username);
        insert_password = (EditText) findViewById(R.id.password);
        username=insert_username.getText().toString().trim();
        password=insert_password.getText().toString().trim();
        myDb = new DatabaseHelper(this);

        logare();
        creare();
    }


        public void logare() {
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    username=insert_username.getText().toString().trim();
                    password=insert_password.getText().toString().trim();
                    if (myDb.Verificare(username, password)) {
                        Intent i = new Intent(MainActivity.this, Mainpage.class);
                        i.putExtra("email",myDb.getemail(username,password));
                        startActivity(i);
                    } else {
                        Toast.makeText(getBaseContext(), "Username/Password gresit",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
            public void creare () {
                create.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, Crearecont.class);
                        startActivity(i);
                    }
                });
            }

    }
