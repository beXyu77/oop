package OOP.Lab4;

import java.util.*;
public class DateTest {
    public static void main(String[] args){
        Date mydate = new Date();
        mydate.setTime(10000);
        System.out.println(mydate.toString());
        mydate.setTime(100000);
        System.out.println(mydate.toString());
        mydate.setTime(1000000);
        System.out.println(mydate.toString());
        mydate.setTime(10000000);
        System.out.println(mydate.toString());
        mydate.setTime(100000000);
        System.out.println(mydate.toString());
        mydate.setTime(1000000000);
        System.out.println(mydate.toString());
        mydate.setTime(10000000000L);
        System.out.println(mydate.toString());
        mydate.setTime(100000000000L);
        System.out.println(mydate.toString());
    }
}