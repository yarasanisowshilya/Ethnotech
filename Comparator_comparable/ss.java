package Comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Students {
    int RollNo;
    String name;

    public Students(int rollNo, String name) {
        RollNo = rollNo;
        this.name = name;
    }
}

public class  ss{

    public static void main(String[] args) {
        ArrayList<Students>list=new ArrayList<>();
        list.add(new Students(10,"A"));
        list.add(new Students(9,"P"));
        list.add(new Students(12,"O"));
        list.add(new Students(5,"I"));
        list.add(new Students(90,"G"));
        Comparator<Students> com=new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.RollNo>o2.RollNo)
                {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(list,com);
        for (Students s:list)
        {
            System.out.println(s.name + " " + s.RollNo);
        }
    }
}
