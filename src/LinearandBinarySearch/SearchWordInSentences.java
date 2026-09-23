package LinearandBinarySearch;
import java.util.Scanner;

public class SearchWordInSentences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = input.nextInt();
        input.nextLine(); // consume newline

        String[] sentences = new String[n];

        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = input.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = input.nextLine();

        String result = "Not Found";

        // Linear Search
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                result = sentences[i];
                break;
            }
        }

        System.out.println("Result: " + result);

        input.close();
    }
}