package com.example.proiectfinal;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class quizMatematica extends AppCompatActivity {
    RadioButton raspA, raspB, raspC, raspD;
    TextView tvScor, tvIntrebare;
    private RaspunsuriMate vectIntrebari = new RaspunsuriMate();
    private String rasp;
    private int scor = 0;
    private int nrIntrebari = vectIntrebari.vectIntreb.length;
    static int index = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_matematica);
        raspA = findViewById(R.id.radioButton1);
        raspB = findViewById(R.id.radioButton2);
        raspC = findViewById(R.id.radioButton3);
        raspD = findViewById(R.id.radioButton4);
        tvIntrebare = findViewById(R.id.tvIntrebare);
        tvScor = findViewById(R.id.tvScor);
        index = 0;
        Intent intent = getIntent();
        String getEmail = intent.getStringExtra("email");
        actIntrebare(index);
        raspA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspA.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                index++;
                if (index < nrIntrebari) {
                    actIntrebare(index);
                } else {
                    endquiz(getEmail);
                }
            }

        });
        raspB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspB.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                index++;
                if (index < nrIntrebari) {
                    actIntrebare(index);
                } else {
                    endquiz(getEmail);
                }
            }
        });
        raspC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspC.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                index++;
                if (index < nrIntrebari) {
                    actIntrebare(index);
                } else {
                    endquiz(getEmail);
                }
            }
        });
        raspD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspD.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                index++;
                if (index < nrIntrebari) {
                    actIntrebare(index);
                } else {
                    endquiz(getEmail);
                }
            }
        });
    }
    private void actIntrebare ( int i){
        tvIntrebare.setText(vectIntrebari.getIntrebare(i));
        raspA.setText(vectIntrebari.getRaspA(i));
        raspB.setText(vectIntrebari.getRaspB(i));
        raspC.setText(vectIntrebari.getRaspC(i));
        raspD.setText(vectIntrebari.getRaspD(i));
        rasp = vectIntrebari.getRaspCorect(i);
    }
    private void endquiz (String getEmail) {
        Intent it = new Intent(Intent.ACTION_SEND);
        it.putExtra(Intent.EXTRA_EMAIL,  new
                String[]{getEmail.toString()});
        it.putExtra(Intent.EXTRA_SUBJECT, "Quiz");
        it.putExtra(Intent.EXTRA_TEXT, "scorul este: " + scor);
        it.setType("message/rfc822");
        startActivity(Intent.createChooser(it, "Choose Mail App"));
    }
}