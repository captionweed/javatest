package er001;
import java.math.BigInteger;
import java.util.Iterator;

import java.util.ArrayList;

public class Homework8_1 {
	public static void main(String[] args) {
		//List
			
		//1.建立collection物件，將資料加入
		ArrayList <Object>list = new ArrayList <Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());    
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//2.印出所有物件(Iterator,傳統for和foreach)
		//foreach方法
		for(Object o : list)
			System.out.println(o);
		//for方法
//		for(int a=0 ; a<list.size(); a++)
//			System.out.println(list.get(a));
		System.out.println("-------------------------------------------------");
		
		//3.移除不是java.lang.Number物件
		System.out.println("移除不是java.lang.Number物件 : ");
		for(int b = 0 ; b <list.size(); b++) {
			if(!(list.get(b) instanceof Number)) {
				System.out.println("this size = " + list.size());
				list.remove(list.get(b));
				b--;
			}
		} 
		
		//4.再印出所有元素，觀察number相關物件移除
		for(Object o : list)
			System.out.println(o);
		}

}
