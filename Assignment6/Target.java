package Assignment6;

import java.util.*;

public class Target {

	public static void main(String[] args) {
		Scanner count = new Scanner(System.in);
		List<Integer> A = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter element to insert in array A: (type q to exit)");
		// Entering values in array A
		while (input.hasNextLine()) {
			if(input.hasNextInt()) {
				int val = input.nextInt();
				A.add(val);
			}
			else {
				break;
			}
		}
		
		Scanner trgt = new Scanner(System.in);
		System.out.println("Enter the target value");
		int target = trgt.nextInt();
		input.close();
		trgt.close();
		
		Integer res = getClosestIndex(A, target);
		System.out.println("Index with closest number to target is: " + res);
	}
	
	public static Integer getClosestIndex(List<Integer> A, int target) {
		if (A== null || A.size() == 0) {
			throw new NullPointerException();	    
	    }
		TreeMap kv = new TreeMap<Integer, Integer>();
		for (int i = 0; i < A.size(); i++) {
			int distance = Math.abs(A.get(i) - target);
			kv.put(distance, i);
		}
		
		return (Integer) kv.get(kv.firstKey());
	}
}
