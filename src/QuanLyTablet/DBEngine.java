package QuanLyTablet;


import java.io.FileWriter;


public class DBEngine {
    public void saveFile(String fileName, Tablet obj) throws Exception {
        
        FileWriter fw = new FileWriter(fileName,true);
        //String value = String.format("%5d %5s %5s %5s %5d %5d %5d %5s %5s %5s\n",obj.getId(),obj.getName(),obj.getColor(),obj.getCompany(),obj.getYear(),obj.getNumber(),obj.getPrice()
                //,obj.getChip(),obj.getRam(),obj.getScreen());
        fw.write(obj.toString());
        fw.close();
    }
    
    
}
