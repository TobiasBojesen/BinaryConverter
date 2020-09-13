import java.util.Scanner;

import static java.lang.StrictMath.log;
import static java.lang.StrictMath.pow;


public class Main
{
    private static boolean run = true;
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
            while(run){
                System.out.println("Type a binary number");
                String binary = sc.nextLine();
                try {
                    String firstChar = binary.substring(0,1);
                    if(firstChar.equals("1"))
                    {
                        //System.out.println("Test1");


                        run = false;
                    }
                    else if(firstChar.equals("0"))
                    {
                        //System.out.println("Test2");
                        // printer resultat af metodekaldet.
                        System.out.println(c.binaryToDecimal(Integer.parseInt(binary)));


                        run = false;
                    }
                    else {
                        System.out.println("prøv igen");
                    }
                } catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
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
