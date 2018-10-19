
public interface Subject {
	
	abstract void registerObserver(Observer o);
	abstract void remove(Observer o);
	abstract void notifyAllObservers();
	abstract void display();
	
}
