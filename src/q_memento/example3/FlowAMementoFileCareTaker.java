package q_memento.example3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 负责在文件中保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoFileCareTaker {
	/**
	 * 保存备忘录对象
	 */
	public void saveMemento(FlowAMockMemento memento){
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("FlowAMemento")));
			oos.writeObject(memento);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 获取被保存的备忘录对象
	 */
	public FlowAMockMemento retriveMemento(){
		FlowAMockMemento memento = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("FlowAMemento")));
			memento = (FlowAMockMemento) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return memento;
	}
}
