package b_abstractfactory.example4;
/**
 * 
 * @ClassName:  ComputerEngine   
 * @Description:装机工程师类
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午1:53:00
 */
public class ComputerEngine {
	private API_Cpu cpu;
	private API_MainBord mainBord;
	private API_Memary memary;
	
	public void makeComputer(AbstractFactory schema) {
		//1：首先准备好装机所需要的配件
		prepareHardwares(schema);
		//2：组装机器
		
		//3：测试机器
		
		//4：交付客户
	}

	private void prepareHardwares(AbstractFactory schema) {
		this.cpu = (API_Cpu) schema.create(1);
		this.mainBord = (API_MainBord) schema.create(2);
		this.memary = (API_Memary) schema.create(3);
		//测试
		cpu.calculate();
		mainBord.install();
		if (memary != null) {
			memary.cacheData();
		}
	}
	
}
