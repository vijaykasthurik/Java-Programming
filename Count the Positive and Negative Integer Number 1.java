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
        float count=0;
        float count2=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                count+=1;
            }else{
                count2+=1;
            }
        }
        System.out.printf("Count of Positive Integer is %.2f\n",count);
        System.out.printf("Count of Negative Integer is %.2f\n",count2);
    }
}
