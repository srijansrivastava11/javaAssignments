package Assignment5;

public class Movezeros {
	public static void main(String []args){
        int arr[] = {0,1,0,3,12}; 
        moveZeroes(arr); 
        System.out.println("Array after pushing zeros to the back: "); 
        for (int i=0; i<arr.length; i++) 
            System.out.print(arr[i]+" "); 
     }
     
     
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] != 0) {
                if(i != pos) {
                    nums[pos] = nums[i];
                    nums[i] = 0;
                }
                pos++;
            }
        }
    }
}
