import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int deposit=sc.nextInt();
        int input=sc.nextInt();
        switch(input){
            case 1:
                int d1=sc.nextInt();
                System.out.println(deposit+d1);
                break;
            case 2:
                int with=sc.nextInt();
                if(with>deposit){
                    System.out.println("Insufficient Balance");
                }else{
                    System.out.println(deposit-with);
                }
                break;
            case 3:
                System.out.println("Invalid Input");
                break;
                }
        }
        
}
