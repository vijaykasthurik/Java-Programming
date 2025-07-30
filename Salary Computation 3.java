import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int basic=sc.nextInt();
        double hra,da;
        if(basic<15000){
             hra=0.15*basic;
             da=0.9*basic;
        }else{
            hra=5000;
            da=0.98*basic;
        }
        double gross=basic+hra+da;
        System.out.printf("%.2f",gross);
    }
}
