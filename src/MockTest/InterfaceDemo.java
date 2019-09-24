package MockTest;

public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println("This is beginning");
		itest i1= new Twelvth();
		i1.display();
	}

}

interface itest {
	public void display();
	
}

class Twelvth implements itest{
	public void display() {
		System.out.println("Display Method");
	}
}