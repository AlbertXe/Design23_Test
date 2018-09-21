package n_strategy.examole6;
/**
 * 
 * @ClassName:  LogStrategy   
 * @Description:a)解决和Template相同问题
				b)将算法封装到类，通过组合将具体算法在组合对象中实现
				c)Context持有一个Strategy对象，通过构造传入。有个方法内部调用Strategy 的算法。
				d)策略：将日志记录到不同位置 DB 文件
					实现日志的抽象模版：提供时间。就是在Strategy接口 和 具体算法之间 有个抽象类承上启下
 * @author: 谢洪伟 
 * @date:   2018年9月17日 下午2:38:33
 */
public interface LogStrategy {
	public void log(String msg);
}
