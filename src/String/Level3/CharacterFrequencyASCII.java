package String.Level3;
import java.util.Scanner;

public class CharacterFrequencyASCII {

    public static String[][] characterFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (!visited[ch]) {
                uniqueCount++;
                visited[ch] = true;
            }
        }

        String[][] result = new String[uniqueCount][2];

        int index = 0;
        visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (!visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                visited[ch] = true;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[][] result = characterFrequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        input.close();
    }
}
