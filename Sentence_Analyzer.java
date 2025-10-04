import java.util.*;

public class Sentence_Analyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = in.nextLine();
        analyzeParagraph(paragraph);
    }

    public static void analyzeParagraph(String paragraph) {
        String[] sentences = paragraph.split("[.!?]");
        if (sentences.length != 2) {
            System.out.println("Invalid paragraph. It should contain exactly 2 sentences.");
            return;
        }

        String[] words1 = sentences[0].trim().split(" ");
        String[] words2 = sentences[1].trim().split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words1) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(sentences[0]);
        System.out.println(sentences[1]);

        System.out.println("COMMON WORDS FREQUENCY");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
