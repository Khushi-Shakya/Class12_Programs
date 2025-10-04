import java.util.*;
class Prime_Adam
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range m to n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int f=0;
        if(m<n)
        {
            for(int i =m;i<=n; i++)
            {
                int c=0;
                for(int j= 1;j<=i;j++)
                {
                    if(i%j==0)
                    c++;
                }
                if(c==2) 
                {
                    int num =i;
                    int s = i*i,ri=0;
                    while(num>0)
                    {
                        int d = num%10;
                        ri = ri*10 +d;
                        num/=10;
                    }
                    int rs = ri*ri;
                    int number= s, rev=0;
                    while(number>0)
                    {
                        int d = number%10;
                        rev = rev*10 +d;
                        number/=10;
                    }
                    if(rev == rs)
                    {
                        System.out.print(i+",");
                        f++;
                    }
                    }
                }
            }
            else
             System.out.println("Invalid Input");
            System.out.println("Frequency:"+f); 
        }
        
    }
