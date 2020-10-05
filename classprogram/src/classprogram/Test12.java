package classprogram;

@FunctionalInterface
 interface I {
	public abstract void m1();
}
class Test12 {
		public static void main(String[]  args ){
			I obj = new I() {
				
				public void m1(){
					System.out.println("inner abstract metthod");
				}
				
			};
			obj.m1();
			
		}
	
}
