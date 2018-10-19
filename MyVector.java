import java.util.*;

public class MyVector<E extends Number & Comparable<E>> {
		
		private ArrayList<Item<E>> storageM;
		private Sorter<E> sorter;
		
		public MyVector(int n) {
			storageM=new ArrayList<Item<E>>(n);
		}
		
		public MyVector(ArrayList<Item<E>> arr) {
			storageM=arr;
		}
		
		public void add(Item<E> value) {
			//System.out.print("adding value: "+ value);
			storageM.add(value);
		}
		
		public void setSortStrategy(Sorter <E> s) {
			sorter = s;
		}
		
		public void performSort() {
			sorter.sort(storageM);
		}
		
		public void display() {
			for(int i = 0; i < storageM.size(); i++) 
				System.out.println(storageM.get(i).getItem() + " " + "\n");
			
		}

	
//	public static void main(String[] args) {
//		
//		
//	}

}
