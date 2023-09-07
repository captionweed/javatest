package er001;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Homework7_5 {
	public static void main(String[] args) {
		try {
			File myfile = new File("C:\\data\\Object.ser");
			FileInputStream fos = new FileInputStream(myfile);
			ObjectInputStream oos = new ObjectInputStream(fos);
			Object obj;
			try {
				while((obj = oos.readObject()) != null) {
					if (obj instanceof Cat) {
						((Cat) obj).speak();
					} else {
						((Dog) obj).speak();
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch(EOFException e1) {
				System.out.println("讀取完了");
			}
				oos.close();
				fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
