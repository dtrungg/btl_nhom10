package QuanLyTablet;

import java.util.ArrayList;


public class Tablet {
    private int id;
    private String name;
    private String color;
    private String company;
    private int year;
    private int number;
    private int price;
    private String chip;
    private String ram;
    private String screen;

    public Tablet() {
    }

    public Tablet(int id, String name, String color, String company, int year, int number, int price, String chip, String ram, String screen) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.company = company;
        this.year = year;
        this.number = number;
        this.price = price;
        this.chip = chip;
        this.ram = ram;
        this.screen = screen;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
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
        return "\tId:" + id + "\tname:" + name + "\tcolor:" + color + "\tcompany:" + company + "\tyear:" + year + "\tnumber:" + number + "\tprice:" + price + "\tchip:" + chip + "\tram:" + ram + "\tscreen:" + screen+"\n";
    }
    

     public static ArrayList<Tablet> generatedTablet(int n){
        String[] Name = {"Samsung Galaxy Tab S8","Samsung Galaxy Tab S8 Lite","Samsung Galaxy Tab S7","Ipad Pro 11","Ipad Air 5","Xiaomi Pad 5", "Oppo Pad Air", "Huawei Mate 10"};
        String[] Color = {"Đen", "Xanh", "Đỏ", "Vàng", "Trắng"};
        String[] Type = {"Samsung", "Apple", "Xiaomi", "Oppo", "Huawei"};
        String[] Chip = {"Snapdragon", "Apple M1", "Apple M2"};
        String[] Ram = {"4GB", "6GB", "8GB","12GB"};
        String[] Screen = {"7 Inch", " 8.5 Inch", "10 Inch", "10.5 Inch"};
        ArrayList<Tablet> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int id = (i+1);
            String name = Name[(int)(Math.random() * Name.length)];
            String color = Color[(int) (Math.random() * Color.length)];
            String company = Type[(int) (Math.random() * Type.length)];
            int year = ((int)(Math.random()*7))+2016;
            int number = (int) ((Math.random()*50)+1);
            int price =  ((int)((Math.random() * 15)+1)*100000);
            String chip = Chip[(int)(Math.random() * Chip.length)];
            String ram = Ram[(int)(Math.random() * Ram.length)];
            String screen = Screen[(int)(Math.random() * Screen.length)];
            Tablet m = new Tablet(id, name, color, company, year, number, price, chip, ram, screen);
            list.add(m);
        }
        return list;
    }
}
