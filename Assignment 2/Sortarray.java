import java.util.Scanner;

public class Sortarray {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();
         }
        int maxvalue = getMaxValue(arr);
        int minvalue = getMinValue(arr);
        System.out.println("Max Element is"+ maxvalue);
        System.out.println("Min Element is"+ minvalue);

    }
    public static int getMaxValue(int[] numbers){
    	  int maxValue = numbers[0];
    	  for(int i=1;i < numbers.length;i++){
    	    if(numbers[i] > maxValue){
    		  maxValue = numbers[i];
    		}
    	  }
    	  return maxValue;
    	}
    public static int getMinValue(int[] numbers){
    	  int minValue = numbers[0];
    	  for(int i=1;i<numbers.length;i++){
    	    if(numbers[i] < minValue){
    		  minValue = numbers[i];
    		}
    	  }
    	  return minValue;
    	}

}
