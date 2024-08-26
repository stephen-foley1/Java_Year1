public class Jlabs52 {
    /* Student Name:Stephen Foley
 Student Id:C00282842
 Date:17/1/2023
 Purpose: modify the program at 2 so it writes the words in the reverse order
*/
    public static void main(String[] args)
    {

        String sentence;
        int stringLength;
        int stringLengthCounter = 0;
        int wordCounter = 1;
        String reversed;
        String numberOfWords = null;

        int space;



        System.out.print(" Enter a Sentence: ");
        sentence = EasyIn.getString();
        stringLength = sentence.length();
        space = sentence.indexOf(" ");
        reversed = sentence.substring(0,space); //creates a string from the existing sentence string using substring method

        for(int index=0;index<sentence.length();index++)
        {
            numberOfWords= String.valueOf(sentence.charAt(index));
        }


        System.out.println("Your Sentance reversed: " + reversed + " " + numberOfWords);
    }
}
/*
String fullName;
        String firstName;
        int space;

        System.out.print("Please enter your name: ");
        fullName = EasyIn.getString();
        space = sentence.indexOf(" "); //indexOf method returns the position value of whats in ("")
        reversed = sentence.substring(0,space); //creates a string from the existing fullName string using substring method
        fullName = fullName.substring(space);
        System.out.print(fullName+" "+firstName);
 */