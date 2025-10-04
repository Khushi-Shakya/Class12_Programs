import java.util.Scanner;
class Arrange_Row
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int a[][] = new int[m][n];
        System.out.println("Enter values of matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n - 1; j++) 
            {
                for (int k = 0; k < n - j - 1; k++) 
                {
                    if (a[i][k] > a[i][k + 1]) 
                    {
                        int t = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = t;
                    }
                } 
            }
        }
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
