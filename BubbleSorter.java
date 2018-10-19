import java.util.ArrayList;

public class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E>{
	
	
	public void performSort(ArrayList<Item<E>> arr) {
		int n = arr.size();
		int i, j; 
		   for (i = 0; i < n-1; i++)   
			   //Last i elements are already in place 
			   for (j = 0; j < n-i-1; j++)  
		           if (arr.get(j).compareTo(arr.get(j+1)) > 0)  {
		        	  //swapping 
		        	  Item<E> temp = arr.get(j);
		        	  arr.set(j, arr.get(j+1)); 
		              arr.set(j+1, temp); 
		           }
		             
	}
}
