package day1;
import java.util.*;
public class Calcultor {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of a : ");
        int a= sc.nextInt();

        System.out.println("enter the value of b : ");
        int b= sc.nextInt();

        System.out.println("enter the no of operation : ");
        int op = sc.nextInt();

        switch(op)
        {
            case 1:
                int sum=a+b;
                System.out.println("addition is : " + sum);
            break;

            case 2:
                int sub=a-b;
                System.out.println("sub of no's is : " + sub);
            break;

            case 3:
                int mul=a*b;
                System.out.println("Mul: " + mul);
            break;

            case 4:
                int div=a/b;
                System.out.println("division is : " + div);
            break;
            default:
                System.out.println("ENTER VALID CHOICE");


        }
    }
}
