package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {
    public static void main(String args[]){
        int n = 5;
        if(n%5==0)                         //whether given integer is multiple of 5 or not
            System.out.println("Multiple of 5");
         else

             System.out.println("Is not a multiple of 5");
         if((n%5==0)&(n%7==0))                // integer is multiple with 5 & 7 or not
             System.out.println("\n num is multiple of 5 and 7");
           else
               System.out.println("\n It is not multiple of 5 and 7");
           for(int i=10;i<=50;i++){          //multiple of 3 within range 10-50
               if(i%3==0)
                   System.out.println(i+",");
           }
        List<String> list=new ArrayList<>();
        list.add("hari");
        list.add("nikki");
        list.add("reshu");
        list.add("siri");
        System.out.println(list);
        List<String> list1=new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        System.out.println("list1:"+list1);
        List<String> list2=new ArrayList<>();
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");
        System.out.println("list2:"+list2);
        int index;                               //removing 3rd element in list
        int i = 2;
        list.remove(2);
        System.out.println("removing third element in the list:\n"+list);
        list.set(2,"moini");                      //search the element in list
        System.out.println(list);
        int num = list.size();                    //position of list of element
        for (index=0;index<num;index++)
            System.out.println(list.get(index));
        boolean str= list.isEmpty();                //list is empty or not
        if (str==false)
            System.out.println("list is empty");
        else
            System.out.println("list is not empty");
        Collections.copy(list1,list2);                  //copying 1 to another
        System.out.println("Copying list2 to list1,\nAfter copying");
        System.out.println("list2:"+list2);
        System.out.println("list1:"+list1);
        boolean values= list1.equals(list2);            //compare 2 arraylist
        System.out.println(values);
    }
}
