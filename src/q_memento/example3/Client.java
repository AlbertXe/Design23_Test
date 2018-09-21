package q_memento.example3;

public class Client {
	public static void main(String[] args) {
		FlowAMock mock = new FlowAMock("testFlow");
		mock.runPhaseOne();
		
		FlowAMementoFileCareTaker careTaker = new FlowAMementoFileCareTaker();
		FlowAMockMemento memento = mock.getMemento();
		careTaker.saveMemento(memento);
		
		mock.schema1();
		
		mock.setMemento(careTaker.retriveMemento());
		
		mock.schema2();
		
	}
}
