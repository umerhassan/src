import java.util.ArrayList;

public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E>{
	
	
	public void performSort(ArrayList<Item<E>> arr) {
		int n = arr.size();
		 int i, j, min_idx; 
		  
		    // One by one move boundary of unsorted subarray 
		    for (i = 0; i < n-1; i++) 
		    { 
		        // Find the minimum element in unsorted array 
		        min_idx = i; 
		        for (j = i+1; j < n; j++) 
		          if (arr.get(j).compareTo(arr.get(min_idx)) < 0) 
		            min_idx = j; 
		  
		        // Swap the found minimum element with the first element 
		        Item<E> temp = arr.get(min_idx); 
	            arr.set(min_idx, arr.get(i)); 
	            arr.set(i,temp); 
		    } 
		             
	}
}
