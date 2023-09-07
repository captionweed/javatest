package er001;

public class Animal {
	public int age;
	public float weight;
	
	public Animal (int age,float weight) {
		this.age= age;
		this.weight=weight;
	}
	

	public void speak() {
		
		System.out.println("Age is:" + age);
		System.out.println("Weight is:" + weight);
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getage() {
		return age;
	}
	
	public float getWeight() {
		return weight;
	}
}
