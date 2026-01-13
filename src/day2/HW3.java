package day2;

import java.util.*;

public class HW3
{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int val;
        do {

                System.out.println("enter the value of val : ");
                val = sc.nextInt();
                if (val == 1)
                    {

                        System.out.println("enter the marks of sub: ");
                        int marks = sc.nextInt();
                            {

                                if (marks >= 90)
                                     {
                                        System.out.println("Marks are good");
                                     }
                                else if (marks >=60 && marks<=89)
                                    {
                                        System.out.println("this are also good");
                                    }
                                else
                                    {
                                        System.out.println("this is good also");
                                    }
                                System.out.println("at the end marks doesnt matter ur effort does");
                            }
                    }
                else
                    {
                        System.out.printf("exit");
                    }
        }while(val !=0);
    }

}
