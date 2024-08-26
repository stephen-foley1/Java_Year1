public class Arrays
{
    public static void main(String[] args)
    {
        int n;
        System.out.println(" How many entries will you be making to the array");
        n=EasyIn.getInt();
        System.out.println("enter " + n + " entries");
        String[] array = new String[n];

        for (int i = 0; i <n; i++)
        {
            array[i]=EasyIn.getString();

        }
        for (int i=0;i<n;i++)
        {
            System.out.println( array[i]);
        }
    }
}
