public class Jlabs61
{
    /* Student Name:Stephen Foley
Student Id:C00282842
Date:28/2/2023
Purpose: Write a method called iseven() that takes and int as an arguement and return true if the arguement is even
otherwise false.
*/

    static void isEven()
    {
        int number;
        boolean isEven;
        System.out.println("Enter a number ");
        number=EasyIn.getInt();
        if (number % 2== 0)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");

    }
    public static void main(String[] args) {
        isEven();
    }
}