/**
 * 
 */
package a_factorymethod.example3;

/**   
 * @ClassName:  Operate   
 * @Description:操作
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午9:58:59   
 */
public abstract class Operate {

	/**
	 * 
	 */
	public Operate() {
		// TODO Auto-generated constructor stub
	}
	
	protected abstract ExportFileAPI factoryMethod() ;
	
	/**
	 * 具体的导出由哪个导出由子类去决定
	 * @param data
	 * @return
	 */
	public boolean exprot(String data) {
		return factoryMethod().export(data);
	}

}
