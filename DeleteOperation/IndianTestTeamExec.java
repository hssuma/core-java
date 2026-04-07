class IndianTestTeamExec
{
    public static void main(String[] args)
    {
        IndianTestTeam i = new IndianTestTeam();

        i.addPlayer("Rohit");
        i.addPlayer("Gill");
        i.addPlayer("Virat");
        i.addPlayer("Rahane");
        i.addPlayer("Pant");
        i.addPlayer("Jadeja");
        i.addPlayer("Ashwin");
        i.addPlayer("Bumrah");
        i.addPlayer("Shami");
        i.addPlayer("Siraj");
        i.addPlayer("Ishant");
        i.getPlayers();
		System.out.println("After updating player name");
		i.updatePlayer("Rohit", "Rohit Sharma");
		i.getPlayers();
		i.deletePlayer("Gill");
		i.getPlayers();
    }
}