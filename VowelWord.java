import java.util.*;
class VowelWord
{
    String Str;
    int Freq;
    Scanner sc = new Scanner(System.in);
    VowelWord()
    {
        Str="";
        Freq=0;
    }
    void readstr()
    {
        System.out.println("Enter the sentence:");
        Str = sc.nextLine(); 
    }
    void freq_vowel()
    {
        Str=Str+" ";
        String wd = "", v = "AEIOUaeiou";
        for(int i = 0; i< Str.length();i++)
        {
            char ch = Str.charAt(i);
            if(ch!= ' ')
            wd = wd+ch;
            else
            {
               if(v.indexOf(wd.charAt(0))>=0)
               Freq++;
               wd="";
            }
        }
    }
    void display()
    {
        System.out.println("Original sentence:"+Str);
        System.out.println("Frequency:"+Freq);
    }
    public static void main()
    {
        VowelWord ob = new VowelWord();
        ob.readstr();
        ob.freq_vowel();
        ob.display();
    }
}
