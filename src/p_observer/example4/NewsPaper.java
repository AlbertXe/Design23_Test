package p_observer.example4;

import java.util.Observable;

public class NewsPaper extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.setChanged();
		this.notifyObservers(content);
	}
	
	
}
