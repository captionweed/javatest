package er001;

import java.util.Scanner;

public class tri {


	public static void main(String args[]) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			if(a==b&&b==c) {
				System.out.println("正三角形");
			}else if(a==b&&a==c&&b!=c) {
					System.out.println("等腰三角形");			
				}else 
			
			System.out.println("三角形");
		}
		else
			System.out.println("不是三角形");
		
		}
}

