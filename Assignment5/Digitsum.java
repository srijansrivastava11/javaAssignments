package Assignment5;

import java.util.Scanner;

public class Digitsum {
	static int findSum(int N){
        if(N<10)
            return N;

        int sum = 0;
        while(N>0){
            sum =sum+ N%10;
            N = N/10;
        }
        return findSum(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit");
        int N=sc.nextInt();
        int result = findSum(N);
        System.out.println("Sum of digits in a number " + N + " till it become a single digit: " + result);
       
    }

}
