package MockTest;

public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		Six.city1(); // Static one is called directly
		Six.city2();
		Six s1=new Six(); //non static one is called using an object
		s1.city3();		
	}

}
class Six{
	public static void city1() {
		System.out.println("This is Bangalore");
	}
	public static void city2(){
		System.out.println("This is Chennai");
		
	}
	public void city3(){
		System.out.println("This is Mumbai");
		
	}
}