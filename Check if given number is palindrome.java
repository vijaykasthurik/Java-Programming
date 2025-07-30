import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int cout=0;
        int revnn=n;
        while (n>0){
             rev=rev*10;
            rev+=n%10;
            n=n/10;
            cout+=1;
        }
       int revn=rev;
        if(cout==3){
           if(revnn==revn){
               System.out.println("palindrome");
           }else{
               System.out.println("not palindrome");
           }
        }else{
                System.out.println("Invalid Input");
            }
    }
}
