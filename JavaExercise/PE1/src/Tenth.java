import java.util.Scanner;
import java.io.*;
public class Tenth {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        int input2 = sc.nextInt();
        char[] temp = input1.toCharArray();

        String newString=input1;
        String lastNCharacters="";
        int n=temp.length-input2;

        for(int i=n;i<=temp.length-1;i++)
        {
            lastNCharacters=lastNCharacters+temp[i];
        }

        for(int j=1;j<=n;j++)
        {
            newString=newString+lastNCharacters;
        }

        System.out.println(newString);
    }
}
