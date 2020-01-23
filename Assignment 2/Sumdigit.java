import java.util.*;
import java.util.Scanner;

public class Sumdigit {
      
    static int digSum(int n) 
    { 
        int sum = 0; 
  
        // Loop to do sum while 
        // sum is not less than 
        // or equal to 9 
        while (n > 0 || sum > 9)  
        { 
            if (n == 0) { 
                n = sum; 
                sum = 0; 
            } 
            sum += n % 10; 
            n /= 10; 
        } 
        return sum; 
    } 
      
    // Driver code 
    public static void main(String argc[]) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter digits to add");
    	int n = sc.nextInt();
        //int n = 1234; 
        System.out.println("Result = "+digSum(n)); 
    } 
} 