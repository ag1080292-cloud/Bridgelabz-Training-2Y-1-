package String.Level3;
import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static char[] uniqueCharacters(String text) {

        String unique = "";

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < unique.length(); j++) {
                if (current == unique.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique += current;
            }
        }

        return unique.toCharArray();
    }

    public static String[][] characterFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
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
