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
        int find=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
               flag=1;
                break;
            }
        }if(flag!=0){
            System.out.printf("%d is presented in an array.",find);
            
        }
            else{
                System.out.printf("%d is not presented in an array.",find);
                
            }
        
        
    }
}
