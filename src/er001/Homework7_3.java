package er001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Homework7_3 {
public static void main(String[] args) {
		
		File file1 = new File(".\\Homework7_3.txt");
		File file2 = new File("C:\\THA103_Workspace\\test001\\src\\er001\\Simple.txt");
		copyfile(file1, file2);
	}

	public static void copyfile(File file1, File file2) {   
		int i;
		try {
			FileReader fr = new FileReader(file2);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			 while((i = br.read()) != -1) {
				 pw.write(i);
			 }
			 
			 pw.close();
			 bw.close();
			 fw.close();
			 br.close();
			 fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
