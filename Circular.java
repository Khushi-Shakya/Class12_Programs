import java.util.*;
class Circular
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.next();
        str = str.toUpperCase();
        String n = "";
        for(int i = 0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch > 87 && ch <= 90)
            {
               ch -=26;
            }
            ch +=3;
            n = n + ch;
        }
        System.out.println("New Word: "+ n);
    }
}

            
               
            
        