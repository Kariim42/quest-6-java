
public class Classroom {

	public static void main(String[] args) {
		Wilder karim = new Wilder("karim", true);
		Wilder benjamin = new Wilder("Benjamin", false);
		Wilder vianney = new Wilder("Vianney", false);
		Wilder adam = new Wilder("Adam", true);
		
		System.out.println(karim.whoAmI(karim.isAware()));
		System.out.println(benjamin.whoAmI(benjamin.isAware()));
		System.out.println(vianney.whoAmI(vianney.isAware()));
		System.out.println(adam.whoAmI(adam.isAware()));

	}

}
