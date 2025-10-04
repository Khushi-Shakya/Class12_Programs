import java.util.*;
	
class Ques_19 
{    
                                                                                                              //Start of class
    public static void main(String[] args) 
    {                                                                                                       //Start of main()
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER TWO SENTENCES");
        
        String s = sc.nextLine().toUpperCase(); 

                      // Read the entire input as a single string and convert it to uppercase
        
        StringTokenizer st = new StringTokenizer(s, ".!?");   
      
                      // Tokenize the input string based on sentence-ending punctuation
        
        int count = st.countTokens();

                                             // Count the number of tokens (sentences) in the input
        
        String[] ar = new String[count];           // Create an array to hold the sentences
        
        if (count != 2)                            // Check if exactly two sentences are provided
        {
            System.out.println("wrong input");
            System.exit(0);  
        }
        
        for (int i = 0; i < count; i++) 
        {
            String a = st.nextToken();
            ar[i] = a;
            System.out.println(a);                                              // Print each sentence
        }
        
        // Split each sentence into words
        String[] a = ar[0].split(" ");
        String[] b = ar[1].split(" ");
        
        int f = 1;
        
        System.out.println("Common words" + "\t" + "Frequency");
        
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++) 
            {
                if (a[i].equalsIgnoreCase(b[j]))
                    f++; 
            }
            if (f != 1)
                System.out.println(a[i] + "\t\t\t" + f);    
        }
        
    }                                                                                                              //End of main()
    
}                                                                                                                    //End of class
