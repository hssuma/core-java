class IplExec
{
	public static void main(String args[])
	{
		Ipl ipl = new Ipl();
		
		Season season2022 = new Season();
		Table table = new Table();
		season2022.table = table;
		Team teamOne2022 = new Team();
		table.team = teamOne2022;
		
		System.out.println("\nThe points table of season 2022\n");
		teamOne2022.teamName = "GT";
		teamOne2022.numberOfMatchesPlayed = 14;
		teamOne2022.numberOfMatchesWon = 10;
		teamOne2022.numberOfMatchesLoss = 4;
		teamOne2022.nrr = 0.316;
		int gtlast5[]=	{0,0,1,1,0};
		teamOne2022.lastFive = gtlast5;
		teamOne2022.getTeamDetails();
		
		Team teamTwo2022 = new Team();
		teamTwo2022.teamName = "RR";
		teamTwo2022.numberOfMatchesPlayed = 14;
		teamTwo2022.numberOfMatchesWon = 9;
		teamTwo2022.numberOfMatchesLoss = 5;
		teamTwo2022.nrr = 0.298;
		int rrlast5[]=	{0,1,0,1,1};
		teamTwo2022.lastFive = rrlast5;
		teamTwo2022.getTeamDetails();
		
		Team teamThree2022 = new Team();
		teamThree2022.teamName = "LSG";
		teamThree2022.numberOfMatchesPlayed = 14;
		teamThree2022.numberOfMatchesWon = 9;
		teamThree2022.numberOfMatchesLoss = 5;
		teamThree2022.nrr = 0.251;
		int lsglast5[]=	{1,1,0,0,1};
		teamThree2022.lastFive = lsglast5;
		teamThree2022.getTeamDetails();
		
		Team teamFour2022 = new Team();
		teamFour2022.teamName = "RCB";
		teamFour2022.numberOfMatchesPlayed = 14;
		teamFour2022.numberOfMatchesWon = 8;
		teamFour2022.numberOfMatchesLoss = 6;
		teamFour2022.nrr = -0.253;
		int rcblast5[]=	{0,1,1,0,1};
		teamFour2022.lastFive = rcblast5;
		teamFour2022.getTeamDetails();
		
		Team teamFive2022 = new Team();
		teamFive2022.teamName = "DC";
		teamFive2022.numberOfMatchesPlayed = 14;
		teamFive2022.numberOfMatchesWon = 7;
		teamFive2022.numberOfMatchesLoss = 7;
		teamFive2022.nrr = 0.204;
		int dclast5[]=	{0,1,0,1,1};
		teamFive2022.lastFive = dclast5;
		teamFive2022.getTeamDetails();
		
		
		Team teamSix2022 = new Team();
		teamSix2022.teamName = "PBKS";
		teamSix2022.numberOfMatchesPlayed = 14;
		teamSix2022.numberOfMatchesWon = 7;
		teamSix2022.numberOfMatchesLoss = 7;
		teamSix2022.nrr = 0.126;
		int pbkslast5[]=	{1,1,0,1,0};
		teamSix2022.lastFive = pbkslast5;
		teamSix2022.getTeamDetails();
		
		Team teamSeven2022 = new Team();
		teamSeven2022.teamName = "KKR";
		teamSeven2022.numberOfMatchesPlayed = 14;
		teamSeven2022.numberOfMatchesWon = 6;
		teamSeven2022.numberOfMatchesLoss = 8;
		teamSeven2022.nrr = 0.146;
		int kkrlast5[]=	{0,1,0,1,1};
		teamSeven2022.lastFive = kkrlast5;
		teamSeven2022.getTeamDetails();
		
		Team teamEight2022 = new Team();
		teamEight2022.teamName = "SRH";
		teamEight2022.numberOfMatchesPlayed = 14;
		teamEight2022.numberOfMatchesWon = 6;
		teamEight2022.numberOfMatchesLoss = 8;
		teamEight2022.nrr = -0.379;
		int srhlast5[]=	{0,0,0,1,1};
		teamEight2022.lastFive = srhlast5;
		teamEight2022.getTeamDetails();
		
		Team teamNine2022 = new Team();
		teamNine2022.teamName = "CSK";
		teamNine2022.numberOfMatchesPlayed = 14;
		teamNine2022.numberOfMatchesWon = 4;
		teamNine2022.numberOfMatchesLoss = 10;
		teamNine2022.nrr = -0.203;
		int csklast5[]=	{0,1,0,0,0};
		teamNine2022.lastFive = csklast5;
		teamNine2022.getTeamDetails();
		
		Team teamTen2022 = new Team();
		teamTen2022.teamName = "MI";
		teamTen2022.numberOfMatchesPlayed = 14;
		teamTen2022.numberOfMatchesWon = 10;
		teamTen2022.numberOfMatchesLoss = 4;
		teamTen2022.nrr = -0.506;
		int milast5[]=	{0,1,0,1,1};
		teamTen2022.lastFive = milast5;
		teamTen2022.getTeamDetails();
		
		
		
		System.out.println("\n*******************************************************\n");
		
		System.out.println("The points table of season 2023\n");
		Season season2023 = new Season();
		Team team2023 = new Team();
		team2023.teamName= "RR";
		team2023.numberOfMatchesPlayed = 14;
		team2023.numberOfMatchesWon = 7;
		team2023.numberOfMatchesLoss = 7;
		team2023.nrr = 0.148;
		int rr2023[] =	{0,0,1,1,0};
		team2023.lastFive = rr2023;	
		team2023.getTeamDetails();
		
		Team teamTwo2023 = new Team();
		teamTwo2023.teamName = "GT";
		teamTwo2023.numberOfMatchesPlayed = 14;
		teamTwo2023.numberOfMatchesWon = 10;
		teamTwo2023.numberOfMatchesLoss = 4;
		teamTwo2023.nrr = 0.809;
		int gt2023[] = {1,1,1,1,0};
		teamTwo2023.lastFive = gt2023;
		teamTwo2023.getTeamDetails();
		
		Team teamThree2023 = new Team();
		teamThree2023.teamName = "CSk";
		teamThree2023.numberOfMatchesPlayed = 14;
		teamThree2023.numberOfMatchesWon = 8;
		teamThree2023.numberOfMatchesLoss = 5;
		teamThree2023.nrr = 0.652;
		int csk2023[] = {1,1,1,0};
		teamThree2023.lastFive = csk2023;
		teamThree2023.getTeamDetails();
		
		Team teamFour2023 = new Team();
		teamFour2023.teamName = "LSG";
		teamFour2023.numberOfMatchesPlayed = 14;
		teamFour2023.numberOfMatchesWon = 8;
		teamFour2023.numberOfMatchesLoss = 5;
		teamFour2023.nrr = 0.284;
		int lsg2023[] = {1,0,1,1};
		teamFour2023.lastFive = lsg2023;
		teamFour2023.getTeamDetails();
		
		Team teamFive2023 = new Team();
		teamFive2023.teamName = "MI";
		teamFive2023.numberOfMatchesPlayed = 14;
		teamFive2023.numberOfMatchesWon = 8;
		teamFive2023.numberOfMatchesLoss = 6;
		teamFive2023.nrr = -0.444;
		int mi2023[] = {1,1,0,0,1};
		teamFive2023.lastFive = mi2023;
		teamFive2023.getTeamDetails();
		
		Team teamSix2023 = new Team();
		teamSix2023.teamName = "RCB";
		teamSix2023.numberOfMatchesPlayed= 14;
		teamSix2023.numberOfMatchesWon = 7;
		teamSix2023.numberOfMatchesLoss = 7;
		teamSix2023.nrr =0.135;
		int rcb2023[] = {0,0,1,0,1};
		teamSix2023.lastFive = rcb2023;
		teamSix2023.getTeamDetails();
		
		Team teamSeven2023 = new Team();
		teamSeven2023.teamName = "KKR";
		teamSeven2023.numberOfMatchesPlayed =14 ;
		teamSeven2023.numberOfMatchesWon = 6;
		teamSeven2023.numberOfMatchesLoss = 8;
		teamSeven2023.nrr = -0.239;
		int kkr2023[] = {1,0,1,0};
		teamSeven2023.lastFive = kkr2023;
		teamSeven2023.getTeamDetails();
		
		Team teamEight2023 = new Team();
		teamEight2023.teamName = "PBKS";
		teamEight2023.numberOfMatchesPlayed =14 ;
		teamEight2023.numberOfMatchesWon = 6;
		teamEight2023.numberOfMatchesLoss = 8;
		teamEight2023.nrr = -0.304;
		int pbks2023[] = {0,0,1,0,0};
		teamEight2023.lastFive = pbks2023;
		teamEight2023.getTeamDetails();
		
		Team teamNine2023 = new Team();
		teamNine2023.teamName = "DC";
		teamNine2023.numberOfMatchesPlayed =14 ;
		teamNine2023.numberOfMatchesWon = 5;
		teamNine2023.numberOfMatchesLoss = 9;
		teamNine2023.nrr = -0.809;
		int dc2023[] = {1,0,1,0,0};
		teamNine2023.lastFive = dc2023;
		teamNine2023.getTeamDetails();
		
		Team teamTen2023 = new Team();
		teamTen2023.teamName = "SRH";
		teamTen2023.numberOfMatchesPlayed =14 ;
		teamTen2023.numberOfMatchesWon = 4;
		teamTen2023.numberOfMatchesLoss = 10;
		teamTen2023.nrr = -0.590;
		int srh2023[] = {1,0,0,0,0};
		teamTen2023.lastFive = srh2023;
		teamTen2023.getTeamDetails();
		
		
		
		System.out.println("\n*******************************************************\n");
		
		
		
		
		System.out.println("The points table of season 2024\n");
		Season season2024 = new Season();
		Team team2024 = new Team();
		team2024.teamName= "RR";
		team2024.numberOfMatchesPlayed = 14;
		team2024.numberOfMatchesWon = 4;
		team2024.numberOfMatchesLoss = 1;
		team2024.nrr = 0.889;
		int rr2024[] =	{1,1,1,1,0};
		team2024.lastFive = rr2024;	
		team2024.getTeamDetails();
		
		Team teamTwo2024 = new Team();
		teamTwo2024.teamName = "PBKS";
		teamTwo2024.numberOfMatchesPlayed = 14;
		teamTwo2024.numberOfMatchesWon = 3;
		teamTwo2024.numberOfMatchesLoss = 0;
		teamTwo2024.nrr = 0.720;
		int pbks2024[] = {1,1,1,0,0};
		teamTwo2024.lastFive = pbks2024;
		teamTwo2024.getTeamDetails();
		
		Team teamThree2024 = new Team();
		teamThree2024.teamName = "RCB";
		teamThree2024.numberOfMatchesPlayed = 14;
		teamThree2024.numberOfMatchesWon = 3;
		teamThree2024.numberOfMatchesLoss = 1;
		teamThree2024.nrr = 1.148;
		int rcb2024[] = {1,1,0,1,0};
		teamThree2024.lastFive = rcb2024;
		teamThree2024.getTeamDetails();
		
		Team teamFour2024 = new Team();
		teamFour2024.teamName = "SRH";
		teamFour2024.numberOfMatchesPlayed = 14;
		teamFour2024.numberOfMatchesWon = 2;
		teamFour2024.numberOfMatchesLoss = 3;
		teamFour2024.nrr = 0.576;
		int srh2024[] = {0,1,0,0,1};
		teamFour2024.lastFive = srh2024;
		teamFour2024.getTeamDetails();
		
		Team teamFive2024 = new Team();
		teamFive2024.teamName = "DC";
		teamFive2024.numberOfMatchesPlayed = 14;
		teamFive2024.numberOfMatchesWon = 2;
		teamFive2024.numberOfMatchesLoss = 2;
		teamFive2024.nrr = 0.322;
		int dc2024[] = {1,1,0,0};
		teamFive2024.lastFive = dc2024;
		teamFive2024.getTeamDetails();
		
		Team teamSix2024 = new Team();
		teamSix2024.teamName = "KKR";
		teamSix2024.numberOfMatchesPlayed= 14;
		teamSix2024.numberOfMatchesWon = 4;
		teamSix2024.numberOfMatchesLoss = 1;
		teamSix2024.nrr =0.567;
		int kkr2024[] = {1,1,1,0,1};
		teamSix2024.lastFive = kkr2024;
		teamSix2024.getTeamDetails();
		
		Team teamSeven2024 = new Team();
		teamSeven2024.teamName = "GT";
		teamSeven2024.numberOfMatchesPlayed =14 ;
		teamSeven2024.numberOfMatchesWon = 2;
		teamSeven2024.numberOfMatchesLoss = 2;
		teamSeven2024.nrr = -0.427;
		int gt2024[] = {1,0,1,0};
		teamSeven2024.lastFive = gt2024;
		teamSeven2024.getTeamDetails();
		
		Team teamEight2024 = new Team();
		teamEight2024.teamName = "LSG";
		teamEight2024.numberOfMatchesPlayed =14 ;
		teamEight2024.numberOfMatchesWon = 2;
		teamEight2024.numberOfMatchesLoss = 2;
		teamEight2024.nrr = 0.947;
		int lsg2024[] = {1,0,1,0};
		teamEight2024.lastFive = lsg2024;
		teamEight2024.getTeamDetails();
		
		Team teamNine2024 = new Team();
		teamNine2024.teamName = "MI";
		teamNine2024.numberOfMatchesPlayed =14 ;
		teamNine2024.numberOfMatchesWon = 2;
		teamNine2024.numberOfMatchesLoss = 3;
		teamNine2024.nrr = 0.947;
		int mi2024[] = {1,0,1,0,0};
		teamNine2024.lastFive = mi2024;
		teamNine2024.getTeamDetails();
		
		Team teamTen2024 = new Team();
		teamTen2024.teamName = "CSK";
		teamTen2024.numberOfMatchesPlayed =14 ;
		teamTen2024.numberOfMatchesWon = 2;
		teamTen2024.numberOfMatchesLoss = 3;
		teamTen2024.nrr = 0.947;
		int csk2024[] = {1,0,1,1,0};
		teamTen2024.lastFive = csk2024;
		teamTen2024.getTeamDetails();
	
		System.out.println("\n*******************************************************\n");
		
		
		
		System.out.println("The points table of season 2025\n");
		Season season2025 = new Season();
		Team team2025 = new Team();
		team2025.teamName= "RR";
		team2025.numberOfMatchesPlayed = 14;
		team2025.numberOfMatchesWon = 4;
		team2025.numberOfMatchesLoss = 1;
		team2025.nrr = 0.889;
		int rr2025[] =	{1,1,1,1,0};
		team2025.lastFive = rr2025;	
		team2025.getTeamDetails();
		
		Team teamTwo2025 = new Team();
		teamTwo2025.teamName = "PBKS";
		teamTwo2025.numberOfMatchesPlayed = 14;
		teamTwo2025.numberOfMatchesWon = 3;
		teamTwo2025.numberOfMatchesLoss = 0;
		teamTwo2025.nrr = 0.720;
		int pbks2025[] = {1,1,1,0,0};
		teamTwo2025.lastFive = pbks2025;
		teamTwo2025.getTeamDetails();
		
		Team teamThree2025 = new Team();
		teamThree2025.teamName = "RCB";
		teamThree2025.numberOfMatchesPlayed = 14;
		teamThree2025.numberOfMatchesWon = 3;
		teamThree2025.numberOfMatchesLoss = 1;
		teamThree2025.nrr = 1.148;
		int rcb2025[] = {1,1,0,1,0};
		teamThree2025.lastFive = rcb2025;
		teamThree2025.getTeamDetails();
		
		Team teamFour2025 = new Team();
		teamFour2025.teamName = "SRH";
		teamFour2025.numberOfMatchesPlayed = 14;
		teamFour2025.numberOfMatchesWon = 2;
		teamFour2025.numberOfMatchesLoss = 3;
		teamFour2025.nrr = 0.576;
		int srh2025[] = {0,1,0,0,1};
		teamFour2025.lastFive = srh2025;
		teamFour2025.getTeamDetails();
		
		Team teamFive2025 = new Team();
		teamFive2025.teamName = "DC";
		teamFive2025.numberOfMatchesPlayed = 14;
		teamFive2025.numberOfMatchesWon = 2;
		teamFive2025.numberOfMatchesLoss = 2;
		teamFive2025.nrr = 0.322;
		int dc2025[] = {1,1,0,0};
		teamFive2025.lastFive = dc2025;
		teamFive2025.getTeamDetails();
		
		Team teamSix2025 = new Team();
		teamSix2025.teamName = "KKR";
		teamSix2025.numberOfMatchesPlayed= 14;
		teamSix2025.numberOfMatchesWon = 4;
		teamSix2025.numberOfMatchesLoss = 1;
		teamSix2025.nrr =0.567;
		int kkr2025[] = {1,1,1,0,1};
		teamSix2025.lastFive = kkr2025;
		teamSix2025.getTeamDetails();
		
		Team teamSeven2025 = new Team();
		teamSeven2025.teamName = "GT";
		teamSeven2025.numberOfMatchesPlayed =14 ;
		teamSeven2025.numberOfMatchesWon = 2;
		teamSeven2025.numberOfMatchesLoss = 2;
		teamSeven2025.nrr = -0.427;
		int gt2025[] = {1,0,1,0};
		teamSeven2025.lastFive = gt2025;
		teamSeven2025.getTeamDetails();
		
		Team teamEight2025 = new Team();
		teamEight2025.teamName = "LSG";
		teamEight2025.numberOfMatchesPlayed =14 ;
		teamEight2025.numberOfMatchesWon = 2;
		teamEight2025.numberOfMatchesLoss = 2;
		teamEight2025.nrr = 0.947;
		int lsg2025[] = {1,0,1,0};
		teamEight2025.lastFive = lsg2025;
		teamEight2025.getTeamDetails();
		
		Team teamNine2025 = new Team();
		teamNine2025.teamName = "MI";
		teamNine2025.numberOfMatchesPlayed =14 ;
		teamNine2025.numberOfMatchesWon = 2;
		teamNine2025.numberOfMatchesLoss = 3;
		teamNine2025.nrr = 0.947;
		int mi2025[] = {1,0,1,0,0};
		teamNine2025.lastFive = mi2025;
		teamNine2025.getTeamDetails();
		
		Team teamTen2025= new Team();
		teamTen2025.teamName = "CSK";
		teamTen2025.numberOfMatchesPlayed =14 ;
		teamTen2025.numberOfMatchesWon = 2;
		teamTen2025.numberOfMatchesLoss = 3;
		teamTen2025.nrr = 0.947;
		int csk2025[] = {1,0,1,1,0};
		teamTen2025.lastFive = csk2025;
		teamTen2025.getTeamDetails();
		
		
		System.out.println("\n*******************************************************\n");


		System.out.println("The points table of season 2026\n");
		Season season2026 = new Season();
		Team team2026 = new Team();
		team2026.teamName= "RR";
		team2026.numberOfMatchesPlayed = 5;
		team2026.numberOfMatchesWon = 4;
		team2026.numberOfMatchesLoss = 1;
		team2026.nrr = 0.889;
		int rr2026[] =	{1,1,1,1,0};
		team2026.lastFive = rr2026;	
		team2026.getTeamDetails();
		
		Team teamTwo2026 = new Team();
		teamTwo2026.teamName = "PBKS";
		teamTwo2026.numberOfMatchesPlayed = 4;
		teamTwo2026.numberOfMatchesWon = 3;
		teamTwo2026.numberOfMatchesLoss = 0;
		teamTwo2026.nrr = 0.720;
		int pbks2026[] = {1,1,1,0,0};
		teamTwo2026.lastFive = pbks2026;
		teamTwo2026.getTeamDetails();
		
		Team teamThree2026 = new Team();
		teamThree2026.teamName = "RCB";
		teamThree2026.numberOfMatchesPlayed = 4;
		teamThree2026.numberOfMatchesWon = 3;
		teamThree2026.numberOfMatchesLoss = 1;
		teamThree2026.nrr = 1.148;
		int rcb2026[] = {1,1,0,1,0};
		teamThree2026.lastFive = rcb2026;
		teamThree2026.getTeamDetails();
		
		Team teamFour2026 = new Team();
		teamFour2026.teamName = "SRH";
		teamFour2026.numberOfMatchesPlayed = 5;
		teamFour2026.numberOfMatchesWon = 2;
		teamFour2026.numberOfMatchesLoss = 3;
		teamFour2026.nrr = 0.576;
		int srh[] = {0,1,0,0,1};
		teamFour2026.lastFive = srh;
		teamFour2026.getTeamDetails();
		
		Team teamFive2026 = new Team();
		teamFive2026.teamName = "DC";
		teamFive2026.numberOfMatchesPlayed = 4;
		teamFive2026.numberOfMatchesWon = 2;
		teamFive2026.numberOfMatchesLoss = 2;
		teamFive2026.nrr = 0.322;
		int dc[] = {1,1,0,0};
		teamFive2026.lastFive = dc;
		teamFive2026.getTeamDetails();
		
		Team teamSix2026 = new Team();
		teamSix2026.teamName = "KKR";
		teamSix2026.numberOfMatchesPlayed= 5;
		teamSix2026.numberOfMatchesWon = 4;
		teamSix2026.numberOfMatchesLoss = 1;
		teamSix2026.nrr =0.567;
		int kkr[] = {1,1,1,0,1};
		teamSix2026.lastFive = kkr;
		teamSix2026.getTeamDetails();
		
		Team teamSeven2026 = new Team();
		teamSeven2026.teamName = "GT";
		teamSeven2026.numberOfMatchesPlayed =4 ;
		teamSeven2026.numberOfMatchesWon = 2;
		teamSeven2026.numberOfMatchesLoss = 2;
		teamSeven2026.nrr = -0.427;
		int gt[] = {1,0,1,0};
		teamSeven2026.lastFive = gt;
		teamSeven2026.getTeamDetails();
		
		Team teamEight2026 = new Team();
		teamEight2026.teamName = "LSG";
		teamEight2026.numberOfMatchesPlayed =4 ;
		teamEight2026.numberOfMatchesWon = 2;
		teamEight2026.numberOfMatchesLoss = 2;
		teamEight2026.nrr = 0.947;
		int lsg[] = {1,0,1,0};
		teamEight2026.lastFive = lsg;
		teamEight2026.getTeamDetails();
		
		Team teamNine2026 = new Team();
		teamNine2026.teamName = "MI";
		teamNine2026.numberOfMatchesPlayed =5 ;
		teamNine2026.numberOfMatchesWon = 2;
		teamNine2026.numberOfMatchesLoss = 3;
		teamNine2026.nrr = 0.947;
		int mi[] = {1,0,1,0,0};
		teamNine2026.lastFive = mi;
		teamNine2026.getTeamDetails();
		
		Team teamTen2026 = new Team();
		teamTen2026.teamName = "CSK";
		teamTen2026.numberOfMatchesPlayed =5 ;
		teamTen2026.numberOfMatchesWon = 2;
		teamTen2026.numberOfMatchesLoss = 3;
		teamTen2026.nrr = 0.947;
		int csk[] = {1,0,1,1,0};
		teamTen2026.lastFive = csk;
		teamTen2026.getTeamDetails();
		
		
	}
}
