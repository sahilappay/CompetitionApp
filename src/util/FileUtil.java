package util;

import java.io.*;


public class FileUtil {
    public static void writeObjectToFile(Object object, String name) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream(name);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(object);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object readObjectFromFile(String name) throws Exception{
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        }finally {
            return obj;
        }
    }
}
