package er001;
//• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值
//並印出這10個亂數與平均值，如圖：
public class Homework5_1_2 {
	public static void main (String[] args) {
		System.out.println("結果:");
		randAvg();
	}
	public static void randAvg() {
		double total = 0;
		for(int i = 0; i < 10 ; i++) {
			int n = (int)(Math.random() * 101);
			System.out.println(n);
			
			total +=n;
		}
		System.out.println();
		System.out.print(total/10);
	}
}
