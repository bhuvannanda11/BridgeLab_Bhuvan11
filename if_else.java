// DAY 02(28 Jan 2025)

// Write a program to check whether student received distinction 
//pass or fail based on the recent enter by the user
//Above 75 -> Resukt -distinction
// Above 40 and below 75 -> result - pass
// else fail
import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        if(result >= 75){
            System.out.println("Result is Distinction");
        }
        else if(result >=40 && result<75){
            System.out.println("Resut is Pass");
        }
        else{
            System.out.println("Result is Fail");
        }
    }    
}
