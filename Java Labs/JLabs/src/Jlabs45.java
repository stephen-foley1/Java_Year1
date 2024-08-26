import java.util.Scanner;

class Jlab45
{

  /* Student Name:Stephen Foley
      Student Id:C00282842
      Date:31/1/2023
      Purpose: modify program jlabs41 so that it writes out user input in reverse e.g joe becomes eoj
*/


    public static void main(String args[]){
        String Name;//declare a String variable
        char ch;//declare a char variable
        System.out.println("Enter your Name: ");
        //ask input from the user
        Scanner scan=new Scanner(System.in);//create scanner object

        Name =scan.nextLine();
        System.out.println("Reserve of your name: "+Name+" is : ");
        for(int j=Name.length(); j>0; j--){
            System.out.print(Name.charAt(j-1));
        }
    }
}