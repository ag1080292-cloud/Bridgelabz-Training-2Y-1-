package RecursionbasicProblem;

public class GreatestCommonFactor {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int result = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);

    }

    }


