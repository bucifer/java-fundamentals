package terryspackage;

public class objects_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person ("Jim", "Smith", "New York");
		Person person2 = new Person ("Mason", "King", "LA");
		
		System.out.println(person1.city);
		System.out.println(person2.city);

		Car car1 = new Car ("Tesla", "Model S", 2013);
		Car car2 = new Car ("Nissan", "Leaf", 2012);
		car1.currentOwner = person1;
		car2.currentOwner = person2;
		
		System.out.println(car1.company + car1.model + car1.year + car1.currentOwner.firstName + car1.currentOwner.lastName);
		System.out.println(car2.company + car2.model + car2.year + car2.currentOwner.firstName + car2.currentOwner.lastName);
		
		Person person3= new Person ("John", "H", null);
		car1.currentOwner = person3;
		
		System.out.println(car1.company + car1.model + car1.year + car1.currentOwner.firstName + car1.currentOwner.lastName);
		System.out.println(car2.company + car2.model + car2.year + car2.currentOwner.firstName + car2.currentOwner.lastName);
	}	

}
