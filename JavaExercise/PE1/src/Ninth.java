import java.util.Scanner;
import java.io.*;
public class Ninth {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str=sc.next();
        char [] temp=str.toCharArray();
        String rev="";

        for(int i=temp.length-1;i>=0;i--)
        {
            rev=rev+temp[i];
        }

        System.out.println(rev);
    }
}