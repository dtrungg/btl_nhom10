package quanlyphukien;

import java.util.ArrayList;

public class PhuKien {
    private int id;
    private String name;
    private String color;
    private String type;
    private int year;
    private int number;
    private int price;

    public PhuKien(){
        
    }

    public PhuKien(int id, String name, String color, String type, int year, int number, int price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.type = type;
        this.year = year;
        this.number = number;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "ID: "+id+"\tModel: "+name+"\tColor: "+color+"\tType: "+type+"\tYear: "+year+"\tNumber: "+number+"\tPrice: "+price+"\n";
    }
    
    public static ArrayList<PhuKien> generatedPhuKien(int n){
        String[] Name = {"Logitech","Razer","Steelseries","Zowie","Asus","Crosshair","Fulhen","HyperX"};
        String[] Color = {"Black","White","Red","Blue"};
        String[] Type = {"Chuot", "Ban Phim","Tai nghe"};

        ArrayList<PhuKien> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int id = (i+1);
            String name = Name[(int)(Math.random() * Name.length)];
            String color = Color[(int) (Math.random() * Color.length)];
            String type = Type[(int) (Math.random() * Type.length)];
            int year = ((int)(Math.random()*7))+2016;
            int number = (int) ((Math.random()*50)+1);
            int price =  ((int)((Math.random() * 15)+1)*100000);
            PhuKien m = new PhuKien(id,name,color,type,year,number,price);
            list.add(m);
        }
        return list;
    }

}
