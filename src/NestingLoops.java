
public class NestingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=0,count=0;
     while(i<3)
     {
    	 for(int j=0;j<4;j++)
    	 {
    		 int k=0;
    		 do
    		 {
    				System.out.println("i ="  +  i + " j ="  +  j + " k ="  +  k);
    				k++;
    				count++;
    		 }while(k<5);
    	 }
    	 i++;
     }
 	System.out.println("Total count is:" +count);
	}
}
