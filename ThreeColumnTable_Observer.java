import java.util.*;
public class ThreeColumnTable_Observer implements Observer{
	private int idOfObserver;
	private ArrayList<Double> data;
	private Subject dList;
	
	//ctor
	ThreeColumnTable_Observer(Subject s)
	{
		dList = s;
		idOfObserver = ++DoubleArrayListSubject.id;
		s.registerObserver(this);
	}

	@Override
	public void update(ArrayList<Double> arr) {
		// TODO Auto-generated method stub
		data=arr;
		display();
	}
	
	public void display(){
		System.out.println("Notification to ThreeColumnTable_Observer: Data Changed: ");
		for(int i=1;i<=data.size();i++) {
			System.out.print(data.get(i-1) + " ");
			if(i%3 == 0) System.out.println();
		}
		System.out.println();

	}
	
}
