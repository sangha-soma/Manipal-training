package MockTest;

public class SimpleInheritance {
	
	public static void main(String[] args) {
	System.out.println("This is Beginning");
	Nine n1=new Nine();
	n1.City1();
	n1.City2();
	n1.City3();
	n1.City4();
	Ten t1=new Ten();
	t1.City3();
	t1.City4();
	Eleven E1=new Eleven();
	E1.City4();
	
}
}
class Nine extends Ten{
	public void City1 () {
		System.out.println("Bangalore");
	}
	public void City2 (){
		System.out.println("Delhi");
		
	}
	
}

class Ten extends Eleven{
	public void City3(){
		System.out.println("Mumbai");
		
	}
}

class Eleven{
	public void City4() {
		System.out.println("Pune");
	}
}
