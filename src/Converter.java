public class Converter
{
    //metode med binary parameter
    public int binaryToDecimal(int binary)
    {
        //decimal variabel til at gemme den konverteret binary
        int decimal = 0;
        //varibel til fortælle hvilke potens vi er ved
        int num = 0;

        //While løkke der kører til vi rammer 0 eller input er 0
        while(true)
        {

            //Breaker ud af løkke hvis binary er = 0
            if(binary == 0)
            {
                break;
            }
            else
            {
                //regner resten ud(hvis der er en rest, ellers 0) i vores binary input og gemmer i midlertidig variabel.
                int temp = binary % 10;
                //Sætter decimal til at være lig det den rest vi har fundet og ganger med 2
                //og sætter den i potens af num
                decimal += temp * Math.pow(2, num);
                //Her tager vi vores binary og deler med 10, det fjerner altså det sidste tal i vores binary input.
                binary = binary / 10;
                //System.out.println(binary); TEST
                //vores potens nummer stiger med en.
                num++;
            }
        }
        //Her retunere vi vores decimal som en integer
        return decimal;
    }
/*
    public void decimalToBinary(int decimal)
    {
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0)
        {
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--)
        {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

 */


    public long decimalToBinary(int decimal)
    {
        //decimal variabel til at gemme den konverteret decimal
        long binary = 0;
        //varibel til fortælle hvilke potens vi er ved
        int num = 0;

        //While løkke der kører til vi rammer 0 eller input er 0
        while(true)
        {
            //Breaker ud af løkke hvis decimal er = 0
            if(decimal == 0)
            {
                break;
            }
            else
            {
                //regner "resten" ud(hvis der er en rest, ellers 0) i vores binary input og gemmer i midlertidig variabel.
                long temp = decimal % 2;
                //Sætter binary til at være lig det den rest vi har fundet og ganger med 10
                //og sætter den i potens af num
                binary += temp * Math.pow(10, num);
                decimal = decimal / 2;
                //vores potens nummer stiger med 1
                num++;
            }
        }
        // retunere vores binary som en integer
        return binary;
    }



    /*
    public int negativeBinaryConverter(int binary)
    {
        int decimal = 0;
        return decimal;
    }

     */
}

