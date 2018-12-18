import java.util.Scanner;
import java.io.*;

public class Second {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if ((num % 2 != 0) && (num > 20 && num < 30))
        {
            System.out.println("Tom");
        }
        if ((num % 2 == 0) && (num > 20 && num < 30)) {
            System.out.println("Jerry");
        }
    }
}

