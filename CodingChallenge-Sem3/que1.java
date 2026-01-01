import java.util.*;
public class que1 {
    //Family PhotoGraph
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k = 3;
        int j =k;
        int n=arr.length-1;
        int i=0;
        while(i<n){
            while(i+j<n && j!=0){
                int temp = arr[i];
                arr[i] = arr[i+j];
                arr[i+j] = temp;
                j--;
            }
            j=k;
            i++;
        }
        for(int l=0;l<n;l++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
