package String.Level2;

import java.util.Scanner;

public class WordLengthTable {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static String[] splitText(String text) {
        int length = findLength(text);
        int words = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return result;
    }

    public static String[][] wordLengthArray(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitText(text);
        String[][] data = wordLengthArray(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" +
                    Integer.parseInt(data[i][1]));
        }

        input.close();
    }
}
