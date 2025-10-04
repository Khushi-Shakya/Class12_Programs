import java.util.*;
public class Selection_Sort 
{    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) 
        {
            int k = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[k])
                    k = j;
            }
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t; 
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}