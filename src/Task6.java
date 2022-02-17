
public class Task6 {

	public static void main(String[] args) {
//Write a java program to check whether a given number is prime or not
		int i, m=0,flag=0;
		
		int n=5;   //[]//
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" "+"is not the prime number");
		}else {
			for(i=2;i<m; i++);
			if(n%i==0) {
				System.out.println(n+" "+"is not the prime number");
				flag=1;
				
			}
		}
		if(flag==0) {
			System.out.println(n+" "+" is the prime number");
			
			}
				
			
		}
	}


