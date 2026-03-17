class BlinkIt
{
	static double price = 0.0;

	public static double search(String vegName)
	{
		if(vegName == "rice")
		{
			price = 60;
			return price;
		}
		else if(vegName == "wheat flour")
		{
			price = 45;
			return price;
		}
		else if(vegName == "ragi flour")
		{
			price = 50;
			return price;
		}
		else if(vegName == "maida")
		{
			price = 40;
			return price;
		}
		else if(vegName == "toor dal")
		{
			price = 120;
			return price;
		}
		else if(vegName == "moong dal")
		{
			price = 110;
			return price;
		}
		else if(vegName == "urad dal")
		{
			price = 130;
			return price;
		}
		else if(vegName == "chana dal")
		{
			price = 90;
			return price;
		}
		else if(vegName == "rajma")
		{
			price = 140;
			return price;
		}
		else if(vegName == "chickpeas")
		{
			price = 100;
			return price;
		}
		else if(vegName == "green gram")
		{
			price = 95;
			return price;
		}
		else if(vegName == "black gram")
		{
			price = 105;
			return price;
		}
		else if(vegName == "sugar")
		{
			price = 45;
			return price;
		}
		else if(vegName == "salt")
		{
			price = 20;
			return price;
		}
		else if(vegName == "jaggery")
		{
			price = 55;
			return price;
		}
		else if(vegName == "turmeric powder")
		{
			price = 30;
			return price;
		}
		else if(vegName == "chili powder")
		{
			price = 35;
			return price;
		}
		else if(vegName == "garam masala")
		{
			price = 60;
			return price;
		}
		else if(vegName == "coriander powder")
		{
			price = 25;
			return price;
		}
		else if(vegName == "cumin seeds")
		{
			price = 50;
			return price;
		}
		else if(vegName == "mustard seeds")
		{
			price = 40;
			return price;
		}
		else if(vegName == "pepper")
		{
			price = 80;
			return price;
		}
		else if(vegName == "cardamom")
		{
			price = 120;
			return price;
		}
		else if(vegName == "cloves")
		{
			price = 90;
			return price;
		}
		else if(vegName == "cinnamon")
		{
			price = 70;
			return price;
		}
		else if(vegName == "cooking oil")
		{
			price = 150;
			return price;
		}
		else if(vegName == "ghee")
		{
			price = 500;
			return price;
		}
		else if(vegName == "butter")
		{
			price = 55;
			return price;
		}
		else if(vegName == "milk")
		{
			price = 30;
			return price;
		}
		else if(vegName == "curd")
		{
			price = 40;
			return price;
		}
		else if(vegName == "paneer")
		{
			price = 80;
			return price;
		}
		else if(vegName == "cheese")
		{
			price = 120;
			return price;
		}
		else if(vegName == "bread")
		{
			price = 35;
			return price;
		}
		else if(vegName == "brown bread")
		{
			price = 45;
			return price;
		}
		else if(vegName == "eggs")
		{
			price = 70;
			return price;
		}
		else if(vegName == "cornflakes")
		{
			price = 180;
			return price;
		}
		else if(vegName == "oats")
		{
			price = 160;
			return price;
		}
		else if(vegName == "honey")
		{
			price = 200;
			return price;
		}
		else if(vegName == "jam")
		{
			price = 90;
			return price;
		}
		else if(vegName == "ketchup")
		{
			price = 110;
			return price;
		}
		else if(vegName == "noodles")
		{
			price = 40;
			return price;
		}
		else if(vegName == "pasta")
		{
			price = 70;
			return price;
		}
		else if(vegName == "vermicelli")
		{
			price = 35;
			return price;
		}
		else if(vegName == "poha")
		{
			price = 50;
			return price;
		}
		else if(vegName == "rava")
		{
			price = 45;
			return price;
		}
		else if(vegName == "idli rice")
		{
			price = 55;
			return price;
		}
		else if(vegName == "basmati rice")
		{
			price = 120;
			return price;
		}
		else if(vegName == "dry fruits mix")
		{
			price = 300;
			return price;
		}
		else if(vegName == "almonds")
		{
			price = 250;
			return price;
		}
		else if(vegName == "cashews")
		{
			price = 280;
			return price;
		}
		else if(vegName == "raisins")
		{
			price = 150;
			return price;
		}
		else if(vegName == "dates")
		{
			price = 200;
			return price;
		}
		else if(vegName == "tea powder")
		{
			price = 180;
			return price;
		}
		else if(vegName == "coffee powder")
		{
			price = 220;
			return price;
		}
		else if(vegName == "biscuits")
		{
			price = 30;
			return price;
		}
		else if(vegName == "chips")
		{
			price = 20;
			return price;
		}
		else if(vegName == "soft drink")
		{
			price = 40;
			return price;
		}
		else if(vegName == "mineral water")
		{
			price = 20;
			return price;
		}
		
		else{
			System.out.println("grocery not found");
		}

		return price;
	}
	
	public static double search(String vegName , int quantity)
	{
	
		if(vegName == "rice")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "wheat flour")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "ragi flour")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "maida")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "toor dal")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "moong dal")
		{
			price = 110 * quantity;
			return price;
		}
		else if(vegName == "urad dal")
		{
			price = 130 * quantity;
			return price;
		}
		else if(vegName == "chana dal")
		{
			price = 90 * quantity;
			return price;
		}
		else if(vegName == "rajma")
		{
			price = 140 * quantity;
			return price;
		}
		else if(vegName == "chickpeas")
		{
			price = 100 * quantity;
			return price;
		}
		else if(vegName == "green gram")
		{
			price = 95 * quantity;
			return price;
		}
		else if(vegName == "black gram")
		{
			price = 105 * quantity;
			return price;
		}
		else if(vegName == "sugar")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "salt")
		{
			price = 20 * quantity;
			return price;
		}
		else if(vegName == "jaggery")
		{
			price = 55 * quantity;
			return price;
		}
		else if(vegName == "turmeric powder")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "chili powder")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "garam masala")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "coriander powder")
		{
			price = 25 * quantity;
			return price;
		}
		else if(vegName == "cumin seeds")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "mustard seeds")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "pepper")
		{
			price = 80 * quantity;
			return price;
		}
		else if(vegName == "cardamom")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "cloves")
		{
			price = 90 * quantity;
			return price;
		}
		else if(vegName == "cinnamon")
		{
			price = 70 * quantity;
			return price;
		}
		else if(vegName == "cooking oil")
		{
			price = 150 * quantity;
			return price;
		}
		else if(vegName == "ghee")
		{
			price = 500 * quantity;
			return price;
		}
		else if(vegName == "butter")
		{
			price = 55 * quantity;
			return price;
		}
		else if(vegName == "milk")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "curd")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "paneer")
		{
			price = 80 * quantity;
			return price;
		}
		else if(vegName == "cheese")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "bread")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "brown bread")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "eggs")
		{
			price = 70 * quantity;
			return price;
		}
		else if(vegName == "cornflakes")
		{
			price = 180 * quantity;
			return price;
		}
		else if(vegName == "oats")
		{
			price = 160 * quantity;
			return price;
		}
		else if(vegName == "honey")
		{
			price = 200 * quantity;
			return price;
		}
		else if(vegName == "jam")
		{
			price = 90 * quantity;
			return price;
		}
		else if(vegName == "ketchup")
		{
			price = 110 * quantity;
			return price;
		}
		else if(vegName == "noodles")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "pasta")
		{
			price = 70 * quantity;
			return price;
		}
		else if(vegName == "vermicelli")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "poha")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "rava")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "idli rice")
		{
			price = 55 * quantity;
			return price;
		}
		else if(vegName == "basmati rice")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "dry fruits mix")
		{
			price = 300 * quantity;
			return price;
		}
		else if(vegName == "almonds")
		{
			price = 250 * quantity;
			return price;
		}
		else if(vegName == "cashews")
		{
			price = 280 * quantity;
			return price;
		}
		else if(vegName == "raisins")
		{
			price = 150 * quantity;
			return price;
		}
		else if(vegName == "dates")
		{
			price = 200 * quantity;
			return price;
		}
		else if(vegName == "tea powder")
		{
			price = 180 * quantity;
			return price;
		}
		else if(vegName == "coffee powder")
		{
			price = 220 * quantity;
			return price;
		}
		else if(vegName == "biscuits")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "chips")
		{
			price = 20 * quantity;
			return price;
		}
		else if(vegName == "soft drink")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "mineral water")
		{
			price = 20 * quantity;
			return price;
		}
		else
		{
			System.out.println("grocery not found");
		}
		return price;
	
	}
}