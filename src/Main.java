import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Converter c = new Converter();
        
        System.out.println("Do you wanna convert from binary or decimal number?");
        String str = sc.nextLine();
        
        if(str.equalsIgnoreCase("binary"))
        {
            System.out.println("What binary number to convert?");
            int binary = sc.nextInt();
            System.out.println(c.binaryToDecimal(binary));
        }
        else if(str.equalsIgnoreCase("decimal"))
        {
            System.out.println("What positive decimal number to convert");
            int decimal = sc.nextInt();
            if(decimal<0)
            {
                System.out.println("Error, not a positive number");
                System.out.println("Test af GitHub");
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
