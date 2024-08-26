public class MultidimensionalArray

{
    // Declare and initialize a 2-dimensional array of integers

        public static void main(String[] args) {
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int i = 0; i < myNumbers.length; ++i) {
                for(int j = 0; j < myNumbers[i].length; ++j) {
                    System.out.println(myNumbers[i][j]);
                }
            }
        }
    }

// Output:
// 1 2
//


