
public class IFElsestatements {

	public static void main(String[] args) {
		int num=(int)(Math.random()*20);
		//System.out.println(num);
		if(num>10)
			System.out.println(num + " is greater than 10");
		else if(num>5 && num<8)
			System.out.println(num + " is between 10 and 5" );
		else
			System.out.println(num + " is less than 10");
	}

}
