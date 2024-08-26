class Jlabs48  {
    /* Student Name:Stephen Foley
      Student Id:C00282842
      Date:31/1/2023
      Purpose: from the users first, middle, and last name, return only the first and last.
*/

    public static void main(String[] args)
        {
            String fullName;
            String firstName;
            int space;

            System.out.print("Please enter your name: ");
            fullName = EasyIn.getString();
            space = fullName.indexOf(" ");
            firstName = fullName.substring(0, space);
            fullName=fullName.substring(space+1); //after capturing the first name, redefine fullName from the first space + 1 so the string begins with a character
            fullName=fullName.substring(space);

            System.out.print(firstName+" "+fullName);

        }
}
