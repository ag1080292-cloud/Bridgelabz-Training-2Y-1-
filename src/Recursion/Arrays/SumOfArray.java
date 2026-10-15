package Recursion.Arrays;

public class SumOfArray {
    public static int sum(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        int add=sum(arr,i+1);
        return add+arr[i];
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,3,2};
        System.out.println(sum(arr,0));
    }
}
