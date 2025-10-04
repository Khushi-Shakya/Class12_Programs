import java.util.*;
class Palindromic_words
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.nextLine();
        str = str + " ";
        int f = 0;
        String w = "", rev = "";
        for(int i = 0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                w = w + ch;
                rev = ch + rev;
            }
            else
            {
                if( w.equalsIgnoreCase(rev))
                {
                    System.out.println(w);
                    f++;
                }
                w = "";
                rev = "";
            }
        }
        System.out.println("Frequency: "+f);
    }
}