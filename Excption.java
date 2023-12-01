package test.project;

public class Excption {

	public static void main(String[] args)
	{
		System.out.println("checking exception handling");
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("there is exception");
		}
		System.out.println("end");
		// TODO Auto-generated method stub

	}

}
