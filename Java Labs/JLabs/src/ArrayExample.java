import java.util.Scanner;

public class ArrayExample
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize the array with a size of 5
        int[] numbers = new int[5];

        // Use a for loop to populate the array with user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a 5 numbers: ");
            numbers[i] = input.nextInt();
        }

        // Use another for loop to check whether the input is odd or even
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even.");
                System.out.println("Position in array: " + i);
            } else {
                System.out.println(numbers[i] + " is odd.");
            }
        }
    }
}
