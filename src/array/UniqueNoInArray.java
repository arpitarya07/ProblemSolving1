package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueNoInArray {
	
	public void findUniqueNoInArrayUsingHashmap(int[] arr) {
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		int val = 1;
		for(int i=0; i<arr.length; i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i],val);
			}
			else {
				hmap.put(arr[i],hmap.get(arr[i])+1);
			}
		}
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			if(entry.getValue().equals(1)) {
			System.out.print(entry.getKey()+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		UniqueNoInArray obj = new UniqueNoInArray();
		
		int[] arr = new int[] {1,28,46,46,54,46,7,88,1,140};
		obj.findUniqueNoInArrayUsingHashmap(arr);		
	}
}
