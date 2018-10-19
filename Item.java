/* ENSF 480 - Lab 5 Exercise A and B
 * M. Moussavi, October 2018
 */

class Item <E extends Number & Comparable<E> >{
	private E item;
	public Item(E value) {
		item = value;
	}
	
	public void setItem(E value){
		item = value;
	}
	
	public E getItem(){
		return item;
	}
	
	public int compareTo(Item<E> a)
	{
		if(item.compareTo(a.item) > 0)	return 1;
		else if(item.compareTo(a.item) < 0) return -1;
		else return 0;
	}
}
