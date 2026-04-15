class Team
{
	String teamName;
	int numberOfMatchesPlayed;
	int numberOfMatchesWon;
	int numberOfMatchesLoss;
	double nrr;
	int lastFive[] = new int[5];
	
	void getTeamDetails()
	{
		System.out.println("The taeam name is "+teamName);
		System.out.println("The number of matches played "+numberOfMatchesPlayed);
		System.out.println("The number of matches won "+numberOfMatchesWon);
		System.out.println("The number of matches loss "+numberOfMatchesLoss);
		System.out.println("The nrr point is "+nrr);
		System.out.println("The last five matches are ");
		for(int last5 : lastFive)
			System.out.print(last5+"  ");
		System.out.println();
	}
}