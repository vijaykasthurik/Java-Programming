import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        if(m>n && n>0 && m>0 && m<30 && n<30){
            for(int i=n;i<=m;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
            System.out.println(sum);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
