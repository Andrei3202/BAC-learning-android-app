package com.example.proiectfinal;

public class RaspunsuriRo {
    public String vectIntreb[]={
            "Ce fel de opera e Ion","Cine a scris Morometi","Cate srofe are Luceafarul","Care e personajul principal din Ion","Cate acte are o Scrisoare pierduta?"
    };
    public String vectRasp[][]={
            {"basm","doina","nuvela","roman"},
            {"Marin Preda","Mihai Eminescu","Ion Creanga","Ion Luca Caragiale"},
            {"1","98","27","97"},
            {"Ion","Alina","Florica","Fiul de imparat"},
            {"2","1","3","4"}
    };
    public String raspCorecte[]={"roman","Marin Preda","98","Ion","4"};
    public String getIntrebare(int i){
        return vectIntreb[i];
    }
    public String getRaspA(int i){
        return vectRasp[i][0];
    }
    public String getRaspB(int i){
        return vectRasp[i][1];
    }
    public String getRaspC(int i){
        return vectRasp[i][2];
    }
    public String getRaspD(int i){
        return vectRasp[i][3];
    }
    public String getRaspCorect(int i){
        return raspCorecte[i];
    }
}
