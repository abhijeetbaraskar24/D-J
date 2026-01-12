package day1;
import java.util.*;
public class MONTHS {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of month : ");
        int Month = sc.nextInt();

        switch(Month)
        {
            case 1 :
                System.out.println("JAN");
            break;
            case 2:
                System.out.println("FEB");
                break;
            case 3 :
                System.out.println("MARCH");
                break;
            case 4 :
                System.out.println("APRIL");
                break;
            case 5 :
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7 :
                System.out.println("JULY");
                break;
            case 8 :
                System.out.println("AUG");
                break;
            case 9 :
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11 :
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("enter valid no from 1 to 12 !!");

        }
    }
}
