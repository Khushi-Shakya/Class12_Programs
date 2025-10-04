import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
    Scanner sc = new Scanner(System.in);
    FiboString()
    {
        x="";
        y="";
        z="";
        n=0;
    }
    void accept()
    {
        System.out.println("Enter the number of terms:");
        n = sc.nextInt(); 
    }
    void generate()
    {
        x="a";
        y="b";
        System.out.print(x+",");
        System.out.print(y+",");
        for(int i = 1; i<= n-2;i++)
        {
        z=y+x;
        System.out.print(z+",");
        x=y;
        y=z;
        }
    }
    public static void main()
    {
        FiboString ob = new FiboString();
        ob.accept();
        ob.generate();
    }
}
