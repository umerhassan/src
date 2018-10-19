import java.util.*;
public class DoubleArrayListSubject implements Subject{

	private ArrayList<Double> data;
	private ArrayList<Observer> list;
	static int id = 0;
	
	//constructor
	DoubleArrayListSubject(){
		data = new ArrayList<Double>();
		list = new ArrayList<Observer>();
	}
	
	public void addData(Double d){
		data.add(d);
		notifyAllObservers();
	}
	
	public void setData(Double d, int observerID){
		data.set(observerID, d);
		notifyAllObservers();
	}
	
	public void populate(double[] d){
		for(int i = 0; i < d.length; i++)
			data.add(d[i]);
		notifyAllObservers();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
		id++;
		notifyAllObservers();
	}

	@Override
	public void remove(Observer o) {
		// TODO Auto-generated method stub
		list.remove(list.indexOf(o));
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(Observer o: list)
			o.update(data);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<data.size();i++) 
			System.out.print(data.get(i) + " " + "\n");
		
		
	}

}
