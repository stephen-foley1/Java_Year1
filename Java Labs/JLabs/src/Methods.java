public class Methods
{
    public static void myStr()
    {
        String fullName;
        int space=0;

        System.out.println("Enter full name");
        fullName = EasyIn.getString();
        space=fullName.indexOf(" ");
        System.out.println(fullName);

    }
    public static void main(String[] args)
    {
        myStr();
    }
}
