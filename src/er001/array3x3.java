package er001;

public class array3x3 {

	public static void main(String args[]) {
//	int r = (int)(Math.random()*31); //random的值 0<=x<1  	
	int x[][]= new int[3][3];
	int y[][]= new int[3][3];
//	int z[][]= new int[3][3];
	for(int i=0; i<x.length;i++) {
		for(int j= 0;j <x[i].length;j++) {
			x[i][j]=(int)(Math.random()*31);
		}
			
	}
	for(int i=0; i<y.length;i++) {
		for(int j= 0;j <y[i].length;j++) {
			y[i][j]=(int)(Math.random()*31);
		}		
	}
	
	System.out.println(x);
	}
}
