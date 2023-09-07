package er001;

class Balance {
	private int money = 0; // 帳戶餘額

	synchronized public void input(int deposit) {
		while (money >= 3000) {
			try {
				System.out.println("媽媽看到餘額3000元以上，停止匯款");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += deposit;
		System.out.println("媽媽存了" + deposit + ",帳戶共有:" + money);
		notify();
	}

//熊大進行10次領錢
	synchronized public void output(int deposit) {
		while (money == 0) {
			try {
				System.out.println("雄大看到帳戶沒錢，暫停提款");
				wait();
				System.out.println("雄大被媽媽告知帳戶有錢");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= deposit;
		System.out.println("熊大領了" + deposit + ",帳戶共有:" + money);
		if (money <= 2000) {
			System.out.println("雄大看到帳戶剩2000元以下，要求匯款");
			notify();
		}
	}
}

//媽媽進行10次存錢
class Mom extends Thread {
	Balance money;

	public Mom(Balance money, String name) {
		this.money = money;
	}

//每次都存2000
	public void run() {
		for (int i = 1; i <= 10; i++) {
			money.input(2000);
		}
		//!!!!判斷不進wait()
	}
}

//熊大進行10次領錢
class Son extends Thread {
	Balance money;

	public Son(Balance money, String name) {
		this.money = money;
	}

//每次都領1000元
	public void run() {
		for (int i = 1; i <= 10; i++) {
			money.output(1000);
		}
	}
}

public class Homework9_2 {
	public static void main(String[] args) {
		Balance money = new Balance();
		Mom mom = new Mom(money, "媽媽");
		Son son = new Son(money, "雄大");
		mom.start();
		son.start();
	}
}

