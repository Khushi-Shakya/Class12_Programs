import java.util.*;
class OddEven 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int c = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (arr[i][j] % 2 != 0) 
                c++;
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        int[] oe = new int[n*m];
        int oddi = 0, eveni = c;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (arr[i][j] % 2 != 0) 
                oe[oddi++] = arr[i][j];
                else 
                oe[eveni++] = arr[i][j];
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = oe[k++];
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
