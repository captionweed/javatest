package er001;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework10_3 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日，例如:20110131)");
		String date = sc.next();
		String regex = "^[12]\\p{Digit}{3}((0[0-9])|(1[0-2]))(([0-2][0-9])|([3][0-1]))$";
		while(!date.matches(regex)) {
			System.out.println("日期輸入不正確，請重輸入一次");
			System.out.println("請輸入日期(年月日，例如:20110131)");
			date = sc.next();
		}
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
		int type = sc.nextInt();
		Date sdf= new SimpleDateFormat("yyyyMMdd").parse(date);   //??
		switch (type){
		case 1:
			Format sdf1= new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(sdf1.format(sdf));
			break;
		case 2:
			Format sdf2= new SimpleDateFormat("MM/dd/yyyy");
			System.out.println(sdf2.format(sdf));
			break;
		case 3:
			Format sdf3= new SimpleDateFormat("dd/MM/yyy");
			System.out.println(sdf3.format(sdf));
			break;
		}
	}
}