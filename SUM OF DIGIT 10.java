import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        
        if(num>99){
            int or=num;
            while(or!=0){
                int digit=or%10;
                sum+=digit;
                or/=10;
            }
            
            System.out.println("Sum of digit is "+sum);
            
        }else{
            System.out.println("Invalid Input");
        }
           
        }
    }
