package com.example.proiectfinal;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
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

public class Crearecont extends AppCompatActivity {
    DatabaseHelper myDb;
    Button create;
    EditText insert_username, insert_password,insert_email;
    String username, password,email;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearecont);
        create = (Button) findViewById(R.id.clickBtn);
        insert_username = (EditText) findViewById(R.id.username);
        insert_password = (EditText) findViewById(R.id.password);
        insert_email = (EditText) findViewById(R.id.email);
        myDb = new DatabaseHelper(this);
        addData();
        }
        public void addData() {
            create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    username =insert_username.getText().toString().trim();
                    password = insert_password.getText().toString().trim();
                    email = insert_email.getText().toString().trim();
                    if (myDb.insertData(username, password, email))
                        message();
                    else
                        Toast.makeText(getBaseContext(), "Error",
                                Toast.LENGTH_SHORT).show();
                }
            });
    }
    private void message() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setMessage("Cont creat cu succes")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).create();
        dialog.show();
    }
}