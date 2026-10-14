package Recursion.Arrays;

public class Reverse {
    public static void Rev(int arr[],int index){
        if(index==arr.length){
            return;
        }
        Rev(arr,index+1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args){
        int arr[]={44,45,6,7,8};
        Rev(arr,0);
    }
}
