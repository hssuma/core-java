class Hospital
{
	{
		System.out.println("\nThis is the 1st block of Hospital class");
		System.out.println("Always blocks are executed first in series");
		System.out.println("There are two types of blocks in java");
		System.out.println("1 static block");
		System.out.println("2 instance block");
		System.out.println("Here 1st block of Hospital class will end");
	}
	
	{

		System.out.println("\nThis is the 2nd block of Hospital class");
		System.out.println("	1 Static block		");
		System.out.println("The static block are the blocks which will execute before the instance bocks");
		System.out.println("Static blocks , methods and variable or refrences are stored in the metaspace");
		System.out.println("JVM will first look for the static blocks, methods to execute before others");
		System.out.println("here 2nd block of Hospital class will end ");
	}
	
	static 
	{
		System.out.println("This is the static block of Hospital class");
	}
	
	{
		System.out.println("\n This is the 3rd block of Hospital class");
		System.out.println("	2 Instance block");
		System.out.println("Instance blocks will execute after creating object of a class");
		System.out.println("Here 3rd block of Hospital class will end");
	}
}