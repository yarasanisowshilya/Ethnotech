package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting File");
        String path="C:\\Users\\DELL\\OneDrive\\Documents\\JAVA\\Day01\\src\\FileHandling\\test2.txt";
        File f1=new File(path);//Before creation of file ,path should be created.
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        int ch;
        int count=0;
        while((ch=br.read())!=-1)
        {
            System.out.print((char) ch);
            count++;
        }
        System.out.println(count);
        br.close();
        fr.close();
    }
}
