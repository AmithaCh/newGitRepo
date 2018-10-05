
public class BreakandCont {

	public void go()
	{
		System.out.println("first");
		System.out.println("last");

	}
	public static void main(String[] args) 
{
	//BreakandCont b=new BreakandCont();
	//b.go();
		for(int i=6;i<10;i++)
		{
			//if(i==6)
			if(i>=5 && i<=7)
				continue;
			System.out.println(i);
		}
		System.out.println("outside the loop");
}

}
