package com.example.proiectfinal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class Fizica extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizica);
        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.user_list);
        lv.setAdapter(new com.example.proiectfinal.FizicalistAdapter(this,
                userList));
    }
    private ArrayList getListData() {
        ArrayList<com.example.proiectfinal.Fizicalist> results = new
                ArrayList<>();
        com.example.proiectfinal.Fizicalist user1 = new
                com.example.proiectfinal.Fizicalist();
        user1.setName("Forta de Frecare");
        user1.setdefinitie("Forța de frecare de repaus (de fixare, de aderare) este cea prin care se realizează fixarea corpurilor unul față de altul. Fără forța de frecare de fixare nu ar fi posibilă activitatea și viața umană de zi cu zi.");
        user1.setformula("Ff=coeficient de frecare * Fn(forța normală)");
        user1.setunitatedemasurare("Frecarea are aceeași unitate de măsură precum forța, măsurându-se în Newton (N).");
        results.add(user1);
        com.example.proiectfinal.Fizicalist user2 = new
                com.example.proiectfinal.Fizicalist();
        user2.setName("Inertia");
        user2.setdefinitie("Inerția este rezistența oricărui corp cu masă la modificarea stării sale de repaus sau de mișcare rectilinie uniformă atunci când asupra sa nu acționează forțe exterioare.");
        user2.setformula("F=m(masa)*r^2(raza)");
        user2.setunitatedemasurare("kg*m^2");
        results.add(user2);
        com.example.proiectfinal.Fizicalist user3 = new
                com.example.proiectfinal.Fizicalist();
        user3.setName("Greutatea");
        user3.setdefinitie("Unele manuale standard definesc greutatea ca o cantitate vectorială, forța gravitațională care acționează asupra obiectului. Alții definesc greutatea ca o cantitate scalară, mărimea forței gravitaționale. Alții îl definesc ca mărimea forței de reacție exercitate asupra unui corp prin mecanisme care îl mențin în loc.");
        user3.setformula("G=m(masa)*g(acceleratia gravitationala)");
        user3.setunitatedemasurare("Unitatea de măsură pentru greutate este cea a forței, care în Sistemul internațional de unități (SI) este newton (simbol: N)");
        results.add(user3);
        com.example.proiectfinal.Fizicalist user4 = new
                com.example.proiectfinal.Fizicalist();
        user4.setName("Viteza");
        user4.setdefinitie("În fizică, viteza reprezintă raportul dintre distanța parcursă și durata deplasării corpului. Sinonime: „iuțeală”, „repeziciune”, „velocitate”, „celeritate”.");
        user4.setformula("v=delta d(distanta)/delta t(timpul)");
        user4.setunitatedemasurare("m/s");
        results.add(user4);
        com.example.proiectfinal.Fizicalist user5 = new
                com.example.proiectfinal.Fizicalist();
        user5.setName("Forta elastica");
        user5.setdefinitie("Forta elastica este forta care readuce corpul la forma initiala, dupa incetarea actiunii fortei deformatoare. Observatie: Forta elestica ia nastere in corpurile elastice odata cu deformarea si creste direct proportional cu deformarea.");
        user5.setformula("Fe=delta l(alungirea resortului)*K(constanta elastica)");
        user5.setunitatedemasurare("Unitatea de măsură pentru constanta elastică în SI este newton/metru (N/m).");
        results.add(user5);
        return results;
    }
}