public class Jlabs65
  /* Student Name:Stephen Foley
Student Id:C00282842
Date:28/2/2023
Purpose: rewrite conversion table and add a method for each conversion.
*/
{

static void celToFahr ()
{
    double calculate;
    System.out.println("Enter Degrees Fahrenheit");
    double fahrenheit = EasyIn.getDouble();
    calculate = fahrenheit / 32.0;
    System.out.println("" + fahrenheit + " degrees fahrenheit is " + calculate + " degrees celsius.");
}
    static void fahrToCel ()
    {
        double calculate;
        System.out.println("Enter Degrees Celsius");
        double celsius = EasyIn.getDouble();
        calculate = celsius * 32.0;
        System.out.println("" + celsius + " degrees celsius is " + calculate + " degrees fahrenheit.");
    }

    static void inchtoCm ()
    {
        double calculate;
        System.out.println("Enter Inches");
        double inches = EasyIn.getDouble();
        calculate = inches * 2.54;
        System.out.println("" + inches + " inches is " + calculate + " centimeters.");
    }

    static void cmToInch ()
    {
        double calculate;
        System.out.println("Enter Inches");
        double inches = EasyIn.getDouble();
        calculate = inches * 2.54;
        System.out.println("" + inches + " inches is " + calculate + " centimeters.");
    }
    static void lbsToKgs ()
    {
        double calculate;
        System.out.println("Enter Pounds");
        double pounds = EasyIn.getDouble();
        calculate = pounds * 0.453592;
        System.out.println("" + pounds + " pounds is " + calculate + " kilograms");
    }
    static void kgsToLbs ()
    {
        double calculate;
        System.out.println("Enter Kilograms");
        double kilograms = EasyIn.getDouble();
        calculate = kilograms / 0.453592;
        System.out.println("" + kilograms + " kilograms is " + calculate + " pounds");
    }




    public static void main(String[] args)
    {
        System.out.println("Enter what you want to calculate -> ");
        System.out.println("1. Fahrenheit to Celsius.");
        System.out.println("2.Celsius to Fahrenheit.");
        System.out.println("3.Inches to Centimetres.");
        System.out.println("4.Centimetres to Inches");
        System.out.println("5.Pounds to Kilograms. ");
        System.out.println("6.Kilograms to Pounds. ");
        System.out.println("7. Exit");
        for(int menu = EasyIn.getInt(); menu != 7; menu = EasyIn.getInt())
        {
            switch (menu) {
                case 1:
                    celToFahr();
                    break;
                case 2:
                    fahrToCel();
                    break;
                case 3:
                    inchtoCm();
                    break;
                case 4:
                    cmToInch();
                    break;
                case 5:
                    lbsToKgs();
                    break;
                case 6:
                    kgsToLbs();
                    break;
                case 7:
                    System.exit(0);
            }


            System.out.println("Enter what you want to calculate -> ");
            System.out.println("1. Fahrenheit to Celsius.");
            System.out.println("2.Celsius to Fahrenheit.");
            System.out.println("3.Inches to Centimetres.");
            System.out.println("4.Centimetres to Inches");
            System.out.println("5.Pounds to Kilograms. ");
            System.out.println("6.Kilograms to Pounds. ");
            System.out.println("7. Exit");
        }
    }




    }



