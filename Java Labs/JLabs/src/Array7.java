public class Array7{
//Cloning of arrays
// Java program to demonstrate
// cloning of one-dimensional arrays

        public static void main(String args[])
        {
            int intArray[] = { 1, 2, 3 };

            int cloneArray[] = intArray.clone();

            // will print false as deep copy is created
            // for one-dimensional array
            System.out.println(intArray == cloneArray);

            for (int i = 0; i < cloneArray.length; i++) {
                System.out.print(cloneArray[i] + " ");
            }
        }
    }


