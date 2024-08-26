class Jlabs41 {
    /* Student Name:Stephen Foley
       Student Id:C00282842
       Date:17/1/2023
       Purpose: Write a program that asks user for full name then outputs surname
    */
    public static void main(String[] args) {
        String fullName;
        String space;
        String surname;
        int spacePos;

        space=(" ");

        System.out.print("Enter full name: ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(space);
        surname=fullName.substring(spacePos+1);
        System.out.println(" Your Surname: " + surname);


    }
}