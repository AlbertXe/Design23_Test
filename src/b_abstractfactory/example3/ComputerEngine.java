package b_abstractfactory.example3;
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
	
	public void makeComputer(AbstractFactory schema) {
		//1：首先准备好装机所需要的配件
		prepareHardwares(schema);
		//2：组装机器
		
		//3：测试机器
		
		//4：交付客户
	}

	private void prepareHardwares(AbstractFactory schema) {
		this.cpu = schema.createAPI_Cpu();
		this.mainBord = schema.createAPI_MainBoard();
		//测试
		cpu.calculate();
		mainBord.install();
	}
	
}
