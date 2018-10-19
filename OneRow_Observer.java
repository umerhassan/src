import java.util.*;
public class OneRow_Observer implements Observer{
	private int idOfObserver;
	private ArrayList<Double> data;
	private Subject dList;
	
	//ctor
	OneRow_Observer(Subject s)
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
		System.out.println("Notification to One-Row Observer: Data Changed: ");
		for(int i=0;i<data.size();i++) 
			System.out.print(data.get(i) + " ");
		System.out.println();
	}
	
	
}
