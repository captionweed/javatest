package er001;

import java.util.Scanner;

public class HOMEWORK4_3 {
	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入年:");
		int year = sc.nextInt();
		System.out.println("請輸入: ");
		int month = sc.nextInt();
		System.out.println("請輸入: ");
		int day = sc.nextInt();
		
		int big1[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int big2[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		int sum = 0;
		if(year%4==0 && year%100!=0 ||year%400==0) {
			for(int i = 1 ;i < month ; i++) {
				sum += big1[i];
			}
			sum+=day;
			System.out.println("輸入的日期為該年第" + sum +"天");
		}else {
			for(int i = 1 ;i < month ; i++) {
				sum += big2[i];
			}
			sum+=day;
			System.out.println("輸入的日期為該年第" + sum +"天");
		}
		
	}
}
