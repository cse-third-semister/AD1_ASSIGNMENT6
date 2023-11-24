package my_ad_assignment6;

import java.util.Arrays;
import java.util.HashMap;

import java.util.HashSet;

public class question3 {

	public static void main(String[] args) {
		int arr[] = {-4,0,1,2,3,5,6,8,9};
		HashMap <Integer,Integer> obj = new HashMap<>();
		for(int i:arr) {
			obj.put(i, obj.getOrDefault(i, 0)+1);
		}
		Arrays.sort(arr);
		int i= arr[0];
//		System.out.println(obj);
		while(i<=arr[arr.length-1]) {
			if(!obj.containsKey(i)) {
				System.out.println(i);
				
			}
			i++;
		}
		
		

	}

}
