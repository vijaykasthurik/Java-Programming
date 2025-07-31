import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arm=0;
        if(n>99 && n<1000){
            int num=n;
            while(num!=0){
                int digit=num%10;
                arm=arm+(int)Math.pow(digit,3);
                num=num/10;
                 
            }
            
            if(arm==n){
            System.out.println("Yes");
            }
            
        }
        else{
            System.out.println("No");
            }
    }
}
