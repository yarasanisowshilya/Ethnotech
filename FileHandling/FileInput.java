package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting File");

        String path="C:\\Users\\DELL\\OneDrive\\Documents\\JAVA\\Day01\\src\\FileHandling\\test2.txt";
        File f1=new File(path);//Before creation of file ,path should be created.
        FileWriter fw=new FileWriter(f1,true);
        BufferedWriter bw=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        bw.newLine();
        bw.write(inp);

        bw.close();
        fw.close();

    }
}
