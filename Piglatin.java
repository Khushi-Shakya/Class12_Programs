import java.util.*;
class Piglatin
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String w = sc.next();
        w = w.toLowerCase();
        int f = 0, j = 0;
        String nw = "";
        String v = "aeiou";
        for(int i = 0; i< w.length(); i++)
        {
            char ch = w.charAt(i);
            if(v.indexOf(ch) >= 0)
            {
                f = 1;
                j = w.indexOf(ch);
                break;
            }
        }
        if(f == 1)
        {
            nw = w.substring(j) + w.substring(0,j) + "ay";
            System.out.println("New word:"+nw);
        }
        else
        System.out.println("VOWEL NOT PRESENT. INVALID ENTER.");
    }
}