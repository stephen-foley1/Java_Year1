public class Jlabs63
  /* Student Name:Stephen Foley
Student Id:C00282842
Date:28/2/2023
Purpose: Write a method called alphaCount() that takes an String as an arguement and returns number of
alphabetic chars in the string
*/
{
    public static int alphaCount()
    {
        String str = null;
        System.out.println("Enter a series of words.");
        str=EasyIn.getString();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {

        int count = alphaCount();
        System.out.println(count);

    }

}
