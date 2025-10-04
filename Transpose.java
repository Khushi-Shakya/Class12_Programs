import java.util.*;
class Transpose
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX : ");
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE : ");
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
        