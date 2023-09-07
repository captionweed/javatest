package er001;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入: ");
		i = sc.nextInt();
		j = (int)(Math.random()*10);
		
		if(i==j) {
			System.out.println("猜對了");
		}else {
			System.out.println("難打頭,再猜一次");
			while(true) {
				i = sc.nextInt();
				if (i==j) {
					System.out.println("猜對了,牛!");
					break;
				}else {
					System.out.println("再來一次吧");
				}
			}
		}
		
	}

}
