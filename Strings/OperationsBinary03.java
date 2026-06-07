package Strings;

import java.util.*;
public class OperationsBinary03 {
   public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Binary=sc.nextLine();
        int result=Binary.charAt(0)-'0';
        for(int i=1;i<Binary.length();i+=2)
        {
            int  value=Binary.charAt(i+1)-'0';
            char ch=Binary.charAt(i);
            if(ch=='C')
            {
                result=result^value;
            }


            else if(ch=='A')
            {
                result=result & value;
            }
            else if(ch=='B'){
                result=result | value;
            }
        }
        System.out.println(result);
    }
}

