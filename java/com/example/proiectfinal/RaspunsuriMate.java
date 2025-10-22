package com.example.proiectfinal;

public class RaspunsuriMate {
    public String vectIntreb[]={
            "Cat este derivata de x?","derivata de x^n?","derivata de a^x?","derivata de lnx","derivata de e^x?"
    };
    public String vectRasp[][]={
            {"1","x+x","x*3","x^2"},
            {"x^n","n*x^(n-1)","x-n","n*x"},
            {"(a^x)*lna","lna","x^a","lna*x"},
            {"x","lnx","2x","1/x"},
            {"e*x","e^x","lnx","e^2x"}
    };
    public String raspCorecte[]={"1","n*x^(n-1)","(a^x)*lna","1/x","e^x"};
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
