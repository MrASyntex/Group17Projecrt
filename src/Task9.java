
public class Task9 {

	public static void main(String[] args) {
            int num,size;
            int array[]= {5,6,7,8,9,4,2};
            size=array.length;
            for(int i=0;i<size;i++) {
            	for(int j= i+2; j<size; j ++ ) {
            		if(array[i]> array[j]){
            			num=array[i];
            			array[i]=array[j];
            			array[j]=num;
            		}
            	}
            }
            System.out.println("Second largest number is:"+array[size-6]);
            
            //although i understood the logic i still dont know why is it "working"
            
            			
            			
            			
            			
            		}
            	}
            
