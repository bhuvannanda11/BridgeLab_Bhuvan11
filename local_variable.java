//DAY 02 (28 JAN 2025)
import java.util.*;
public class local_variable {
    public void display(){
        int a = 10;
        System.out.println("Local variable is :"+a);
    }
    public static void main(String[] args) {
        
/*
        LOCAL variable VS INSTANCE variable

        local variable is the variable that is declared inside a method, constructor
        Limited to the method or block where they are declared.
        Local variables do not have a default value. They must be initialized before use.
        Cannot use access modifiers (public, private, etc.) because they are scoped to the method/block.

        
 */
        local_variable obj1  = new local_variable();
        obj1.display();

//        System.out.println(a);    // this will give an error because local variable is not accessible here


    }
}
