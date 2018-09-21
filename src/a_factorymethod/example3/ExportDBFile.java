/**
 * 
 */
package a_factorymethod.example3;

/**   
 * @ClassName:  ExportDBFile   
 * @Description:
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午9:55:51   
 */
public class ExportDBFile implements ExportFileAPI {


	/* (non-Javadoc)
	 * @see A_factorynethod.ExportFileAPI#export(java.lang.String)
	 */
	@Override
	public boolean export(String data) {
		System.out.println("导出成DB文件");
		return true;
	}

}
