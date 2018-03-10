/*Author: Arica Chakraborty*/
import org.checkerframework.checker.nullness.qual.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IntegerNumbers {
    public static void main(String args[]) throws IOException{
	//Accepting input from the keyboard using a BuffereReader class object
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a digit: ");      
        int a= Integer.parseInt(br.readLine());		//taking an integer as input u sing the parseInt() method
        System.out.println("The value of a is: "+a);    //printing the value to the console
        String str =Integer.toString(a);		//Converting an integer to string usinfg the toString() method
        System.out.println("str: "+str);	 	//printing the value to the console
        int b= Integer.parseInt("34",10);               //using the parseInt(String,r) method to parse the string input to a signed integer with the radix r
        System.out.println("b: "+b);			//printing the result of the above method to the console
        Integer c= Integer.valueOf(b);			//using the method valueOf(b) which returns an Integer instance representing the specified int value.
        System.out.println("c: "+c);			//printing the result of the above method to the console
        int d= Integer.compare(5,6);			//comparing two integer values 
        System.out.println(d);				//printing the result of the above method to the console
    }
}
