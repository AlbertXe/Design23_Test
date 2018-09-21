package r_mediator.example2;
/**
 * 
 * @ClassName:  Colleague   
 * @Description:抽象父类  持有中介者
 * @author: 谢洪伟 
 * @date:   2018年9月18日 下午3:20:27
 */
public abstract class Colleague {
	private Mediator mediator = null;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public Mediator getMediator(){
		return mediator;
	}
}
