class Jlab2b3 {
    {

    }

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int smallest1;
        int smallest;

        System.out.print("Please enter your first number: ");
         num1 = EasyIn.getInt();
        System.out.print("Please enter your second number: ");
         num2 = EasyIn.getInt();
        System.out.print("Please enter your third number: ");
         num3 =EasyIn.getInt();
         smallest1 = Math.min(num1, num2);
         smallest = Math.min(smallest1, num3);
        System.out.println(" The smallest number is " + smallest);
    }
}
