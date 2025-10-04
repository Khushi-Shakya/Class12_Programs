import java.util.*;
class Array_Arrange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit 'm':");
        int m = sc.nextInt();
        if(m<3 || m>10)
        {
            System.out.println("Out Of Range:");
            System.exit(0);
        }
        else
        {
            int ar[][]= new int[m][m];
            System.out.println("Enter the elements:");
            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<m; j++)
                {
                    ar[i][j]= sc.nextInt();
                }
            }
            
            System.out.println("Original Matrix:");
            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<m; j++)
                {
                   System.out.print(ar[i][j]+ "\t");
                }
                System.out.println();
            }
            
            int a[]=new int [m];
            
            for(int i = 0; i<m; i++)
            {
                 a[i]= ar[m-i-1][i];
            }
            
            for (int i = 0; i < m - 1; i++) 
            {
                for (int j = 0; j < m - i - 1; j++) 
                {
                    if (a[j] < a[j + 1]) 
                    {
                        int t = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = t;
                    }
                }
            }
            
            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<m; j++)
                {
                    ar[m-i-1][j]= a[i];
                }
            }
            
            System.out.println("Arranged Matrix:");

            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<m; j++)
                {
                    System.out.print(ar[i][j]+ "\t");
                }
                System.out.println();
            }
        }
    }
}
