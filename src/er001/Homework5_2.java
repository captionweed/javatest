package er001;
//利用Overloading，設計兩個方法int maxElement(int x[][])
//與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖
public class Homework5_2 {
	public Homework5_2(){
		super();
	}
	int maxElement(int[][] array) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length ; i++) {
			for(int j= 0; j<array[i].length;j++)
				if(array[i][j]>max) {
					max=array[i][j];
				}
		}
		return max;
	}
	double maxElement(double[][] array) {
		double max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length ; i++) {
			for(int j= 0; j<array[i].length;j++)
				if(array[i][j]>max) {
					max=array[i][j];
				}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int[][] intArray= {
				{1,6,3},
				{9,5,2}
		};
		double[][] doubleArray= {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		
		Homework5_2 w = new Homework5_2();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
	

}
