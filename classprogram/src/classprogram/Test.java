package classprogram;
import java.util.Scanner;

class Student{
	int sid;
	String sname;                        
}

class Employee{
	int eid;
	String ename;
}
public class Test {
	
	public static void main(String[] args) {
		System.out.println("Enter the size of an array object");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Object[] o = new Object[size];
		
		for (int i = 0; i < o.length; i++) {
			System.out.println("which object you want to create");
			String classname = scan.next();
			if (classname.equalsIgnoreCase("Student")) {
				Student s = new Student();
				System.out.println("Enter student id");
				s.sid = scan.nextInt();
				System.out.println("Enter student name");
				s.sname=scan.next();
				o[i]=s;
			}
			else if (classname.equalsIgnoreCase("Employee")) {
					Employee e = new Employee();
					System.out.println("Enter employee id");
					e.eid=scan.nextInt();
					System.out.println("Enter employee name");
					e.ename=scan.next();
					o[i]=e;
			}
			else {
				System.out.println("+++++");
				System.exit(0);
           			}
						
		}
		
		System.out.println("========================================");
		for (int i = 0; i < o.length; i++) {
			Object o1 = o[i]; //upcasting
			if (o1 instanceof Student) {
				Student s1 = (Student)o1;
				System.out.println("Student details are:"+s1.sid+"\t"+s1.sname);
				
			} else if (o1 instanceof Employee){
				Employee e1 = (Employee)o1;
				System.out.println("Employee details are:"+e1.eid+"\t"+e1.ename);
			}			
		}
	}
}
