import java.util.Scanner;

class Jlabs23
    /* Student Name:Stephen Foley
        Student Id:C00282842
        Date:11/10/2022
        Purpose: To decide if a number is odd or even
     */
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if (num % 2 == 0) {
            System.out.println("" + num + " is even");
        } else {
            System.out.println("" + num + " is odd");
        }

    }
}
