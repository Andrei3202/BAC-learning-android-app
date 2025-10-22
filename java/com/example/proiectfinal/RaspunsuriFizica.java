package com.example.proiectfinal;

public class RaspunsuriFizica {
    public String vectIntreb[]={
            "Care este formula fortei de frecare?","care este formula fortei de greutate?","formula fortei elastice?","formula densitati?","formula puterei mecanice?"
    };
    public String vectRasp[][]={
            {"u*N","u*u","N*G","N+u"},
            {"m-g","m/g","m*g","m+g"},
            {"delta l/k","k/delta l","k-G","delta l*k"},
            {"m/v","m*v","m+v","m-v"},
            {"L*t","L/t","L-t","L+t"}
    };
    public String raspCorecte[]={"u*N","m*g","delta l*k","m/v","L/t"};
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
