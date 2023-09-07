package er001;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework7_2 {
	public static void main(String[] args) {
		try {
			//建構子("xxx",ture) =>true 為append功能，表示新增的資料將附加於原始資料之後
			//false =>表示會覆蓋掉原始資料
			FileOutputStream fos = new FileOutputStream("C:\\THA103_Workspace\\test001\\src\\er001\\Data.txt",false);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
				for(int i = 1 ; i <= 10 ; i++) {
					int random_num = (int)(Math.random()*1000+1);
					ps.println(random_num);
//					ps.flush();
				}
			ps.close();
			bos.close();
			fos.close();
		}catch (IOException e){
			System.err.println(e);
		}
	}

}
