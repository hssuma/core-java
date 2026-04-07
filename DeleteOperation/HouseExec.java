class HouseExec
{
    public static void main(String[] args)
    {
        House h = new House();

        h.addGame("Chess");
        h.addGame("Carrom");
        h.addGame("Ludo");
        h.addGame("Snake & Ladder");
        h.addGame("Cards");
        h.addGame("Puzzle");
		h.updateGame("Chess", "Classic Chess Game");
        h.getGames();
		h.deletegame("Carrom");
		h.getGames();
    }
}