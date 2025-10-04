import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ar[][]= new int[m][n]; 
        int f =0;
        if(m>2 && m<8 && n>2 && n<=8)
        {
            System.out.println("Enter the elements:");
            for(int i = 0; i<m; i++)
            {
                for(int j = 0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            } 
            System.out.println("Original Matrix:");
            for(int i = 0; i<m; i++)
            {
                for(int j = 0;j<n;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
                System.out.println();
            } 
            int s =0;
            for(int i = 0;i<m;i++)
            {
                for(int j = 0; j<n;j++)
                {
                    if(i==0||j==0||i==m-1||j==n-1)
                    sum += ar[i][j];
                }
                
                    
            