//Java program to find largest among two
// numbers using ternary operator
import java.util.*;
public class ternaryOperator01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int largest = (a > b) ? a : b;
        //             condition ? if : else
        System.out.println(largest);
    }
    
}
