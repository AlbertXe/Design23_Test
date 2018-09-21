package h_decorator.example5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @ClassName:  IOTest   
 * @Description:	流式读取文件
 * @author: 谢洪伟 
 * @date:   2018年9月14日 上午9:53:24
 */
public class IOTest {
	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream( new BufferedInputStream(new FileInputStream("data.xml")));
			byte[] bytes = new byte[dis.available()];
			dis.read(bytes);
			
			System.out.println(new String(bytes));
			
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
