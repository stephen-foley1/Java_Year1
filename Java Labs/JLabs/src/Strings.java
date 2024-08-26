public class Strings {
    //write a string that returns only first and last name.

    public static void main(String[] args)
    {
        String firstName;
        String fullName;
        int space=0;

        System.out.println("Enter your full name");
        fullName=EasyIn.getString();
        space=fullName.indexOf(" ");
        firstName=fullName.substring(0,space);
        fullName=fullName.substring(space + 1 );
        fullName=fullName.substring(space);
        System.out.println(firstName + " " + fullName);
    }
}