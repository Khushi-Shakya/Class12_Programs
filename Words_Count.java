import java.util.*;
class Words_Count
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int f = st.countTokens();
        System.out.println("Number of words: "+f);
    }
}
