package com.company.controller;

import com.company.model.Banana;
import com.company.model.Fruct;
import com.company.model.Mar;
import com.company.model.Para;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Fruct>listaFructe;

    public Controller(){
        listaFructe=new ArrayList<>();
        load();
    }

    public void load() {
        try {
            File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model4\\src\\com\\company\\source\\fructe.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String linie=scanner.nextLine();
                switch (linie.split(",")[3]){
                    case "mar":this.listaFructe.add(new Mar(linie));
                        break;
                    case  "para" : this.listaFructe.add(new Para(linie));
                        break;
                    case "banana" : this.listaFructe.add(new Banana(linie));

                }
            }

        }catch (Exception e){

        }
    }
        public String toSaveFruct(){
            String text="";
            for(Fruct fruct :listaFructe){
                text+=fruct.toSave()+"\n";
            }
            return text;
        }

    public void savePersoana(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model4\\src\\com\\company\\source\\fructe.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveFruct());
            printWriter.close();
        }catch (Exception e){

        }
    }
}
