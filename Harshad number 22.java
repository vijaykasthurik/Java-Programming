import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int div=num;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        if(div%sum==0){
            System.out.println("Harshad Number");
            
        }else{
            System.out.println("Not Harshad Number");
        }
    }
}
