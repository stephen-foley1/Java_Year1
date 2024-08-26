class JLabs21
/* Student Name:Stephen Foley
        Student Id:C00282842
        Date:11/10/2022
        Purpose: To decide if the input number is less than, Greater than or Equal to Zero
     */
{

    public static void main(String[] args) {
        System.out.print("Enter a number -> ");
        double Number = EasyIn.getDouble();
        if (Number > 0.0) {
            System.out.print("Number is greater than zero ");
        } else if (Number == 0.0) {
            System.out.print("Number is equal to zero ");
        } else if (Number < 0.0) {
            System.out.print("Number is less than zero");
        }

    }
}
