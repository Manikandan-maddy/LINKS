package week1.prac1;

public class Assignment1 {
	
	 //find give number is prime number
	//true or false
	
	static int prime=16;
	
	public boolean getprimeNumber(int num)
	{
		if(num ==1)
			return false;
		
		for (int i=2;i<num;i++)
		{
			if (num % i ==0)
				return false;
			else
				return true;
		}
		return false;
	}

	
	public static void main(String[]args)
	{
		Assignment1 a= new Assignment1();
		if (a.getprimeNumber(prime))
			System.out.println("The given value is prime number ="+prime);
		else
			System.out.println("The given value is not prime number ="+prime);
	}
	
}
