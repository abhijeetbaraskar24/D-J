package day2;
 import java.util.*;


public class HW1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int i;
        System.out.println("enter the value of n : ");
        int n= sc.nextInt();

        for(i=0; i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" , ");
            }


        }

    }
}
