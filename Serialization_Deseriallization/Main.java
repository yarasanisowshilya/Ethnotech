package Serialization_Deseriallization;

import FileHandling.FileByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
      SER ser=new SER(1,"sowshilya");//Get the data
        ser.display();
        String path="C:\\Users\\DELL\\OneDrive\\Documents\\JAVA\\Day01\\src\\Serialization_Deseriallization\\f1.txt";
        FileOutputStream fos=new FileOutputStream(path);//Give the write permission
        ObjectOutputStream oos =new ObjectOutputStream(fos);//to Convert into the BYtes
        oos.writeObject(ser);//write and store
        oos.close();
        fos.close();
    }
}
