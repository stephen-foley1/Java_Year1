public class Jlabs51
{
    /* Student Name:Stephen Foley
      Student Id:C00282842
      Date:17/1/2023
      Purpose: program will input a string from keyboard input and output number of separate words
   */
    public static void main(String[] args)
    {
        String sentence;
        int stringLength;
        int stringLengthCounter=0;
        int wordCounter=1;
        char letterSel;



        System.out.print(" Enter a Sentence: ");
        sentence=EasyIn.getString();
        stringLength=sentence.length();
        for(int index =0; index<sentence.length();index++)
        {
            letterSel=sentence.charAt(index);
            if(letterSel == ' ')
            {
                wordCounter++;
            }
        }

        System.out.println("Number of words: " + wordCounter);
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