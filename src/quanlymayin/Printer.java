/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlymayin;

import java.util.ArrayList;

/**
 *
 * @author pc1
 */
public class Printer {
    private int id;
    private String name;
    private String manufacturer;
    private String type;
    private int year;
    private int number;
    private int price;

    public Printer() {
    }

    public Printer(int id, String name, String manufacturer, String type, int year, int number, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.number = number;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "ID: "+id+"\tModel: "+name+"\tManufacture: "+manufacturer+"\tType: "+type+"\tYear: "+year+"\tNumber: "+number+"\tPrice: "+price+"\n";
    }
 
    public static ArrayList<Printer> generatedPrinter(int n){
        String[] Name = {"HL-B2180DW","4ZB97A","P2516","IX6770","G1020","L3250","HL-B2100D","MF272dw"};
        String[] Manufacture = {"Canon","Brother","HP","Epson"};
        String[] Type = {"In mau", "In den trang","In laser"};
        ArrayList<Printer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int id = (i+1);
            String name = Name[(int)(Math.random() * Name.length)];
            String manufacture = Manufacture[(int) (Math.random() * Manufacture.length)];
            String type = Type[(int) (Math.random() * Type.length)];
            int year = ((int)(Math.random()*7))+2016;
            int number = (int) ((Math.random()*50)+1);
            int price =  ((int)((Math.random() * 15)+1)*100000);
            Printer p = new Printer(id,name,manufacture,type,year,number,price);
            list.add(p);
        }
        return list;
    }
    
}
