import java.util.Scanner;
public class Largestno {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int r =sc.nextInt();

        int ar[];
        ar=new int[r];
        System.out.println("Enter the array elements:");

        for(int i=1; i<r; i++)
        {
             ar[i]=sc.nextInt();
          
        }
        
        int max=ar[0];
        for(int i=1; i<r; i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println("The largest number is:" +max);
        sc.close();


    }
    
}
