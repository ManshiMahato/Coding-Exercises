import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();

        if(n<0)
        {
            System.out.println("Negative numbers are not considered.");
        }
        else
        {
            int fact = 1;
            for(int i =1; i<=n; i++)
            {
                fact *=i;
            }
            System.out.println("The factorial of the " +n+ " is " +fact);
        }

        

    }
    
}
