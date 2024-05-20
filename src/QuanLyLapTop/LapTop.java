package QuanLyLapTop;

import java.util.ArrayList;


public class LapTop {
    private int id;
    private String name;
    private String color;
    private String type;
    private int year;
    private int number;
    private int price;
    private String chip;
    private String ram;

    public LapTop() {
    }

    public LapTop(int id, String name, String color, String type, int year, int number, int price,String chip,String ram) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.type = type;
        this.year = year;
        this.number = number;
        this.price = price;
        this.chip = chip;
        this.ram = ram;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
       // return "LapTop{" + "id=" + id + ", name=" + name + ", color=" + color + ", type=" + type + ", year=" + year + ", number=" + number + ", price=" + price + ", chip=" + chip + ", ram=" + ram + '}';
        return "ID: "+id+"\tModel: "+name+"\tColor: "+color+"\tType: "+type+"\tYear: "+year+"\tNumber: "+number+"\tPrice: "+price+"\n";
    }
     public static ArrayList<LapTop> generatedLapTop(int n){
        String[] Name = {"Lenovo","Asus","Dell","Acer","Legion","Macbook"};
        String[] Color = {"Black","White","Red","Gray"};
        String[] Type = {"Van Phong", "Gaming"};
        String[] Chip = {"R3", "R5","R7","I3","I5","I7"};
        String[] Ram = {"4G", "8G","16G"};
        ArrayList<LapTop> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int id = (i+1);
            String name = Name[(int)(Math.random() * Name.length)];
            String color = Color[(int) (Math.random() * Color.length)];
            String type = Type[(int) (Math.random() * Type.length)];
            int year = ((int)(Math.random()*7))+2016;
            int number = (int) ((Math.random()*50)+1);
            int price =  ((int)((Math.random() * 15)+1)*100000);
            String chip = Chip[(int)(Math.random() * Chip.length)];
            String ram = Ram[(int)(Math.random() * Ram.length)];
            LapTop m = new LapTop(id,name,color,type,year,number,price,chip,ram);
            list.add(m);
        }
        return list;
    }

}
