package my_ad_assignment6;

import java.util.HashMap;

public class question5 {

	public static void main(String[] args) {
		int arr[] = {8,1,4,5,8,2,3,3,8};
		HashMap <Integer,Integer> obj = new HashMap<>();
		for(int i:arr) {
			obj.put(i, obj.getOrDefault(i, 0)+1);
		}
//		System.out.println(obj);
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int j:obj.keySet()) {
			if(obj.get(j) > max) {
				max = obj.get(j);
				index = j;
			}
			
		}
		System.out.println("Maximum Numbers apears is " + index);

	}

}
