import java.util.*;
class Prime_Palindrame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range m to n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int f =0;
        if(m>=2 && n<=1000)
        {
            for(int i = m; i<=n;i++)
            {
                int a =i, c=0;
                for(int j = 1;j<=n;j++)
                {
                    if(a%j==0)
                    c++;
                }
                if(c==2)
                {
                    int num = a,rev=0;
                    while(num>0)
                    {
                        rev = rev*10+ num%10;
                        num/=10;
                    }
                    if(rev==a)
                    {
                        System.out.print(i+",");
                        f++;
                    }
                }
            }
        }
        else 
        System.out.println("Invalid Output");
        System.out.println("Frequency:"+f);
    }
}
    