class GYM
{
	static String trainers[]={"Harley Pasternak", "Duffy Gaver", "Basu Shanker ", " Cindy Jourdain", "Radhika Karle", "Deanne Pandey", "Rani jose", "Prashant Sawant"};
	static String equipments[] = {"Treadmills", "Ellipticals", "Rowing machines", "Dumbbels", "Barbells", "Weight plates", "kettleballs", "benches", "squat racks", "stair climber"};
	
	static void trainer()
	{
		System.out.println("The trainers are ");
		for(String trainer : trainers)
		{
			System.out.println(trainer);
		}
		System.out.println();
	}
	
	static void equipments()
	{
		System.out.println("Available equipments are ");
		for(String equipment : equipments)
		{
			System.out.println(equipment);
		}
	}
	
	public static void main(String ref[])
	{
		trainer();
		equipments();
	}

}