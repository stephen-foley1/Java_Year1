public class Jlabs62
      /* Student Name:Stephen Foley
Student Id:C00282842
Date:28/2/2023
Purpose: Write a method called isAlpha () that takes a char as an argument and returns true if the char is in the
alphabetic range of A-Z,a-z otherwise false
*/
{
    static void isAlpha()
    {
        char character;
        System.out.println("Enter  a character");
        character = EasyIn.getChar();
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String[] args)
    {
        isAlpha();
    }

}
