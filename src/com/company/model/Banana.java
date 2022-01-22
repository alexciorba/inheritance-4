package com.company.model;

public class Banana extends  Fruct{
     private  int nrSeminte;
     public Banana(String culoare,String denumire,int greutate,int nrSeminte){
        super(culoare,"mar",greutate);
        this.nrSeminte=nrSeminte;

    }
    public Banana(String line){
        super(line);
        this.nrSeminte=Integer.parseInt(line.split(",")[3]);


    }

    public int getNrSeminte() {
        return nrSeminte;
    }

    @Override
    public String toSave(){
        String text=super.toSave();
        text+="," + nrSeminte;
        return text;
    }
}
