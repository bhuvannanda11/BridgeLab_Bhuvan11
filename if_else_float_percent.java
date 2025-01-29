// DAY 02(28 Jan 2025)

import java.util.*;
public class if_else_float_percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int english = sc.nextInt();
        int mathematics = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();

        // float percentage = ((english+mathematics+physics+chemistry)*100)/400; 
        float percentage = (english+mathematics+physics+chemistry)/4.0f;

        System.out.println(percentage);
        if(percentage > 75){
            System.out.println("Distinction");
        }
        else if(percentage>=40 && percentage<=75){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
