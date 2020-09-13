import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.StrictMath.log;
import static java.lang.StrictMath.pow;


public class Main
{
    //static boolean så vi kan bruge den i while løkke
    private static boolean run = true;

    public static void main(String[] args)
    {
        //Opretter Scanner objekt og Converter class objekt
        Scanner sc = new Scanner(System.in);
        Converter c = new Converter();


        //Spørg hvilke slags nummer der skal konverteres og gemmer bruger input i variabel
        System.out.println("Do you wanna convert from: \n1. Binary number? \n2. Decimal number?");
        String str = sc.nextLine();

        //Tjekker hvad brugeren har indtastet
        if(str.equalsIgnoreCase("binary") || str.equals("1"))
        {
            while(run)
            {
                System.out.println("Type a binary number");
                //Gemmer bruger input som en String
                String binary = sc.nextLine();

                //Finder første Char i gemt string
                String firstChar = binary.substring(0, 1);

                //Tjekker hvad første char i string er lig med.
                if(firstChar.equals("1"))
                {
                    //Kald metode negativeBinaryConverter

                    //breaker ud af while løkke når run = false
                    run = false;
                }
                else if(firstChar.equals("0"))
                {
                    // printer resultat af metodekaldet.
                    System.out.println(c.binaryToDecimal(Integer.parseInt(binary)));
                    //breaker ud af while løkke når run = false
                    run = false;
                }
                else
                {
                    //Hvis første char i gemt String ikke er lig med enten 1 eller 0
                    //Printer besked til brugeren og starter while løkken igen
                    System.out.println("Try again");
                }
            }
        }

        else if(str.equalsIgnoreCase("decimal") || str.equals("2"))
        {
            //Løkker der bliver ved til vi får et decimaltal konverteret til Binarytal
            while(run)
            {
                //try catch metode til at gribe et fejl input fra bruger
                try
                {
                    System.out.println("type a positive decimal number, to convert");
                    //gemmer bruger input i variabel
                    String decimal = sc.nextLine();
                    //tjekker om bruger input er større end 0
                    //Integer.parseInt for at konvertere string input til Integer.
                    if(Integer.parseInt(decimal) > 0)
                    {
                        System.out.println("Binary number:");
                        //kalder metode og printer det konverteret binary tal ud.
                        System.out.println("0"+c.decimalToBinary(Integer.parseInt(decimal)));
                        //System.out.println(c.binaryToDecimal(Integer.parseInt(decimal)));
                        //run attributten sættes til false, så vi breaker ud af while løkke
                        run=false;
                    }
                    //tjekker om input er mindre end 0, altså et negativt tal
                    else if(Integer.parseInt(decimal) < 0)
                    {
                        //Lav metode der regner negative decimal tal til binary.
                        System.out.println("Error, not a positive number");
                        run=false;
                    }
                    //hvis input er 0, er binary også 0
                    else
                    {
                        System.out.println("0");
                        //attrribut bliver sat til false, for at breake ud af while løkke
                        run=false;
                    }
                }
                //griber hvis bruger inputet ikke er Integer
                catch(Exception ex)
                {
                    System.out.println("Try again, not an Integer");
                }
            }
        }
        else
        {
            System.out.println("You have to choose between:\n1. Binary \n2. Decimal");
        }
    }
}

