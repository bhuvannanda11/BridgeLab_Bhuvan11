import java.util.*;
public class ternaryOperator {
    public static void main(String[] args) {
/*
num1 = 10;
num2 = 20;

res=(num1>num2) ? (num1+num2):(num1-num2)

Since num1<num2, 
the second operation is performed
res = num1-num2 = -10
*/        
        int num1 = 10;
        int num2 = 20;

        int result  = (num1 > num2) ? (num1 + num2) : (num1 - num2);

        System.out.println(result);  // output: -10

    }
}
