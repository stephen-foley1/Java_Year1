public class Jlabs64
  /* Student Name:Stephen Foley
Student Id:C00282842
Date:28/2/2023
Purpose: Write a method called award () that takes and mark as an arguement and returns restult as a string
*/
{
 static void award()
 {
     double mark;
     String distinction = "Distinction";
     String merit1 = "Merit 1";
     String merit2 = "Merit 2";
     String pass = "Pass";
     String fail = "Fail";

     System.out.print("Enter your Mark -> ");
     mark = EasyIn.getDouble();

     if (mark >= 70 && mark <=100) {
         System.out.println(distinction);
     }
     else if(mark <= 69 && mark >= 63)
     {
         System.out.println(merit1);
     }
     else if(mark <= 62 && mark >= 55)
     {
         System.out.println(merit2);
     }
     else if(mark <= 54 && mark >= 40)
     {
         System.out.println(pass);
     }
     else if(mark <=40 )
     {
         System.out.println(fail);
     } else if (mark >= 101)
     {
         System.out.println("Invalid please try again");
     }



 }
    public static void main(String[] args)
    {
        award();
    }

}
