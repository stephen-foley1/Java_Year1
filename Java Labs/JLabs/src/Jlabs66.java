/* public class Jlabs66
      Student Name:Stephen Foley
Student Id:C00282842
Date:28/2/2023
Purpose: rewrite all of jlab 4 into methods.

{

static void jlab41 ()
    {
        String fullName;
        String space;
        String surname;
        int spacePos;

        space=(" ");

        System.out.print("Enter full name: ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(space);
        surname=fullName.substring(spacePos+1);
        System.out.println(" Your Surname: " + surname);
    }
    static void jlab42()
    {
        String fullName;
        String space;
        int spacePos;
        String firstName;
        space=(" ");

        System.out.print("Enter full name: ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(space);
        firstName = fullName.substring(0 , spacePos);
        System.out.println(" Your First Name: " + firstName);
    }
    static void jlab43()
    {
        String fullName;
        String space;
        String surname;
        int spacePos;
        int numberOfCharacters;

        space=(" ");

        System.out.print("Enter full name: ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(space);
        surname=fullName.substring(spacePos+1);
        numberOfCharacters=fullName.length();
        System.out.println("Number of characters = " + numberOfCharacters);
    }
    static void jlab44()
    {
        String fullName;
        int upperChr;

        System.out.print("Please enter your name: ");
        fullName = EasyIn.getString();
        upperChr=0;

        for(int i=0;i<fullName.length();i++) //while length is greater than 0 it will loop, meaning it scans the entire string
        {
            if (Character.isUpperCase(fullName.charAt(i))) //character.isUpperCase method checks if it is upper or lower case within (), .charAt method returns the character corisponding to the position value given
            {
                upperChr++;
            }
        }
        System.out.print("Number Of Uppercase Letters Entered is -> " + upperChr);
    }
    static void jlab45()
    {
        //import java.util.Scanner;
        String Name;//declare a String variable
        char ch;//declare a char variable
        System.out.println("Enter your Name: ");
        //ask input from the user
        Scanner scan=new Scanner(System.in);//create scanner object

        Name =scan.nextLine();
        System.out.println("Reserve of your name: "+Name+" is : ");
        for(int j=Name.length(); j>0; j--){
            System.out.print(Name.charAt(j-1));
    }
        static void jlab46()
    {
        String fullName;
        String firstName;
        int space;

        System.out.print("Please enter your name: ");
        fullName = EasyIn.getString();
        space = fullName.indexOf(" "); //indexOf method returns the position value of whats in ("")
        firstName = fullName.substring(0,space); //creates a string from the existing fullName string using substring method
        fullName = fullName.substring(space);
        System.out.print(fullName+" "+firstName);
    }
        static void jlab48()
    {
        String fullName;
        String firstName;
        int space;

        System.out.print("Please enter your name: ");
        fullName = EasyIn.getString();
        space = fullName.indexOf(" ");
        firstName = fullName.substring(0, space);
        fullName=fullName.substring(space+1); //after capturing the first name, redefine fullName from the first space + 1 so the string begins with a character
        fullName=fullName.substring(space);

        System.out.print(firstName+" "+fullName);
    }

public static void main(String[] args)
    {


        System.out.println (" What jlabs 4 exercies would you like to run ");
        System.out.println("1.jlabs41.");
        System.out.println("2.jlabs42.");
        System.out.println("3.jlabs43.");
        System.out.println("4.jlabs44");
        System.out.println("5.jlabs45. ");
        System.out.println("6.jlabs46. ");
        System.out.println("7.jlabs48. ");
        System.out.println("Type number 8 to Exit");

        for(int menu = EasyIn.getInt(); menu != 7; menu = EasyIn.getInt())
        {
            switch (menu) {
                case 1:
                    jlab41();
                    break;
                case 2:
                    jlab42();
                    break;
                case 3:
                   jlab43();
                    break;
                case 4:
                    jlab44();
                    break;
                case 5:
                    jlab45();
                    break;
                case 6:
                    jlab46();
                    break;
                case 7:
                    jlab48();
                    break;
                case 8:
                    System.exit(0);
            }
    }
}

*/