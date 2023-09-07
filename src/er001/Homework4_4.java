package er001;

public class Homework4_4 {
	public static void main(String[] args) {
//		班上有8位同學,他們進行了6次考試結果如下:
//			請算出每位同學考最高分的次數
		int arr[][]= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		};
		
		int[] maxmium = new int[8];
		for(int i=0;i<arr.length;i++) {
			int big = 0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>big) {
					big=arr[i][j];
				}
			}
			
			for (int j = 0; j <arr[i].length;j++) {
				if(arr[i][j]==big) {
					maxmium[j]+=1;
				}
			}
		}
		for(int i= 0; i <maxmium.length;i++) {
			System.out.printf("%d號: %d次  ",i+1,maxmium[i]);
		}
	}

}
