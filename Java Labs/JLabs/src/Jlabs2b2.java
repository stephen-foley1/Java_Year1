class Jlab2b2 {

    public static void main(String[] args)
    {
        double creditUsed;
        double interestRate;
        double bill;
        double rate1;
        double rate2;

        System.out.print("Please insert how much credit you have used this month: €");
        creditUsed =EasyIn.getDouble();

        if (creditUsed > 500.0) {
            interestRate = 60.0;
            rate1 = (creditUsed - 500.0) * 0.18;
        } else {
            interestRate = creditUsed * 0.12;
            rate2 = 0.0;
        }

       bill = interestRate + creditUsed;
        System.out.println("Your credit card bill for this month is €" + bill + ".");
    }
}
