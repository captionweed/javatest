package er001;

import java.util.Arrays;
import java.util.Scanner;

public class homework3_1 {
	public static void main(String[] args) {
		int i,j,k ;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入: ");
		i = sc.nextInt();
		System.out.println("請輸入: ");
		j = sc.nextInt();
		System.out.println("請輸入: ");
		k = sc.nextInt();
		int[] arr1 =new int[]{i,j,k};
		Arrays.sort(arr1);
		
		if(arr1[0]==arr1[2]){
			System.out.println("正三角形");	
		}else if(arr1[0]==arr1[1]&&arr1[1]!=arr1[2]) {
			System.out.println("等腰三角形");
		}else if(arr1[0]*arr1[0]+arr1[1]*arr1[1]==arr1[2]*arr1[2]) { 
			System.out.println("直角三角形");
		}else if(arr1[0]+arr1[1]>arr1[2]){
			System.out.println("其他三角形");
		}else {
			System.out.println("不是三角形");
		}

		
	}

}
