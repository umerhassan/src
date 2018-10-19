import java.util.*;
public class FiveRowsTable_Observer implements Observer{
	private int idOfObserver;
	private ArrayList<Double> data;
	private Subject dList;
	
	//ctor
	FiveRowsTable_Observer(Subject s)
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
		System.out.println("Notification to Five-Rows Table Observer: Data Changed: ");
		int k=0;
		for(int i=0;i<data.size();i++) {
			if(data.size() == k) break;
			for(int j=0;j<data.size();j++) {
				if((j-i)>=0 && (j-i)%5 == 0) {
					System.out.print(data.get(j) + " ");
					k++;
				}
			}
			System.out.println();
		}
		System.out.println();

	}
	
}
