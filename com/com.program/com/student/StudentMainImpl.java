package com.student;

import java.util.*;

import static java.util.Collection.*;

public class StudentServiceImpl {
 public void Student(int rollNumber,String studentName,int age) {
     Student s1 = new Student(101, "Sonoo", 23);
     Student s2 = new Student(102, "Ravi", 21);
     Student s3 = new Student(103, "Hanumat",25);
     Student s4 = new Student(104, "Hari",24);
     Student s5 =  new Student(105, "Nikki",22);
     Student s6 = new Student(106, "Siri",20);
     List<Student> list = new ArrayList<>();
     list.add(s1);
     list.add(s2);
     list.add(s3);
     list.add(s4);
     list.add(s5);
     list.add(s6);
     Collections.sort(list,new nameComparator());
     System.out.println("\n Sorting based on names");
 }




}
