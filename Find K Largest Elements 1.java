import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.print("The elements are in the order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The Kth value is " + k + " and Largest elements are ");
         for (int i = n - 1; i >= n - k; i--) {
            System.out.print(arr[i]+" ");
         }
      
        
    }
}
