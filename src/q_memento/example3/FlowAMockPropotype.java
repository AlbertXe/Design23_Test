package q_memento.example3;

import java.awt.Menu;

public class FlowAMockPropotype implements Cloneable {
	
	private String flowName;
	
	private int tempResult;
	
	private String tempState;

	public FlowAMockPropotype(String flowName){
		this.flowName = flowName;
	}
	
	/**
	 * 第一阶段
	 */
	public void runPhaseOne(){
		tempResult = 3;
		tempState = "PhaseOne";
	}
	
	public void schema1(){
		tempState += ",schema1";
		System.out.println(tempState+"now run:"+tempResult);
		tempResult += 11;
	}
	
	public void schema2(){
		tempState += ",schema2";
		System.out.println(tempState+"now run:"+tempResult);
		tempResult += 22;
	}
	/**
	 * 创建保存原发器对象的状态的备忘录对象
	 */
	public FlowAMockMemento createMemento(){
		
		try {
			return new MementoImplPrototype((FlowAMockPropotype)this.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
	 */
	public void setMemento(FlowAMockMemento memento){
		MementoImplPrototype mementoImplPrototype = (MementoImplPrototype) memento;
		this.tempResult = mementoImplPrototype.getFlowAMock().tempResult;
		this.tempState = mementoImplPrototype.getFlowAMock().tempState;

	}
	
	/**
	 * 真正的备忘录对象，实现备忘录窄接口
	 * 实现成私有的内部类，不让外部访问
	 */
	private static class MementoImplPrototype implements FlowAMockMemento{
		private FlowAMockPropotype flowAmock = null;
		
		public MementoImplPrototype(FlowAMockPropotype flowAMockPropotype){
			this.flowAmock = flowAMockPropotype;
		}
		
		public FlowAMockPropotype getFlowAMock(){
			return flowAmock;
		}
		
	}
	
}
