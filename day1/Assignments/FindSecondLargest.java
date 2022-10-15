package week1.Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};		
		int total = 6;
		Arrays.sort(data);
		//String value=Arrays.toString(data);
		System.out.println("Sorted Array is:" + Arrays.toString(data));
		System.out.println("second Largest number is :" + data[total-2]);

	}

}
