import java.util.Scanner;

public class Countchar {

	public static void main(String args[]) 
	{ 
			Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter 1 string");
	    	String str = sc.nextLine();
	    	System.out.println("Enter character");
	    	char c = sc.next().charAt(0);
	        System.out.println(count(str, c)); 
	} 
	
	public static int count(String s, char c) 
    { 
        int res = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            if (s.charAt(i) == c) 
            res++; 
        }  
        return res; 
    } 
      
}
