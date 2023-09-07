package er001;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Homewrok10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		String num =sc.next();   
		String regex = "^[-]?+\\p{Digit}++(.)?+\\p{Digit}*+$";  
			while(!num.matches(regex)) {
				System.out.println("數字格式不正確，請再次輸入一次!");
				System.out.println("請輸入數字:");
				num = sc.next();
			}
		
		System.out.println("欲格式化(1)千分位(2)百分比(3)科學記號");
		Double dN =  Double.parseDouble(num);
		int type = sc.nextInt();
		switch(type) {
		case(1):
			Format dfm1 = new DecimalFormat("#,###.00");
			System.out.println(dfm1.format(dN));
			break;
		case(2):
			Format dfm2 = new DecimalFormat("#00%");
			System.out.println(dfm2.format(dN));
			break;
		case(3):
			Format dfm3 = new DecimalFormat("0.###E0");
		 	System.out.println(dfm3.format(dN));
			break;
		}
	}
}
