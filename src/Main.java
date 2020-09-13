import java.util.Scanner;

import static java.lang.StrictMath.log;
import static java.lang.StrictMath.pow;


public class Main
{
    public static void main(String[] args)
    {
        //Creates Scanner object and Converter class object
        Scanner sc = new Scanner(System.in);
        Converter c = new Converter();
        
        //Asks which type of number the user wanna convert
        System.out.println("Do you wanna convert from: \n1. Binary number? \n2. Decimal number?");
        String str = sc.nextLine();
        
        //Check which type of number the user has entered in the terminal
        if(str.equalsIgnoreCase("binary") || str.equals("1"))
        {
            System.out.println("Type a binary number");
            int binary = sc.nextInt();

            if(String.valueOf(binary).charAt(0) == '1')
            {
                System.out.println("Test1");
            }
            else if(String.valueOf(binary).charAt(0) == '0')
            {
                System.out.println("Test2");
            }

            // printer resultat af metodekaldet.
            System.out.println(c.binaryToDecimal(binary));

        }
        else if(str.equalsIgnoreCase("decimal") || str.equals("2"))
        {
            System.out.println("type a positive decimal number");
            int decimal = sc.nextInt();
            if(decimal<0)
            {
                System.out.println("Error, not a positive number");
            }
            else
            {
                System.out.println(c.decimalToBinary(decimal));
            }
        }
        else
        {
            System.out.println("You have to choose between 'decimal or binary' ");
        }
    }
}
