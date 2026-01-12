package day1;

import java.util.*;

public class IFELSE
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int a= sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b= sc.nextInt();

        if(a == b)
        {
            System.out.println("numbers are same");
        }
        else if (a > b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("a is smaller than b");
        }
    }
}
