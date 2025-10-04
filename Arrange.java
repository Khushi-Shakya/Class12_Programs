import java.util.*;
class Arrange
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int w = arr.length;
        for (int i = 0; i < w - 1; i++) 
        {
            for (int j = 0; j < w - i - 1; j++) 
            {
                if (arr[j].length() > arr[j + 1].length()) 
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted String:");
        for (int i = 0; i < w; i++) 
        System.out.print(arr[i]+" ");
    }
}
