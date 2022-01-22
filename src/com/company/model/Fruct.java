package com.company.model;

public class Fruct {

    private String culoare;
    private String denumire;
    private int greutate;

    public Fruct(String culoare,String denumire,int greutate){
        this.culoare=culoare;
        this.denumire=denumire;
        this.greutate=greutate;
    }
    public Fruct(String line){
        this(line.split(",")[0],
                line.split(",")[1],
                Integer.parseInt(line.split(",")[2]));
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public int getGreutate() {
        return this.greutate;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public String descriereFruct(){
        String text="";
        text+="denumire : " + denumire + "\n";
        text+="culoare : " + culoare + "\n";
        text+="greutate : " + greutate + "\n";
         return text;
    }
    public String toSave(){
        String text=culoare + ","  +denumire + "," + greutate;
        return text;
    }
}
