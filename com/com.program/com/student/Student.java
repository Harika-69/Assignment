package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Student {
    public static int rollNumber;
    public String name;
    public int age;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 101;
        s1.name = "Sonoo";
        s1.age = 23;
        Student s2 = new Student();
        s2.rollNumber = 102;
        s2.name = "Ravi";
        s2.age = 21;
        Student s3 = new Student();
        s3.rollNumber = 103;
        s3.name = "Hanumat";
        s3.age = 25;
        List<String> list = new ArrayList<String>();
        list.add("Sonoo");
        list.add("Ravi");
        list.add("Hanumat");
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("23");
        list.add("21");
        list.add("25");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String obj = (String) it.next();
            System.out.println(obj);
        }
        Collections.sort(list);
        System.out.println("Sorted List:" + list);
        for (int i = 101; i <= 103; i++)
            if (i % 2 == 0) {
                System.out.println(i + "Is Even Number");
            } else {
                System.out.println(i + "is odd number");
            }
    }
}
