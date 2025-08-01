import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int arr[][]=new int[n][n1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
          for (int j = 0; j < n1; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <n; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Maximum value in column " + (j + 1) + " is " + max);
        }
        
    }
}
