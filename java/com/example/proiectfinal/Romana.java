package com.example.proiectfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.net.Uri;


public class Romana extends AppCompatActivity {
    Button button, button2;
    TextView titlu, eseu;
    int i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romana);
        i=1;
        button = (Button) findViewById(R.id.clickBtn);
        button2 = (Button) findViewById(R.id.clickBtn2);
        titlu = (TextView) findViewById(R.id.textView1);
        eseu = (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Romana.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.romana,
                        popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new
                                                             PopupMenu.OnMenuItemClickListener() {
                                                                 @Override
                                                                 public boolean onMenuItemClick(MenuItem menuItem) {
                                                                     if (menuItem.getTitle().equals("Luceafarul")) {
                                                                         titlu.setText("Luceafarul");
                                                                         eseu.setText("Romantismul este un curent literar, apărut în Europa, la sfârșitulsecolului al XVIII-lea, ca o reacție împotriva clasicismului și araționalismului iluminist. Acest curent a promovat manifestareafanteziei, a sincerității sufletești și a originalității. Mihai Eminescu este unul dintre cei mai valoroși scriitori ai poporuluiromân și aparține perioadei clasice a literaturii, alături de Ion Creangă,Ioan Slavici și Ion Luca Caragiale. Acesta a abordat toate cele trei genuriliterare, liricul însă cu predilecție. Opera acestuia înglobează elementeleromatice cu cele autohtone, ale specificului național. Poemul“Luceafărul” este o capodoperă a creației eminesciene. Acesta afost publicat inițial în aprilie 1883, la Viena, dar apare și în revista“Convorbiri literare” în august 1883. Ulterior, acesta este inclus însingurul volum antum eminescian.Poezia se încadrează în romantism, deoarece sunt ilustrate toatetrăsăturile acestui curent. Procedeele romantice regăsite sunt:exacerbarea eului, interesul pentru destinul uman excepțional, temacondiției omului de geniu, dar și prezența antitezei. O primă trăsătură care permite încadrarea poemului în romantism estereprezentată de sursa de inspirație folclorică. Sursa de inspirațiefolclorică este provenită de la un basm popular românesc, intitulat:„Fata în grădina de aur”, care descrie iubirea dintre o fată de împărat șiun zmeu, personaje simbolice care aparțin unor lumi diferite.");
                                                                         i = 1;
                                                                     }
                                                                     if (menuItem.getTitle().equals("Povestea lui Harap Alb")) {
                                                                         titlu.setText("Povestea lui Harap Alb");
                                                                         eseu.setText("Verde- Împărat trimite fratelui său, Craiul, care „era odată într-o ţară”, oscrisoare pentru a-i cere să-i dea pe unul dintre cei trei fii ai lui spre a-i fi urmaş la tron, fiindcă el avea numai fete. Comunicându-le tatălfeciorilor săi conţinutul scrisorii şi acceptul său („Care dintre voi sesimte destoinic a împărăţi peste o ţară aşa mare şi bogată, ca aceea, arevoie din partea mea să se ducă, ca să împlinească voinţa cea de peurmă a moşului vostru.”), cel mare socoteşte că lui i se cuvine împărăţia, şi pleacă la drum. Dar la un pod îi iese în cale tatăl său îmbrăcat într-o piele de urs şi îl sperie, încât feciorul ajunge la concluzia„că mie unuia nu îmi trebuie – spune el – nici împărăţie nici nimica”.Fiul mijlociu încearcă şi el să ajungă la unchiul său, dar păţind acelaşilucru, deasemenea renunţă („Că doar, slavă Domnului, am ce mânca lacasa d-tale.”). Craiul este posomorât şi ruşinat: „Din trei feciori câţi aretata, nici unul să nu fie bun de nimica?! Apoi, drept să vă spun, căatunci degeaba mai stricaţi mâncarea, dragii mei... Să umblaţi numaiaşa, frunza frăsinelului, toată viaţa voastră şi să vă lăudaţi că sunteţifeciori de craiu, asta nu miroase a nas de om..”. Cel mic, prins de ruşine,iese în grădină, unde „începe a plânge în inima sa”, când i se înfăţişează„o babă gârbovă de bătrâneţe, care umbla după milostenie”. Aceasta îlsfătuieşte, după ce fiul craiului îi dă un ban pomană, să ceară tatălui său„calul, armele şi hainele cu care a fost el mire”, pentru că numai aşapoate merge „unde n-au putut merge fraţii” săi. Şi îi spune că va putearecunoaşte calul prin faptul că doar acel cal va mânca din jăratecul puspe o tavă în mijlocul hergheliei. Apoi fiul de crai o vede pe bătrână„învăluită într-un hobot alb, ridicându-se în văzduh”.");
                                                                         i = 2;
                                                                     }
                                                                     if (menuItem.getTitle().equals("Ion")) {
                                                                         titlu.setText("Ion");
                                                                         eseu.setText("Incipitul prezintă progresiv drumul de intrare în satul Pripas. Naratorul îl descrie într-o o zi devară. Se amintește de casa lui Zaharia Herdelea, învățătorul din sat, cât și de casa luiGlanetașu. Fiind zi de sărbătoare, este horă în sat, lăutarii dându-și silința să cânte cât mai bine.Tinerii joacă în timp ce bătrânii stau și îi privesc. Ion se întâlnește cu Ana într-un loc mai ascuns,moment în care Vasile Baciu se ia la ceartă cu el. Familia învățătorului este și ea prezentă lahoră, întreținându-se cu preotul Belciug. Conflictul se termină, grupul lui Ion și cel al lui George mutându-se la cârciumă. Aici cei doi sebat, certându-se din cauza plății lăutarilor. Titu, fiul învățătorului, încearcă sa-l descoase pe Iondar nu are succes. Ion pleacă a doua zi la câmp. Aveau puțin pământ, deoarece tatăl sau își bătuse joc de zestreamamei, fiind un mare petrecăreț. Ajuns la lotul său de pământ, se apuca de cosit. O vede pe Ana dar nu vorbește mult cu ea. Se gândește la ea doar când vine vorba de avere și în specialde pământul pe care aceasta l-ar primi zestre daca s-ar mărita, el iubind-o pe Florica, o fatafrumoasă dar săracă. Când ajunge la tatăl ei, Ana este întrebată cu cine a vorbit, tatăl eineagreându-l pe Ion.  ION , de Liviu Rebreanu- rezumat pe capitole -GLASUL PĂMÂNTULUICapitolul 1: ÎnceputulIncipitul prezintă progresiv drumul de intrare în satul Pripas. Naratorul îl descrie într-o o zi devară. Se amintește de casa lui Zaharia Herdelea, învățătorul din sat, cât și de casa luiGlanetașu. Fiind zi de sărbătoare, este horă în sat, lăutarii dându-și silința să cânte cât mai bine.Tinerii joacă în timp ce bătrânii stau și îi privesc. Ion se întâlnește cu Ana într-un loc mai ascuns,moment în care Vasile Baciu se ia la ceartă cu el. Familia învățătorului este și ea prezentă lahoră, întreținându-se cu preotul Belciug.Conflictul se termină, grupul lui Ion și cel al lui George mutându-se la cârciumă.");
                                                                         i = 3;
                                                                     }
                                                                     if (menuItem.getTitle().equals("Morometi")) {
                                                                         titlu.setText("Morometi");
                                                                         eseu.setText("Pregătit de proza scurtă din volumul de debut „Întâlnirea dinpământuri”, primul roman scris de Marin Preda, „Moromeţii”, este alcătuitdin două volume, publicate la doisprezece ani distanţă, în 1955, respectiv 1967. Romanul reconstituie imaginea satului românesc într-o perioadă decriză, în preajma celui de-al Doilea Război Mondial şi înregistreazătransformările vieţii rurale, ale mentalităţilor şi ale instituţiilor , de-a lungulunui sfert de secol, şi impune o tipologie nouă în proza românească. Inspirându-se dintr-o perioadă de adânci frământări social-istorice,creând o frescă a lumii satului din Câmpia Dunării – Siliştea – Gumeşti, MarinPreda meditează asupra uneia din problemele cele mai importante ale vieţiiromâneşti din perioadă, temă fundamentală a scrierilor sale: dispariţiiţărănimii tradiţionale. Ca formulă estetică, romanul lui Marin Preda se încadrează în realismulpostbelic şi ilustrează, cu o mare putere de sugestie, sfârşitul romanuluidoric prin „renunţarea parţială la omniscienţă” şi naşterea unei obiectivităţimoderne în cadrul căreia autoritatea centrală – naratorul, „decade dindrepturi” prin suprapunerea „informatorilor”. Eseu Moromeţii de Marin PredaPregătit de proza scurtă din volumul de debut „Întâlnirea dinpământuri”, primul roman scris de Marin Preda, „Moromeţii”, este alcătuitdin două volume, publicate la doisprezece ani distanţă, în 1955, respectiv1967.");
                                                                         i = 4;
                                                                     }
                                                                     if (menuItem.getTitle().equals("O scrisoare pierduta")) {
                                                                         titlu.setText("O scrisoare pierduta");
                                                                         eseu.setText("Lucrarea O scrisoare pierduta de Ion Luca Caragiale este o comediein 4 acte si evoca viata publica si de familie de la sfarsitul secoluluitrecut. Tema ei este demascarea prostiei umane si a coruptieipublice si private, inscriindu-se intre comediile de moravuri sicaracter. Titlul comediei este expresiv , sugerand inca de la inceputmotivul in jurul caruia se va desfasura actiunea: pierderea uneiscrisori de amor care va cauza izbucnirea unei intregi zarve inpolitica. In scena 1 a primului act, autorul ne infatiseaza personajul principal,Stefan Tipatescu, prefectul unui judet montan care poarta o discutieaprinsa cu Ghita Pristanda, politistul orasului, despre alegerile careau loc peste cateva zile. Vazand ca Fanica, prefectul, este foarteagitat deoarece are un adversar puternic la candidatura , pe NaeCatavencu, Pristanda doreste sa se faca placut domnului Tipatescu,povestindu-i o discutie auzita pe furis intre Nae Catavencu sidascalimea orasului in timp ce acestia sunt la un joc de carti. Aceastadiscutie are ca subiect pe domnul Tipatescu si o anumita scrisoarepe care domnul Catavencu doreste sa o faca publica.");
                                                                         i = 5;
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
                if (i == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Mihai_Eminescu"));
                    startActivity(intent);
                }
                if(i == 2){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Ion_Creang%C4%83"));
                    startActivity(intent);
                }
                if(i == 3){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Liviu_Rebreanu"));
                    startActivity(intent);
                }
                if(i == 4){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Marin_Preda"));
                    startActivity(intent);
                }
                if(i == 5){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Ion_Luca_Caragiale"));
                    startActivity(intent);
                }
            }
        });
    }
}