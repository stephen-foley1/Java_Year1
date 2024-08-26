//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Activity3 {
    Activity3() {
    }

    public static void main(String[] args) {
        int[] m = returnArray();
        int[] var2 = m;
        int var3 = m.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int k = var2[var4];
            System.out.println(k);
        }

    }

    public static int[] returnArray() {
        System.out.println("how many whole numbers do you want to enter ");
        int numbers = EasyIn.getInt();
        System.out.println("Enter " + numbers + " numbers");
        int[] array = new int[numbers];

        for(int i = 0; i < array.length; ++i) {
            array[i] = EasyIn.getInt();
        }

        return array;
    }
}
