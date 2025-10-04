import java.util.*;
class Case
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
        char l = s.charAt(s.length()-1);
        if(l=='.'||l=='?'||l=='!')
        {
            s=s.substring(0,l)+" ";
            s=s.toUpperCase();
            String wd="", v = "AEIOU";
            int f =0;
            for(int i =0; i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(ch != ' ')
                wd=wd+ch;
                else
                {
                    if(v.indexOf(wd.charAt(0))>=0)
                    f++;
                    wd="";
                }
            }
            String[] w = s.split("\\s+");
            for (int i = 0; i < w.length - 1; i++) 
            {
            for (int j = 0; j < w.length - i - 1; j++) 
            {
                if (Character.toLowerCase(w[j].charAt(0)) > Character.toLowerCase(w[j + 1].charAt(0))) 
                {
                    String t = w[j];
                    w[j] = w[j + 1];
                    w[j + 1] = t;
                }
            }
        }
        String st = String.join(" ", w);

        System.out.println("The sentence in ascending order of the first letter of each word is:");
        System.out.println(st);
        }
        else
        System.out.println("INVALID INPUT");
    }
}