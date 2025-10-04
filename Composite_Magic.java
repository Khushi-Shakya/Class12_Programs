import java.util.*;
class Composite_Magic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range m to n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int f=0,sum=0;
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
                if(c>2) 
                {
                    int number = i;
                    while (number > 9)
                    {
                        int remainder; 
                        while (number > 0)  
                        {  
                             remainder = number % 10;   
                             sum = sum + remainder;  
                             number = number / 10;     
                        }  
                        number = sum;  
                        sum = 0;  
                    } 
                    if (number == 1)
                    {  
                    System.out.println(i);  
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
