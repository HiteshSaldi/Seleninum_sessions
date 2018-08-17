package TestNG_FrameWork;

import org.testng.annotations.Test;

public class ExceptionTimeout {
/*	
	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void  infinteloop(){
		int i=1;
		while(i!=0)
		{
			System.out.println(i);
		}
	}
*/
	@Test(expectedExceptions=NumberFormatException.class)
	public void  test1(){
		String s="123a";
		Integer.parseInt(s);
	}

}
