import java.util.*;
class Sentence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A SENTENCE: ");
       String s =sc.nextLine(); //input sentence.
        System.out.println("WORD TO BE DELETED: ");//input word to be deleted
        String wd = sc.nextLine();
         System.out.println("WORD POSITION IN THE SENTENCE: ");//input position of word
        int pos =sc.nextInt();
       
        int l= s.length(); //calculate length of sentence.
        char ch = s.charAt(l-1); //find last character in sentence.
        if(ch == '.' || ch == '?' || ch == '!')
        { //check if the sentence is terminated by either'.' '?' or '!' only.
              StringTokenizer st=new StringTokenizer(s,".?!");
         String f="";
         int n=st.countTokens();
        for(int i=1;i<=n;i++)
        { //iterate loop from 1 to n 
           String t=st.nextToken();
                if(i==pos && t.equals(wd))
                
                    continue; 
                else
                
                    f = f + t + " ";
                }
                f=f.trim() + ch;
                  System.out.println("OUTPUT:\n" + f);
                }
        else
        {
        
        System.out.println("INVALID INPUT");
      
    }

}
}