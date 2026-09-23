package String.Level1;

public class NullPointerDemo {

    public static void generateException() {

        String text = null;

        // Generates NullPointerException
        System.out.println(text.length());
    }

    public static void handleException() {

        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        // Uncomment to see exception generation
        // generateException();

        handleException();
    }
}
