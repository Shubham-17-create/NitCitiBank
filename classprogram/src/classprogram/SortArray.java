package classprogram;

public class SortArray {

	public static void main(String[] args) {
		 int a[] = {1,5,9,7,6};
		 int temp;
		 for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				    if (a[i]<a[j]) {
				    	temp=a[i];
				    	a[i]=a[j];
				    	a[j]=temp;
						
					}
				
			}
			
		}
		 for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		 System.out.println("The second largest number is:"+a[1]);

	}

}
