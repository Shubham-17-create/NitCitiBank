package classprogram;
class A {
private	static  int c=333;
	int d =444;
	void m1(){
		System.out.println("m1-A");
	}

	static class B{
		static int a = 111;
		public static void main(String[] s){
			System.out.println("main method-B");
		}
		void m1(){
			System.out.println("B-m1 method");
			System.out.println("a:"+a);
			System.out.println("c:"+c);
		    System.out.println(new A().d);
		}
	}
	public static void main(String[] s){
		System.out.println("main method-A");
	}
}
public class Test1 extends Thread {

	public static void main(String[] args) {
		
		A.B obj = new A.B();
		obj.m1();	
	}
}
