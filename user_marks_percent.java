// Day 02(28 Jan 2025)
import java.util.*;
public class user_marks_percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[3];
        int arr[][] = new int[3][3];
        
        for(int i=0;i<names.length;i++){
            System.out.print("Enter the name of the user "+i+":");
            names[i] = sc.next();
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter the marks of the user:");
                arr[i][j] = sc.nextInt();
            }

        }
        

        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
            for(int j=0;j<3;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        int sumTotal[] = new int[3];       // total sum of marks of user(names)
        for(int i=0;i<names.length;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
               sum += arr[i][j];
               sumTotal[i] = sum;
            }
            System.out.println(" total marks of "+names[i]+" is "+ sumTotal[i]);
        }
        
        float ans[] = new float[3];
        for(int i=0;i<sumTotal.length;i++){
            ans[i] = sumTotal[i] / 3.0f;
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i] >=75){
                System.out.println("Result of "+names[i]+" is Distinction");
            }
            else if(ans[i] >=40 && ans[i]<75){
                System.out.println("Result of "+names[i]+" is Pass");
            }
            else{
                System.out.println("Result of "+names[i]+" is Fail");
            }
        }
    }
}
