package RecursionbasicProblem;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int m = fact(n-1);
        return m*n;
    }

   public static void main(String[] args) {
       System.out.println(fact(5));

    }
}
