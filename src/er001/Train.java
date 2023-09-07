package er001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	@Override
	public int compareTo(Train t) { // compareTo與TreeSet搭配
		if (this.number > t.number) {
			return 1;
		} else if (this.number == t.number) {
			return 0;
		} else
			return -1;
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getnumber() {
		return number;
	}

	public String gettype() {
		return type;
	}

	public String getstart() {
		return start;
	}

	public String getdest() {
		return dest;
	}

	public double getprice() {
		return price;
	}

	public void setnum(int number) {
		if (number > 0) {
			this.number = number;
		} else {
			System.out.println("請輸入正確數字");
		}
	}

	public void settype(String type) {
		this.type = type;
	}

	public void setstart(String start) {
		this.start = start;
	}

	public void setdest(String dest) {
		this.dest = dest;
	}

	public String toString() { // toString()
		return "No." + number + type + "列車從" + start + dest;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}

	public static void main(String[] args) {
		// 1.寫一隻程式，印出不重複train物件(Set-HashSet)
		System.out.println("=======HashSet=======");
		Set<Train> trainSet = new HashSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		trainSet.add(t1);
		trainSet.add(t2);
		trainSet.add(t3);
		trainSet.add(t4);
		trainSet.add(t5);
		trainSet.add(t6);
		trainSet.add(t7);

		// 迭代器
		System.out.println("迭代器 :");
		Iterator<Train> obj1 = trainSet.iterator();
		while (obj1.hasNext()) { // hasNext() =>回傳boolean
			System.out.println(obj1.next());
		}
		// for迴圈 => 無法使用
		// for each
		System.out.println("for each : ");
		for (Train col1 : trainSet) // 要加toString才能印出Train裡的內容
			System.out.println(col1);

		// 2.寫一隻程式，讓train物件印出時，能以班次編號由大到小排序(ArrayList)
		System.out.println("=======trainList=======");
		List<Train> trainList = new ArrayList<Train>();
		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t5);
		trainList.add(t6);
		trainList.add(t7);
		Collections.sort(trainList); // sort()搭配list使用，進行排序
		// 迭代器 //印出不重複!!hasCode equals
		System.out.println("迭代器 : ");
		Iterator<Train> obj2 = trainList.iterator();
		while (obj2.hasNext())
			System.out.println(obj2.next());
		// for迴圈
//					System.out.println("for迴圈 : ");
//						for(int i = 0 ; i<=trainList.size(); i++) {
//							System.out.println(set.next());
//						}
		// for each
		System.out.println("for each : ");
		for (Train col3 : trainList)
			System.out.println(col3);
		// 3.不僅達到大小排序，還可以不重複印出同樣物件(TreeSet)
		System.out.println("=======treeSet=======");
		Set<Train> treeset = new TreeSet<Train>();
		treeset.add(t1);
		treeset.add(t2);
		treeset.add(t3);
		treeset.add(t4);
		treeset.add(t5);
		treeset.add(t6);
		treeset.add(t7);
//					//迭代器
		System.out.println("迭代器 : ");
		Iterator<Train> obj3 = treeset.iterator();
		while (obj3.hasNext())
			System.out.println(obj3.next());
//					//for迴圈
//					//for each
		System.out.println("for each : ");
		for (Train col3 : treeset) // 回傳的資料型態是?
			System.out.println(col3);

	}
}
