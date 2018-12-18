import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class Seventh {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String [] tokens = sc.nextLine().split("\\s");

        int flag=1;
        for (int i = 0; i < tokens.length; i++)
        {
            try
            {
//                Integer.parseInt(input);
                numbers.add(Integer.parseInt(tokens[i]));
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Error! Invalid Input");
                flag=0;
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);   // reverse order
        System.out.println(numbers);

        if(flag==1)
        {
            int total = 0;
            for (int element : numbers)
            {
                if(element%2==0)
                total = total + element;
            }
            System.out.println("Sum of Even Numbers is= " + total);
            if(total>15)
                System.out.println("True");
            else
                System.out.println("False");
        }


    }

}
