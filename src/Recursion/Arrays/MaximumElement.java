package Recursion.Arrays;

public class MaximumElement {
    public static int min(int arr[],int i) {
        if(i==arr.length-1){
            return arr[i];
        }
        int small=min(arr,i+1);
        return Math.min(small,arr[i]);

    }
    public static void main(String[] args) {
        int arr[]={1,5,4,3,2};
        System.out.println(min(arr,0));
    }
}




