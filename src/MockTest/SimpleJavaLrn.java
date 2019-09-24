package MockTest;

public class SimpleJavaLrn {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		Three t1=new Three();
		t1.add(20, 40);
		t1.test_print("GoodMorning");

	}

}
class Three{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void test_print(String PrintMsg){
		System.out.println(PrintMsg);
		
	}
}
