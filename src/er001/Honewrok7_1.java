package er001;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Honewrok7_1 {
	public static void main(String args[]) {
		int i;
		try {
			File dir = new File(".\\src\\homework7\\Sample.txt");
			FileReader fr = new FileReader(dir);
			BufferedReader br = new BufferedReader(fr);
			int char_sum = 0;
			int lines = 1;
				while ((i = br.read()) != -1) {
						char_sum += 1;
						if(i == (int)'\n') {   	   
							lines +=1;
						}
				}
				System.out.println("Sample.txt檔案共有"+dir.length()+"個位元組，"+char_sum+"個字元，"+lines+"列資料");
																					//dir.length() = 取得位元組
        br.close();
        fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
