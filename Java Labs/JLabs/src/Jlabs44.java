// Student Name : 		Daniel McCormack
// Student Id Number : 	C00287277
// Date :				17/01/2023
// Purpose : 			return the number of characters in the usrs first and last name

class JLab44
{
    // Student Name : 	Stephen Foley
// Student Id Number : 	C00282842
// Date :				17/01/2023
// Purpose : 			return the number of characters in the users first and last name

    public static void main(String[] args)
    {
        String fullName;
        int upperChr;

        System.out.print("Please enter your name: ");
        fullName = EasyIn.getString();
        upperChr=0;

        for(int i=0;i<fullName.length();i++) //while length is greater than 0 it will loop, meaning it scans the entire string
        {
            if (Character.isUpperCase(fullName.charAt(i))) //character.isUpperCase method checks if it is upper or lower case within (), .charAt method returns the character corisponding to the position value given
            {
                upperChr++;
            }
        }
        System.out.print("Number Of Uppercase Letters Entered is -> " + upperChr);
    }

}
