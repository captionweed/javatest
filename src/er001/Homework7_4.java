package er001;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Homework7_4 {
	public static void main(String[] args) {
		try {
			
		File file = new File("C:\\data");   //建立資料夾
		//當沒有此資料夾時，使用mkdir();創建
		if(!file.exists()) {
				file.mkdir();
			}
		File myfile = new File("C:\\data\\Object.ser");  
		Cat cat1 = new Cat("CC1");
		Cat cat2 = new Cat("CC2");
		Dog dog1 = new Dog("DD1");
		Dog dog2 = new Dog("DD2");
		Object [] animals = {cat1, cat2, dog1, dog2};
		FileOutputStream fos = new FileOutputStream(myfile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i =0 ; i <animals.length; i++) {  
			oos.writeObject(animals[i]);
			oos.flush();
		}
		System.out.println("GO!!");
		oos.close();
		fos.close();
		
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}

}
