// DAY 02 (28 Jan 2025)

// write a program to find the largest and minimum element in an array
import java.util.*;
public class min_max_ele_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
            if(arr[i] < minEle){
                minEle = arr[i];
            }
        }
        
        System.out.println("Maximum Element in the array is :"+maxEle);
        System.out.println("Minimum Element in the array is :"+minEle);
    }
}
