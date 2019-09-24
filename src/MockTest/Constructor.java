package MockTest;

public class Constructor {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		Five f1=new Five(); // This is the object
		f1.city();
	}

}

class Five{
	Five() {
		System.out.println("This is Constructor");
	}
	public void city(){
		System.out.println("Bangalore");
		
	}
}

//Constructor name is same as class name - In the above example Five is the constructor
//Constructor will be called by default when an object is created
//Constructor does not have any return type