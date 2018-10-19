import java.util.*;
public interface Sorter <E extends Number & Comparable<E>> {

	public void performSort(ArrayList<Item<E>> arr); 

}
