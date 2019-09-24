package MockTest;

public class StaticOverload {

	public static void main(String[] args) {
		Eight.add(20, 30);
		Eight.add(10, 20, "Hello");
		Eight.add(0, 35, 15);

	}

}
class Eight{
	public static void add (int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void add (int c, int d, int e){
		int f=c+d+e;
		System.out.println(f);
		
	}
	public static void add(int a, int b, String msg){
		System.out.println("This is Mumbai");
		
	}
}