package p_observer.example2;

public class NewsPaper extends Subject {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		notifyObservers();
	}
	
	
}
