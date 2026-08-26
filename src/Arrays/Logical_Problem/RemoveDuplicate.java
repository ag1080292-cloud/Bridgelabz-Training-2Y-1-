package Arrays.LogicalProblem;

public class RemoveDuplicate {
    public static void removeduplicate(int arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j=arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
    }
}
