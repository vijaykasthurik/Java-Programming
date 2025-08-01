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
        int find=sc.nextInt(),pos=-1;
        for(int i=0;i<arr.length;i++){
            if(find==arr[i]){
               pos=i;
                break;
               
            }
                
            }
        if(pos!=-1){
             System.out.printf("Door Number is 00"+pos+"-DN");
        }else{
            System.out.println("-1");
        }
           
        }
}
