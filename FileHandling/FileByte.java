package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileByte {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting File");
        String path="C:\\Users\\DELL\\OneDrive\\Documents\\JAVA\\Day01\\src\\FileHandling\\test1.txt";
        File f1=new File(path);//Before creation of file ,path should be created.
        File f2=new File("C:\\Users\\DELL\\OneDrive\\Documents\\JAVA\\Day01\\src\\FileHandling\\test2.txt");
        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos2=new FileOutputStream(f2);
        int ch;
        while((ch=fis1.read())!=-1)
        {
            System.out.print((char)ch);
            fos2.write(ch);
        }
        fis1.close();
        fos2.close();

    }
}
