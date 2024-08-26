

class Activity2
 {
    public static void main(String[] args)
    {

        int numbers = 0;

        System.out.println("How many whole numbers do u want to enter?");
        numbers=EasyIn.getInt();
        System.out.println("Enter " + numbers + " whole numbers");
        int[] numbersArray = new int[numbers];

        for(int i=0; i< numbersArray.length;i++)
        {
            numbersArray[i]=EasyIn.getInt();
        }

        display(numbersArray);
    }

     private static void display(int m [])
     {
         for (int k:m)
         {
             System.out.println(k);

         }
     }

 }
