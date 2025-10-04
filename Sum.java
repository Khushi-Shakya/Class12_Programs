import java.util.*;
class Sum
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the values:");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Matrix:");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Resultant Matrix:");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                int num = arr[i][j];
                int sum = 0;
                while(num>0)
                {
                    sum += num%10;
                    num/=10;
                }
                System.out.print(sum + "\t");
            }
            System.out.println();
        }
    }
}
