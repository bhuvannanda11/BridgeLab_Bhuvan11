// DAY 02 (28 Jan 2025)
import java.util.*;

//Variables declared inside a class but outside any method, constructor, or block
// are instance variables.They belong to an instance of the class.
public class instance_variable {

    private int instance_var;   //instance variable with default value 0

    public void display(){
        System.out.println("Instance variable is :"+instance_var);
    }
    public static void main(String[] args) {
        instance_variable obj = new instance_variable();

        obj.instance_var  = 11;  //moidify the instance variable 
        obj.display();    //output : instance variable : 11
    }
}