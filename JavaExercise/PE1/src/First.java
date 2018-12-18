import java.util.Scanner;

public class First {
        public static void main(String args[]){

//        System.out.println("Hellooooo");
            Scanner sc = new Scanner(System.in);
            long number,rev=0,sum=0;
            number=sc.nextLong();
            long temp=number;
            while(number>0)
            {
                long r=number%10;
                if(r%2==0)
                    sum+=r;
                rev=rev*10+r;
                number=number/10;
            }

            if(rev==temp)
            {
                System.out.println("Palindrome");
                if(sum>25)
                {
                    System.out.println("Palindrome and sum is greater than 25");
                }
                else
                    System.out.println("Palindrome and sum is not greater than 25");
            }

            else
                System.out.println("Not Palindrome");
        }
}


