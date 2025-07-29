import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int csold=sc.nextInt();
        int ecopy=sc.nextInt();
        int cspent=sc.nextInt();
        int profit = (ecopy*csold - cspent*csold)-100;
        System.out.println("Number of copies sold:"+csold);
        System.out.println("Cost of each copy:"+ecopy);
        System.out.println("Cost spent by agency on each newspaper:"+cspent);
        System.out.printf("The profit obtained is Rs."+profit+".00");
        
        
    }
}
