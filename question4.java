package my_ad_assignment6;

import java.util.Arrays;

public class question4 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9};
		Arrays.sort(arr);
		System.out.print("Maximum pair ->" + arr[0] + ","+ arr[arr.length-1]);
		System.out.println();
		System.out.print("Minimum pair ->" + arr[0] + ","+ arr[1]);
		

	}

}
