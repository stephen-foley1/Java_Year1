class Jlabs245
    /* Student Name:Stephen Foley
        Student Id:C00282842
        Date:11/10/2022
        Purpose: Jlabs24: To see if two numbers are exactly divisible by each other
        Purpose: Jlabs25: To see if three labs are exactly divisible by each other
     */
{
    public static void main(String[] args) {
        System.out.print(" Enter your First Number -> ");
        int firstValue = EasyIn.getInt();
        System.out.print(" Enter your Second Number -> ");
        int secondValue = EasyIn.getInt();
        System.out.print(" Enter your Third Number -> ");
        int thirdValue = EasyIn.getInt();
        if (firstValue % secondValue == 0) {
            System.out.println("" + firstValue + " is exactly divisble by " + secondValue);
        } else if (firstValue % secondValue != 0) {
            System.out.println("" + firstValue + " is not exactly divisible by " + secondValue);
        }

        if (firstValue % thirdValue == 0) {
            System.out.println("" + firstValue + " is exactly divisble by " + thirdValue);
        } else if (firstValue % thirdValue != 0) {
            System.out.println("" + firstValue + " is not exactly divisible by " + thirdValue);
        }

        if (thirdValue % secondValue == 0) {
            System.out.println("" + thirdValue + " is exactly divisble by " + secondValue);
        } else if (thirdValue % secondValue != 0) {
            System.out.println("" + thirdValue + " is not exactly divisible by " + secondValue);
        }

    }
}
