
package DBEngine;
import java.io.*;

public class DBEngine {
    public void saveFile(String fileName, Object obj) throws Exception {
        FileOutputStream fo = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(obj);
        fo.close();
        oos.close();
    }
    
    public Object readFile(String fileName) throws Exception {
        Object kq = null;
        FileInputStream fi = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fi);
        kq = ois.readObject();
        return kq;
    }
}
