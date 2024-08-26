//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Activity2 {
    Activity2() {
    }

    public static void main(String[] args) {
        int numbers = false;
        System.out.println("How many whole numbers do u want to enter?");
        int numbers = EasyIn.getInt();
        System.out.println("Enter " + numbers + " whole numbers");
        int[] numbersArray = new int[numbers];

        for(int i = 0; i < numbersArray.length; ++i) {
            numbersArray[i] = EasyIn.getInt();
        }

        display(numbersArray);
    }

    private static void display(int[] m) {
        int[] var1 = m;
        int var2 = m.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int k = var1[var3];
            System.out.println(k);
        }

    }
}
