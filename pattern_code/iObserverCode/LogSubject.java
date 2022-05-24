import java.util.*;
public class LogSubject {

	List<IObserver> observerList = new ArrayList<IObserver>();
	private String state;

	public String getState() {
		return state;
	}

	public void attach(IObserver observer) {
		observerList.add(observer);
	}

	public void detach(IObserver observer) {
		observerList.remove(observer);
	}

	public void setState(String state) {
		this.state = state;
		stateChanged();
	}

	private void stateChanged() {
		for (IObserver item: observerList) {
			item.update(getState());
		}
	}
}