class Activity1
{
    public static void main (String[]args)
    {
        System.out.println("How many customer objects will you be entering");
        int n =EasyIn.getInt();
        System.out.println("Enter " + n + " objects");
            String[] objects=new String[n];

        for(int i=0;i<n;i++)
        {
            objects[i] =EasyIn.getString();
        }
        for (int i=0;i<n;i++)
        {
                System.out.println( objects[i]);
        }

        for (int i=0;i<n;i++)
        {
            int cost;
            System.out.println("How much did they cost");
            cost=EasyIn.getInt();
            System.out.println("Your balance is " + cost);
            System.out.println("number of elements =  " + objects.length);
            if (cost==0) {
                System.out.println("Your balance is 0");
                System.exit(0);

            }

        }
        }




    }


