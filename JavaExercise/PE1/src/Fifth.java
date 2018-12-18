import java.util.ArrayList;
import java.util.Scanner;

public class Fifth
{

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a list of numbers: ");

        String [] tokens = in.nextLine().split("\\s");
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

        if (numbers.size() == 0)
        {
            System.out.println("Sum=0.");

        }

        else
        {
            if(flag==1)
            {
                int total = 0;
                for (int element : numbers)
                {
                    total = total + element;
                }
//            double average = total / numbers.size();
                System.out.println("The total sum is: " + total);
            }


        }
    }
}
