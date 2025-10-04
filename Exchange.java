import java.util.*;
class Exchange
{
    String Sent,Rev;
    int Size;
    Scanner sc = new Scanner(System.in);
    Exchange()
    {
        Sent="";
        Rev="";
        Size=0;
    }
    void readsentence()
    {
        System.out.println("Enter the sentence:");
        Sent = sc.nextLine(); 
    }
    void exfirstlast()
    {
        Sent = Sent +" ";
        String wd="",dw="";
        for(int i = 0; i< Sent.length();i++)
        {
            char ch = Sent.charAt(i);
            if(ch!= ' ')
            wd = wd+ch;
            else
            {
                if(wd.length()>1)
                    dw= wd.charAt(wd.length()-1)+ wd.substring(1,wd.length()-1)+wd.charAt(0) + " ";
                else
                    dw = wd + " ";
                Rev=Rev+dw;
                wd="";
            }
        }
    }
    void display()
    {
        System.out.println("Original sentence:"+Sent);
        System.out.println("Reversed sentence:"+Rev);
    }
    public static void main()
    {
        Exchange ob = new Exchange();
        ob.readsentence();
        ob.exfirstlast();
        ob.display();
    }
}
