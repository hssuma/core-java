class CarromBoardExec
{
	public static void main(String ref[])
	{
		//className ref = new className();
		//className is a object refrence datatype
		CarromBoard board = new CarromBoard();
		
		//to acess
		//refName.variableName
		board.boardId = 231;
		System.out.println("the board id is "+board.boardId);
		board.brandName = "WRF";
		System.out.println("The board brand name is "+board.brandName);
		board.dimension = ;
		System.out.println("The board dimension is "+board.dimension);
		board.color = "brown ";
		System.oout.println("The board color is "+board.color);
		board.countryOfOrigin = "India";
		System.out.println("The board is made in "+board.countryOfOrigin);
		board.norOfCoins =17;
		System.out.println("The number of coins available are "+board.norOfCoins);
		board.norOfWhiteCoins = 8;
		System.out.println("The number of white coins are "+board.norOfWhiteCoins);
		board.norOfBlackCoins = 8;
		System.out.println("The number of black coins are "+board.norOfBlackCoins);
		board.ASIN = "AA12DN23";
		System.out.println("The board ASIN is "+board.ASIN);
		board.weight = 1200;
		System.out.println("the weight of the board is "+board.weight+" gm");
		board.theme = "Outdoor & indoor";
		System.out.println("The theme of the board is "+board.theme);
		board.cost = 2431;
		System.out.println("the cost of the board is "+board.cost);
		
		CarromBoard board2 = new CarromBoard();
		board2.boardId = 457;
		System.out.println("The board id is "+board2.boardId);
		board2.brandName = "AFH";
		System.out.println("The brand of a board is "+board2.brandName);
		board2.dimension = ;
		System.out.println("the dimension of the board is "+board2.dimension);
		board2.color = "beach";
		System.out.println("th color of the board is "+board2.color);
		board2.countryOfOrigin = "India";
		System.out.println("the board is manufactured in "+board2.countryOfOrigin);
		board2.norOfCoins = 19;
		System.out.println("the total number of coins are "+board2.norOfCoins);
		board2.norOfWhiteCoins = 9;
		System.out.println("The number of white coins are "+board2.norOfWhiteCoins);
		board2.norOfBlackCoins =9;
		System.out.println("The number of black coins are "+board2.norOfBlackCoins);
		board2.ASIN = "GH23KL";
		System.out.println("the ASIN is "+board2.ASIN);
		board2.weight = 1000;
		System.out.println("The weight of board is "+board2.weight);
		board2.theme = "Outdoor and Indoor";
		System.out.println("the theme of the game is "+board2.theme);
		board2.cost = 2679;
		System.out.println("The cost of the board is "+board2.cost);
	}
}