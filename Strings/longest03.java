package Strings;

import java.util.*;
public class longest03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen[]=sc.nextLine().split(" ");
        int max=0;
       // String longest=" ";
        StringBuilder longest=new StringBuilder();
        for(int i=0;i<sen.length;i++)
        {
            String ch=sen[i];
            int length=ch.length();
            if(length>max)
            {
                max=length;
                longest.setLength(0);
                longest.append(ch);
                //longest=s;
            }
        }
        System.out.println(longest);
    }
}
