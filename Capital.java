import java.util.*;
class Capital
{
    String sent;
    int freq;
    Scanner sc = new Scanner(System.in);
    Capital()
    {
        sent="";
        freq=0;
    }
    void input()
    {
        System.out.println("Enter the sentence:");
        sent = sc.nextLine(); 
    }
    boolean isCap(String v)
    {
        if(Character.isUpperCase(v.charAt(0)))
        return true;
        else 
        return false;
    }
    void display()
    {
        System.out.println("Original sentence:"+sent);
        sent = sent +" ";
        String wd=""; int f =0;
        for(int i = 0; i< sent.length();i++)
        {
            char ch = sent.charAt(i);
            if(ch!= ' ')
            wd = wd+ch;
            else
            {
                if(Character.isUpperCase(wd.charAt(0)))
                f++;
                wd="";
            }
        }
        System.out.println("Frequency:"+f);
    }
    public static void main()
    {
        Capital ob = new Capital();
        ob.input();
        ob.display();
    }
}
