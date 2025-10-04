import java.util.*;
public class Fascinating
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range m to n ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(n>99 && m<10000)
        {
        for(int k = m;k<=n;k++)
        {
           int num = k;
           int num2 = num * 2;
           int num3 = num * 3;
           String s = "" + num + num2 + num3;
           int count = 0;
        for (char i = '1'; i <= '9'; i++) 
        {
            int c = 0;
            for(int j = 0;j<s.length();j++)
            {
               if(i==s.charAt(j))
               c++;
            } 
            if(c == 1)
            {
                count++;
            }
        }
        if(count == 9)
        
            System.out.println(num + " is fascinating");
      }
    }
  }
}
