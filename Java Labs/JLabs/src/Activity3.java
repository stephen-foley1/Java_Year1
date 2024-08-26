class Activity3
{
    public static void main(String[] args)
    {
        int m[] =returnArray();
        for (int k:m)
        {
            System.out.println(k);
        }
    }

    public static int[] returnArray()
    {

        int numbers;
        System.out.println("how many whole numbers do you want to enter ");
        numbers=EasyIn.getInt();
        System.out.println("Enter " + numbers + " numbers");
        int[] array = new int[numbers];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = EasyIn.getInt();
        }
        return array;
    }
}
