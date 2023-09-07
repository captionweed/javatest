package er001;

//extends
class Homework9_1 extends Thread { // 用implements Runnable???
	String name;
	int bowl = 1;

	public Homework9_1() {
	}

	public Homework9_1(String name) {
		this.name = name;
	}

	public Homework9_1(int bowl) {
		this.bowl = bowl;
	}

//override
	public void run() {
		while (bowl <= 10) {
			System.out.printf("%s吃第%d碗飯%n", name, bowl);
			// 是甚麼意思?
			bowl++;
			int a = (int) (Math.random() * 2501 + 500);
			try {
				Thread.sleep(a);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了");
	}

	public static void main(String[] args) {
		System.out.println("=====大胃王比賽開始=====");
		Homework9_1 person1 = new Homework9_1("Luffy");
		Homework9_1 person2 = new Homework9_1("Yamato");
		Thread p1 = new Thread(person1);
		Thread p2 = new Thread(person2);
//start~
		p1.start();
		p2.start();
		try {
			p1.join();
			p2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("=====大胃王比賽結束=====");
	}
}