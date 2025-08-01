import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
                }
            }
           count++;
        if(count>1){
            System.out.printf("There are %d distinct elements in the array.",count);
        }else{
            System.out.printf("There are %d distinct element in the array.",count);
        }
    }
}
