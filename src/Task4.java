
public class Task4 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 int [] [] numbers= {
                		 {4,5,6,7},{11,13,15,17},{23,45,89,43}
                 };
                 int sumOfEven=0;
                 int sumOfOdd=0;
                 for (int i=0;i<numbers.length;i ++) {
                	 for (int j=0;j<numbers[i].length; j++) {
                		 if(numbers[i][j]% 2==0) {
                			 sumOfEven+=numbers[i][j];
                			 System.out.println(numbers[i][j]);
                			 
                		 }
                	 }
                	 
                 }
                 System.out.println("Sum of Even numbers is :"+ sumOfEven);
                 for (int i=0;i< numbers.length;i++) {
                	 for(int j=0;j<numbers[i].length;j ++) {
                		 if(numbers[i] [j]%2==1){
                			 sumOfOdd+=numbers[i][j];
                			 System.out.println("Sum of Odd number is"+" "+sumOfOdd);
                			 
                		 }
                	 }
                	 
                 }
                 }
	}

