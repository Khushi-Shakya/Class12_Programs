import java.util.*;
class Palindrome
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        str = str + " ";
        str = str.toUpperCase();
        String wrd="",rev="";
        int f = 0;
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                wrd = wrd + ch;
                rev = ch + rev;
            }
            else
            {
                if(rev.equals(wrd))
                {
                    System.out.println(wrd);
                    f++;
                }
                wrd="";
                rev="";
            }
        }
        System.out.println("Frequency:"+f);
    }
}
