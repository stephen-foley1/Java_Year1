class Jlabs22
    /* Student Name:Stephen Foley
        Student Id:C00282842
        Date:11/10/2022
        Purpose: To Get the average mark for 3 subjects
     */
{

    public static void main(String[] args) {
        System.out.println("Please enter your Maths Mark -> ");
        double mathsMark = EasyIn.getDouble();
        System.out.println("Please enter your Computer Hardware Mark -> ");
        double hwMark = EasyIn.getDouble();
        System.out.println("Please enter your Programming Mark -> ");
        double programmingMark = EasyIn.getDouble();
        System.out.println("Your Average mark is ---> " + (mathsMark + programmingMark + hwMark) / 3.0);
    }
}
