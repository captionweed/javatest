package er001;

import java.util.Scanner;

public class Homework3_2plus {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入: ");
		i = sc.nextInt();
		j = (int)(Math.random()*100);
		
		if(i==j) {
			System.out.println("猜對了");
		}else if (i>j) {
			System.out.println("難打頭,你猜得比較大,再一次吧");			
		}else {
			System.out.println("難打頭,你猜得比較小,再一次吧");
		}
		while(true) {
				i = sc.nextInt();
				if(i==j) {
					System.out.println("猜對了");
					break;
				}else if(i>j) {
					System.out.println("難打頭,你猜得比較大,再一次吧");			
				}else {
					System.out.println("難打頭,你猜得比較小,再一次吧");
				}
			}
		}
		
	}


