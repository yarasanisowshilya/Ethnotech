package Serialization_Deseriallization;

import java.io.*;

public class DES {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\DELL\\OneDrive\\Documents\\JAVA\\Day01\\src\\Serialization_Deseriallization\\f1.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        SER ser=(SER)ois.readObject();
        ser.display();
        ois.close();
        fis.close();
    }
}
