package RecursionbasicProblem;
import java.util.*;
public class SumOfDigits {
    public static int fact(int n){
        if(n<10){
            return n;
        }
        int a=n%10;
        int b=fact(n/10);
        return a+b;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(fact(123456));
    }

}
