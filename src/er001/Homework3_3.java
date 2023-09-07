package er001;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		int i;
		int num = 0;
		int[]arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入討厭的數字: ");
		i = sc.nextInt();
		System.out.println("以下為可選數字:");
		for (int j=1;j<49;j++) {
			if(j!=i) {
				System.out.println(j +"");
				num++;
			}else {
				
			}
		}
		System.out.println("可選數字有" + num +"個");
		System.out.println("幸運數字有:");
		
		while(arr[5]==0) {
			int num2 = (int) (Math.random() * 49 + 1);
			for(int c=0;c<arr.length;c++) {
				if(num2 == arr[c]) {
					break;
				}else if(arr[c]==0) {
					arr[c]= num2;
					System.out.println(num2 + "");
					break;
				}
			}

		}
	}

}
