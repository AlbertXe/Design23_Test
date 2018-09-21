package q_memento.example3;

import java.io.Serializable;

public class FlowAMock implements Serializable{
	private String flowName;
	
	private String tempState;
	
	private int tempResult;
	
	public FlowAMock(String flowName){
		this.flowName = flowName;
	}
	
	public void runPhaseOne(){
		tempResult = 3;
		tempState = "Phase 1";
	}
	
	public void schema1(){
		tempState += "schema1";
		System.out.println(tempState+tempResult);
		tempResult += 11;
	}
	
	public void schema2(){
		tempState += "schema2";
		System.out.println(tempState+tempResult);
		tempResult += 22;
	}
	
	public FlowAMockMemento getMemento(){
		return new MementoImpl(tempResult,tempState);
	}
	
	public void setMemento(FlowAMockMemento memento){
		MementoImpl impl = (MementoImpl) memento;
		this.tempResult = impl.getTempResult();
		this.tempState = impl.getTempState();
	}
	
	private static class MementoImpl implements FlowAMockMemento{
		private int tempResult;
		
		private String tempState;
		
		public MementoImpl(int tempResult,String tempState){
			this.tempResult = tempResult;
			this.tempState = tempState;
		}

		public int getTempResult() {
			return tempResult;
		}

		public String getTempState() {
			return tempState;
		}
	}
}
