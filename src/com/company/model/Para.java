package com.company.model;

public class Para extends  Fruct {
    private int nrSeminte;
    public Para(String culoare,String denumire,int greutate,int nrSeminte){
        super(culoare,"para",greutate);
        this.nrSeminte=nrSeminte;

    }

    public Para(String line){
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
