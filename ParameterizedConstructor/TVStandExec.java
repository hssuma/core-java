class TVStandExec
{
	public static void main(String []args)
	{
		TVStand refrence = new TVStand();
		

		TVStand ref = new TVStand("3m", "black");
		ref.display();
		
		TVStand ref1 = new TVStand("5m", "balck");
		ref1.display();
		
		TVStand ref2 = new TVStand("7m", "Brown");
		ref2.display();
		
		TVStand ref3 = new TVStand("9m", "Brown");
		ref3.display();
		
		TVStand ref4 = new TVStand("9m", "Black");
		ref4.display();
		
		TVStand ref5 = new TVStand("7m", "Black");
		ref5.display();
		
		TVStand ref6 = new TVStand("11m", "Black");
		ref6.display();
		
		TVStand ref7 = new TVStand("11m", "Brown");
		ref7.display();
		
		TVStand ref8 = new TVStand("13m ", "Black");
		ref8.display();
		
		TVStand ref9 = new TVStand("13m", "Brown");
		ref9.display();
		
		TVStand ref10 = new TVStand("15m", "Black");
		ref10.display();
		
		System.out.println("creating copy using 3 param");
		TVStand s1 = new TVStand("Ikea", 4500, "11");
		s1.displayDetails();
	}
}