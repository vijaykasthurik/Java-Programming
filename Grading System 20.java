import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        double avg=(float)total/5;
        System.out.println("Name of the Student:"+name);
        System.out.println("Total Mark:"+total);
        System.out.printf("Average Mark:%.1f\n",avg);
        if(avg==100){
            System.out.println("Grade Mark:S");
        }else if(avg>=90 && avg<100){
            System.out.println("Grade Mark:A");
        }else if(avg>=80 && avg<=89){
            System.out.println("Grade Mark:B");
        }else if(avg>=70 && avg<=79){
            System.out.println("Grade Mark:C");
        }else if(avg>=60 && avg<=69){
            System.out.println("Grade Mark:D");
        }else if(avg>=50 && avg<=59){
            System.out.println("Grade Mark:E");
        }else{
            System.out.println("Grade Mark:Fail");
        }
    }
}
