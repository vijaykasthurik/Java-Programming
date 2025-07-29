import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int a1=a.nextInt();
        int a2=a.nextInt();
        int b=a.nextInt();
        int c=a.nextInt();
        int d=a.nextInt();
        double area =0.5*(a1*a2);
        float perimeter = (b+c)+d;
        System.out.printf("Area of Triangle is %.2f\n",area);
        System.out.printf("Perimeter of Triangle is %.2f",perimeter);
    }
}
