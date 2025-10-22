package com.example.proiectfinal;

public class RaspunsuriInfo {
    public String vectIntreb[]={
            "in ce an a fost inventat calculatorul?","In ce an a aparut c++?","Cand a aparut primul joc video?","Care nu e un imbaj de programare?","care for e corect?"
    };
    public String vectRasp[][]={
            {"1947","2000","1924","1952"},
            {"2019","1979","1899","1977"},
            {"1956","1926","2001","1958"},
            {"C++","C","C#","C--"},
            {"for[i=1;i<n;i++]","for[i=1,i<n,i++]","for(i=1;i<n;i++)","for(i=1,i<n,i++)"}
    };
    public String raspCorecte[]={"1947","1979","1958","C--","for(i=1;i<n;i++)"};
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
