import java.util.*;
public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E>{

	public void performSort(ArrayList<Item<E>> arr) {
		int n=arr.size();
		int i, j;
		Item<E> key; 
		   for (i = 1; i < n; i++) 
		   { 
		       key = arr.get(i); 
		       j = i-1; 
		  
		       /* Move elements of arr[0..i-1], that are 
		          greater than key, to one position ahead 
		          of their current position */
		       while (j >= 0 && arr.get(j).compareTo(key) > 0) 
		       { 
		           arr.set(j+1,arr.get(j)); 
		           j = j-1; 
		       } 
		       arr.set(j+1, key); 
		   } 
	}
	
}
