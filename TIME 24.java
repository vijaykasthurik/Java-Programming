import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int min=sc.nextInt();
        int sec=sc.nextInt();
        min += sec / 60;
        sec = sec % 60;

        
        hour += min/ 60;
        min = min % 60;
        
        System.out.println("Total Number of hours is " + hour);
        
        System.out.println("Total Number of minutes is "+ min);
        System.out.println("Total Number of seconds is "+sec);
        
    }
}
