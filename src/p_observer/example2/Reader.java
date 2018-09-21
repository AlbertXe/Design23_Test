package p_observer.example2;
/**
 * 
 * @ClassName:  Reader   
 * @Description:真正的读者
 * @author: 谢洪伟 
 * @date:   2018年9月17日 下午4:20:26
 */
public class Reader implements Observer {
	private String name;

	@Override
	public void update(Subject subject) {
		// 采用拉的方式
		System.out.println(name+"收到报纸"+((NewsPaper)subject).getContent());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
