package Arrays.Sliding_Window;
import java.util.*;
public class Sum {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=3;
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        for(int i=1;i<=arr.length-k;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            System.out.println(sum);
        }
    }
}
