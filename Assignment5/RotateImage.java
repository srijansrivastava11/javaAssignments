package Assignment5;

public class RotateImage {
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
	}
	private static void displaymatrix(int[][] mat) {
		for (int i = 0; i <mat.length; i++) 
        { 
            for (int j = 0; j < mat.length; j++) 
                System.out.print(" " + mat[i][j]); 
       
            System.out.print("\n"); 
        } 
        System.out.print("\n"); 
		
	}
	public static void main(String args[]) {
		 int mat[][] = 
		        { 
		            {1,2,3}, 
		            {4,5,6}, 
		            {7,8,9}, 
		        }; 
		 rotate(mat);
		 displaymatrix(mat);
	}

}
