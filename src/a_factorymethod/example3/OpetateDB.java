/**
 * 
 */
package a_factorymethod.example3;

/**   
 * @ClassName:  OpetateDB   
 * @Description:
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午10:05:51   
 */
public class OpetateDB extends Operate {

	/**
	 * 
	 */
	public OpetateDB() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see A_factorynethod.Operate#factoryMethod()
	 */
	@Override
	public ExportFileAPI factoryMethod() {
		return new ExportDBFile();
	}

}
