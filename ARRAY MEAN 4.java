import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        float avg=sum/n;
        System.out.printf("Array Mean Value is %.2f",avg);
    }
}
