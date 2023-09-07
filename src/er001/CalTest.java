package er001;

import java.util.Scanner;
import java.util.InputMismatchException;


public class CalTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try{
				Scanner sc1 = new Scanner(System.in);
				System.out.println("請輸入X值");
				int x = sc1.nextInt();
				System.out.println("請輸入Y值");
				int y = sc1.nextInt();
				Calculator cal = new Calculator(x, y);
				cal.calpow();
				break;
			} catch(CalException e){
				System.out.println(e);
			}catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");

				sc.nextLine();
				
			}
		
		}
		sc.close();

	}

}
