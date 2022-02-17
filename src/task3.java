import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
				
		 int d;
         Scanner s =new Scanner(System.in);
         System.out.println("Enter the the number");
         d=s.nextInt();
         int  a[] = new int[d];
         System.out.println("Enter all the numbers");
         for (int i=0; i<d;i++){
         	
         	a [i] =s.nextInt();{
         		System.out.println("Odd numbers");
         		for(int i1=0; i1<d;i1++) {
         			if (a[i1] % 2 !=0) {
         				System.out.println(a[i1]+" ");
         				
         			}
         		}
         		System.out.println("---------");
         		System.out.println("Even Numbers");
         		for(int i1=0;i<d;i1++) {
         			if(a[i1] % 2 ==0 );
         			
         			
         		}
         		
         		
         		
         		
         	}
         	
         	
         	
         	
         	
         	
         	
         }
         
         
         
         
}

}


