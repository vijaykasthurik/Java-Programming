import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s==0){
            System.out.println("zero");
        }else if(s<0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
    }
}
