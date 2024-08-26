//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Activity1 {
    Activity1() {
    }

    public static void main(String[] args) {
        System.out.println("How many customer objects will you be entering");
        int n = EasyIn.getInt();
        System.out.println("Enter " + n + " objects");
        String[] objects = new String[n];

        int i;
        for(i = 0; i < n; ++i) {
            objects[i] = EasyIn.getString();
        }

        for(i = 0; i < n; ++i) {
            System.out.println(objects[i]);
        }

        for(i = 0; i < n; ++i) {
            System.out.println("How much did they cost");
            int cost = EasyIn.getInt();
            System.out.println("Your balance is " + cost);
        }

        System.out.println("number of elements =  " + objects.length);
    }
}
