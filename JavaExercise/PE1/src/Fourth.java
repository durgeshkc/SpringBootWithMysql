import java.util.Scanner;
import java.io.*;

public class Fourth {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int j=i;
            while(j>0)
            {
                System.out.println(temp+"");
                j--;
            }
        }

    }

}
