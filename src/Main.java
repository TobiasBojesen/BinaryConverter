import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Converter c = new Converter();
        
        System.out.println("Do you wanna convert from: \n1. Binary number? \n2. Decimal number?");
        String str = sc.nextLine();
        
        if(str.equalsIgnoreCase("binary") || str.equals("1"))
        {
            System.out.println("Type a binary number");
            int binary = sc.nextInt();
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
                c.decimalToBinary(decimal);
            }
        }
        else
        {
            System.out.println("You have to choose between 'decimal or binary' ");
        }
    }
}
