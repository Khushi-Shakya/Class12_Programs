import java.util.Scanner;

public class Ques_20
{                                                                                                            //Start of class

    public static void main(String args[]) 
    {                                                                                                       //Start of main()
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): "); 
                                                                 // Prompt user to enter the number of rows
        int m = in.nextInt();
        
        System.out.print("Enter the number of columns (N): ");        
                                                            // Prompt user to enter the number of columns
        int n = in.nextInt();
        
        if (m <= 0 || m >= 10 || n <= 2 || n >= 6) 
                                                               // Validate input ranges for rows and columns
        {
            System.out.println("OUT OF RANGE");
            return; 
        }
        
        int a[][] = new int[m][n];
        
        for (int i = 0; i < m; i++) 
        {
            System.out.println("ENTER ELEMENTS FOR ROW " + (i + 1) + ": ");        
            for (int j = 0; j < n; j++)
            {
                a[i][j] = in.nextInt();
                
                if (a[i][j] < 0 || a[i][j] > 7)                   // Validate matrix element range
                {
                    System.out.println("INVALID INPUT");
                    return;
                }

            }

        }
        
        System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");
        
        for (int i = 0; i < m; i++)         
                                                   // Convert each row from octal to decimal and print
        {
            int decNum = 0; 
            for (int j = 0; j < n; j++) 
            {
                decNum += a[i][j] * Math.pow(8, n - j - 1);
                System.out.print(a[i][j] + " ");                                 // Print matrix element
            }
            System.out.print("\t\t" + decNum);
            System.out.println();
        }

    }                                                                                                              //End of main()

}                                                                                                                   //End of class
