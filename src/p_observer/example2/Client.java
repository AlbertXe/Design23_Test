package p_observer.example2;

public class Client {
	public static void main(String[] args) {
		NewsPaper subject = new NewsPaper();
		
		Reader reader1 = new Reader();
		reader1.setName("张三");
		Reader reader2 = new Reader();
		reader2.setName("李四");
		
		subject.attach(reader1);
		subject.attach(reader2);
		
		subject.setContent("本期内容是观察者");
	}
}
