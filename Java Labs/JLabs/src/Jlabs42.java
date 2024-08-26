class Jlabs42 {
      /* Student Name:Stephen Foley
       Student Id:C00282842
       Date:17/1/2023
       Purpose: Write a program that asks user for full name then outputs first name
    */

    public static void main(String[] args)
    {
        String fullName;
        String space;
        int spacePos;
        String firstName;
        space=(" ");

        System.out.print("Enter full name: ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(space);
        firstName = fullName.substring(0 , spacePos);
        System.out.println(" Your First Name: " + firstName);

    }
}
