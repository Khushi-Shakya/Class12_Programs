import java.util.*;
class Palindrom
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m*n <= 50)
        {
        int arr[][] = new int[n][m];
        System.out.println("Enter the values:");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Matrix:");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("PALINDROME NUMBERS");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                int num = arr[i][j];
                int rev = 0;
                while(num>0)
                {
                    int d = num%10;
                    rev = rev*10 + d;
                    num/=10;
                }
                if( arr[i][j] == rev)
                System.out.println(arr[i][j]);
            }
         }
        }
        else
        System.out.println("INVALID SIZE (MORE THAN 50)");
    }
}
