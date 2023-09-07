package er001;

public class Homework5_3 {
	public static void main(String[] args) {
		System.out.print(genAuthCode());
	}
	
	public static String genAuthCode() {
		System.out.println("隨機產生8碼:");
		String ran = "";
		int r;
		for(int i = 0; i < 8 ;i++) {
			int num = (int)(Math.random()*3);
			if(num==0) {
				r = 48 + (int)(Math.random()*10);
			}else if(num==1) {
				r = 65 + (int)(Math.random()*26);
			}else {
				r = 97 + (int)(Math.random()*26);
			} ran +=(char)r;
		}	 return ran;
	}	
		
}
