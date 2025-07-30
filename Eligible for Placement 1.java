import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String name=n.nextLine();
        int arrer=n.nextInt();
        int cgpa=n.nextInt();
        System.out.println("Name of the Student:"+name);
        if(arrer==1 && cgpa>70){
            System.out.println(name+" is Eligible for Placement");
            
        }else if(arrer==1 || arrer==2 && cgpa>75){
            System.out.println(name+" is Eligible for Placement");
        }else{
            System.out.println(name+" is Not Eligible for Placement");
        }
    }
}
