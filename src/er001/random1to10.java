package er001;

import java.util.Scanner;


public class random1to10 {
	
	public static void main(String args[]) {
		
	int r= (int)(Math.random()*10);
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入0~9:");
	int i= sc.nextInt();
	
	while(i!=r) {
		System.out.println("你G了");
		System.out.println("請輸入0~9:");
		int r= (int)(Math.random()*10);
		int i= sc.nextInt();
	}
	System.out.println("你Y了");
	}
}
