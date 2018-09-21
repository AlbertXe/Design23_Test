package g_adapter.example3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi{
	String filepath = "adapter.log";

	@Override
	public List<LogModel> read() {
		ObjectInputStream ois = null;
		List<LogModel> logs = null;
		File file = new File(filepath);
		if(file.exists()){
			try {
				ois = new ObjectInputStream(
						new BufferedInputStream(new FileInputStream(file))
				);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				logs = (List<LogModel>)ois.readObject();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}finally {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return logs;
	}

	@Override
	public void write(List<LogModel> logs) {
		ObjectOutputStream oos = null;
		File file = new File(filepath);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			oos.writeObject(logs);
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

}
