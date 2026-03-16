class DiaconHospital
{
	static String hospital = "Diacon Hospital";
	static String doctors[] = {"Dr.Shanmuk", "Dr.Shashi rekha", "Dr.Jyothi", "Dr.Prasanna", "Dr.Mahalakshmi", "Dr.Basavarajappa", "Dr.Mallesh"};
	static String patients[] ={"Avinash", "Priya", "Mamatha", "Kavya", "Suhas", "Madhura"};
	static String specialists[] = {"Diabetic", "Gynocologist", "Dermatology", "Cardialogist","orthopedican", "urologist", "pediatrician"};
	static String tests[] = {"blood test", "urine test", "Scanning", "X-ray"};
	
	
	static void doctor()
	{
		System.out.println("The list of doctors available are ");
		for (String doctor : doctors)
		{
			System.out.println(doctor);
		}
		System.out.println();
	}
	
	static void patients()
	{
		System.out.println("The patients are ");
		for(String patient : patients)
		{
			System.out.println(patient);
		}
	}
	
	static void specialists()
	{
		System.out.println("The available specialists are ");
		for(String specialist : specialists)
		{
			System.out.println(specialist);
		}
	}
	
	static void test()
	{
		System.out.println("\n The available tests in the "+hospital +" are ");
		for(String test : tests)
		{
			System.out.println(test);
		}
	}
	
	public static void main(String args[])
	{
	
		doctor();
		patients();
		specialists();
		test();
	
	}
}