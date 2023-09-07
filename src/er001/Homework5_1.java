package er001;

import java.util.Scanner;

public class Homework5_1 {
	public void starSquare(int width, int height) {
		String yeah= "";
		for(int i= 0;i <height;i++) {
			for(int j= 0; j < width ; j++) {
				yeah+='*';
			}yeah += "\n";
		} System.out.println(yeah);
	}
	
	public static void main(String[] args) {
//	請設計一個方法為starSquare(int width, int height),
//	當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
		Homework5_1 a1 = new Homework5_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬:");
		int width = sc.nextInt();
		System.out.println("請輸入高:");
		int height = sc.nextInt();
		a1.starSquare(width,height);
	}

}
