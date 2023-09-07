package er001;

public class Homework4_1 {
	public static void main(String[] args) {
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double sum = 0;
		for(int i= 0;i<arr.length;i++) {
			sum += arr[i];
		}
		sum=sum/arr.length;	
		System.out.println("平均值:" + sum);
		System.out.println("大於平均值的元素:");
		for (int i= 0;i<arr.length;i++) {
			if(arr[i]>sum) {
				System.out.println(arr[i]+"");
			}
		}
		System.out.println("");

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
		
		String x = "Hello World";
		String reversedX = "";
		for (int i = 0; i < x.length(); i++)
			reversedX = x.charAt(i) + reversedX;
		System.out.println(reversedX);
		System.out.println("");


		
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		
		String[] y = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum1 = 0;
			for(int i=0;i <y.length;i++) {
				for(int j = 0;j < y[i].length();j++) {
					switch (y[i].charAt(j)) {
					case 'a':
						sum1+=1;
						break;
					case 'e':
						sum1+=1;
						break;
					case 'i':
						sum1+=1;
						break;
					case 'o':
						sum1+=1;
						break;
					case 'u':
						sum1+=1;
						break;
					
					}
				}
			}
		System.out.println(sum1);
	}

}
