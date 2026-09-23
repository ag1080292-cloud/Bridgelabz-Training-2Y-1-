package String.Level3;
import java.util.Scanner;

public class NestedLoopFrequency {

    public static String[] frequencyOfCharacters(String text) {

        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;

        for (char ch : chars) {
            if (ch != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {
                result[index++] =
                        chars[i] + " -> " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] result = frequencyOfCharacters(text);

        System.out.println("\nCharacter Frequencies:");

        for (String item : result) {
            System.out.println(item);
        }

        input.close();
    }
}
