package my_ad_assignment6;

import java.util.HashMap;
import java.util.HashSet;

public class qustion2 {

	public static void main(String[] args) {
		int arr[] = {8,1,4,5,8,2,3,3};
		HashMap <Integer,Integer> obj = new HashMap<>();
		for(int i:arr) {
			obj.put(i, obj.getOrDefault(i, 0)+1);
		}
//		System.out.println(obj);
		for(int j:obj.keySet()) {
			if(obj.get(j) > 1) {
				System.out.println("duplicates elements are" + j);
			}
			
		}
		
		
		

	}

}
