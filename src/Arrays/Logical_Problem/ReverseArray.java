package Arrays.LogicalProblem;

public class ReverseArray {
    public static void reverse(int arr[])
    {
        int a=0;
        int b=arr.length-1;
        while(a<b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }

    }
    public static void display(int arr[]){

    }
}
