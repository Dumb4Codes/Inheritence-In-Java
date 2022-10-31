
public class Inheritence {

	public static void main(String[] args) {
		
       Car car = new Car();

       Bicycle bicycle = new Bicycle();
       System.out.println(bicycle.pedals);
		System.out.println(car.wheels);

		bicycle.go();
	}

}
