package week1.prac1;

public class Javaprac {
	
	
	int input1 = 20;
	int input2 = 30;
	String phone ="SAMSUNG";
	String model ="JSeries7";
	int price = 70000;
	static int loop=10,i;
	
	
	public String getdetails()
	{
		System.out.println("The model of the phone is ="+phone);
		return(phone);
	}
	
	public String getdetail2()
	{
		System.out.println("The model of the phone is ="+model);
		return(model);

	}
	
	public int getprice()
	{
		System.out.println("the price"+price);
		return(70000);
	}
	
	
	public int getnumbers()
	{
		int output = input2+input1;
		return(output);
	}
	
	
	public static void main (String[]args)
	{
		Javaprac add = new Javaprac();
		add.getnumbers();
		System.out.println("value = "+add.getnumbers());
		
		add.getdetails();
		add.getdetail2();
		add.getprice();
	
		
		loop =1;
       while(loop<10)
		{
			System.out.println("The King");
			loop++;
		}
	loop=1;
	do 
	{
	System.out.println("The  not king");
		
		loop++;
	
	}
	while(loop<10);
	
	i=0;
	for(i=0;i<10;i++)
	{
		System.out.println("for looping");
	}
	
	
	}
	
	
	
	

}
