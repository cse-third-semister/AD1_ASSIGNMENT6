package my_ad_assignment6;

import java.util.HashMap;
import java.util.HashSet;

public class Question1 {

	public static void main(String[] args) {
		int arr[] = {8,2,3,1,4,5,8,2,3,4,3};
		HashSet <Integer> obj = new HashSet<>();
		for(int i:arr) {
			if(obj.contains(i)) {
				System.out.println("First missing elements " + i );
				break;
				
			}
			else {
				obj.add(i);
			}
		}
		
		
		
	}

}
