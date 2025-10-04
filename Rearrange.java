import java.util.*;
class Rearrange
{
    String txt,cxt;
    int len;
    Scanner sc = new Scanner(System.in);
    Rearrange()
    {
        txt = "";
        cxt="";
        len=0;
    }
    void readword()
    {
        System.out.println("Enter a string:");
        txt= sc.next();
        txt=txt.toUpperCase();
    }
    void convert()
    {
      String v = "AEIOU";
      for(int i = 0; i< txt.length(); i++)
      {
        char ch = txt.charAt(i);
        if(v.indexOf(ch)>=0)
        {
            if(v.indexOf(ch)==0)
            {
                cxt=txt+"Y";
                break;
            }
            else
            {
                cxt = txt.substring(i)+txt.substring(0,i)+"C";
                break;
            }
        }
        else
        cxt = txt+"N";
      }
    }

    void display()
    {
        System.out.println("Original:"+txt);
        System.out.println("Rearranged:"+cxt);
    }
    public static void main()
    {
        Rearrange ob = new Rearrange();
        ob.readword();
        ob.convert();
        ob.display();
    }
}
        