import java.util.Scanner;

public class Jlabs46
{


  /* Student Name:Stephen Foley
      Student Id:C00282842
      Date:31/1/2023
      Purpose: modify program jlabs41 so that it writes out user input in reverse e.g joe becomes eoj
*/


        public static void main(String args[]){
            String fullName;
            String firstName;
            int space;

            System.out.print("Please enter your name: ");
            fullName = EasyIn.getString();
            space = fullName.indexOf(" "); //indexOf method returns the position value of whats in ("")
            firstName = fullName.substring(0,space); //creates a string from the existing fullName string using substring method
            fullName = fullName.substring(space);
            System.out.print(fullName+" "+firstName);
        }
}


