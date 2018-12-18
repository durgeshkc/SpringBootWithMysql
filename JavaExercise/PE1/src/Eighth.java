import java.util.Scanner;
import java.io.*;
public class Eighth {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int limit=50,input;
        do {
            input=sc.nextInt();

            if (input < limit) {
                System.out.println("The number guessed is less than original number");
            }
            else if (input > limit) {
                System.out.println("The number guessed is more than original number");
            }

        }while(limit!=input);

        System.out.println("Number guessed matches the original number");

    }
}
