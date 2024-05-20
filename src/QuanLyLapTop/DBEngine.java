package QuanLyLapTop;


import java.io.FileWriter;


public class DBEngine {
    public void saveFile(String fileName, LapTop obj) throws Exception {
        
        FileWriter fw = new FileWriter(fileName,true);
        //String value = String.format("%10d%10s%10s%10s%10d%10d%10d\n",obj.getId(),obj.getName(),obj.getColor(),obj.getType(),obj.getYear(),obj.getNumber(),obj.getPrice());
        fw.write(obj.toString());
        fw.close();
    }
    
    
}
