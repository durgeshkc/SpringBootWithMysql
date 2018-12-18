import java.util.Scanner;
import java.io.*;
public class Sixth {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        if ((ch >= 65 && ch <= 90))
            System.out.println ( " Upper Case ");

        if ((ch >= 97 && ch <= 122))
            System.out.println ( " Lower Case ");
            // CHECKING FOR DIGITS
        else if (ch >= 48 && ch <= 57)
            System.out.println(" Digit ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println ( " Special Character ");
    }


}
