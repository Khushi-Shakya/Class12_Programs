import java.util.*;

class DeleteWord 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A SENTENCE: ");
        String s = sc.nextLine();
        System.out.print("WORD TO BE DELETED: ");
        String wd = sc.nextLine();
        System.out.print("WORD POSITION IN THE SENTENCE: ");
        int pos = sc.nextInt();
        int l = s.length();
        char ch = s.charAt(l - 1);
        if (ch == '.' || ch == '?' || ch == '!') {
            StringTokenizer st = new StringTokenizer(s, " .?!");
            int tokenCount = st.countTokens();
            String f = "";
            int c = 1;
            for (int i = 0; i < tokenCount; i++) {
                String token = st.nextToken();
                if (!token.equals(wd) || c != pos) {
                    f += token + " ";
                }
                c++;
            }
            f = f.trim() + ch;
            System.out.println("OUTPUT:\n" + f);
        } else
            System.out.println("INVALID INPUT");
}
}
