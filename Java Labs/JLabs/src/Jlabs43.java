class Jlabs43 {
    /* Student Name:Stephen Foley
       Student Id:C00282842
       Date:17/1/2023
       Purpose: modify program jlabs41 so that it writes out the number of characters in the users input
    */
    public static void main(String[] args)
    {
        String fullName;
        String space;
        String surname;
        int spacePos;
        int numberOfCharacters;

        space=(" ");

        System.out.print("Enter full name: ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(space);
        surname=fullName.substring(spacePos+1);
        numberOfCharacters=fullName.length();
        System.out.println("Number of characters = " + numberOfCharacters);

    }
}
