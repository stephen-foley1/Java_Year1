class Jlab2b1 {

    public static void main(String[] args) {

        double var4 = 0.05;
        double var6 = 0.6;
        double var10 = 1.2;
        System.out.print("How much did you insurance premium cost last year? $");
        double var1 = (double)EasyIn.getInt();
        System.out.print("How many times did you file an insurance claim last year? ");
        int var3 = EasyIn.getInt();
        double var12 = var10 * (double)var3;
        if (var3 == 0) {
            double var14 = var1 - var1 * var4 * var6;
            System.out.println("Your insurance premium for the following year will be: $" + var14);
        } else {
            double var16 = var1 + var1 * var4 * var12;
            System.out.println("Your insurance premium for the following year will be: $" + var16);
        }

    }
}
