package TestNG_FrameWork;

import org.testng.annotations.Test;

public class InvocationCount {

@Test(invocationCount=5)
public void sum()
{
	int c=10;
	System.out.println(c);
}
}
