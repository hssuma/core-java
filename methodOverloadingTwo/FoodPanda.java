class FoodPanda
{
	static double price = 0.0;

	public static double search(String itemName)
	{
		if(itemName == "burger")
		{
			price = 120;
			return price;
		}
		else if(itemName == "pizza")
		{
			price = 250;
			return price;
		}
		else if(itemName == "sandwich")
		{
			price = 90;
			return price;
		}
		else if(itemName == "french fries")
		{
			price = 80;
			return price;
		}
		else if(itemName == "pasta")
		{
			price = 150;
			return price;
		}
		else if(itemName == "noodles")
		{
			price = 140;
			return price;
		}
		else if(itemName == "fried rice")
		{
			price = 130;
			return price;
		}
		else if(itemName == "biryani")
		{
			price = 200;
			return price;
		}
		else if(itemName == "veg meals")
		{
			price = 180;
			return price;
		}
		else if(itemName == "paneer curry")
		{
			price = 160;
			return price;
		}
		else if(itemName == "chapati")
		{
			price = 40;
			return price;
		}
		else if(itemName == "naan")
		{
			price = 50;
			return price;
		}
		else if(itemName == "paratha")
		{
			price = 60;
			return price;
		}
		else if(itemName == "idli")
		{
			price = 40;
			return price;
		}
		else if(itemName == "dosa")
		{
			price = 70;
			return price;
		}
		else if(itemName == "masala dosa")
		{
			price = 90;
			return price;
		}
		else if(itemName == "vada")
		{
			price = 30;
			return price;
		}
		else if(itemName == "upma")
		{
			price = 50;
			return price;
		}
		else if(itemName == "pongal")
		{
			price = 60;
			return price;
		}
		else if(itemName == "poha")
		{
			price = 50;
			return price;
		}
		else if(itemName == "pav bhaji")
		{
			price = 100;
			return price;
		}
		else if(itemName == "samosa")
		{
			price = 25;
			return price;
		}
		else if(itemName == "kachori")
		{
			price = 30;
			return price;
		}
		else if(itemName == "chole bhature")
		{
			price = 120;
			return price;
		}
		else if(itemName == "rajma rice")
		{
			price = 130;
			return price;
		}
		else if(itemName == "dal rice")
		{
			price = 100;
			return price;
		}
		else if(itemName == "curd rice")
		{
			price = 90;
			return price;
		}
		else if(itemName == "lemon rice")
		{
			price = 80;
			return price;
		}
		else if(itemName == "tomato rice")
		{
			price = 85;
			return price;
		}
		else if(itemName == "veg pulao")
		{
			price = 110;
			return price;
		}
		else if(itemName == "momos")
		{
			price = 90;
			return price;
		}
		else if(itemName == "spring rolls")
		{
			price = 100;
			return price;
		}
		else if(itemName == "manchurian")
		{
			price = 120;
			return price;
		}
		else if(itemName == "chilli paneer")
		{
			price = 150;
			return price;
		}
		else if(itemName == "paneer tikka")
		{
			price = 180;
			return price;
		}
		else if(itemName == "veg cutlet")
		{
			price = 60;
			return price;
		}
		else if(itemName == "bread omelette")
		{
			price = 70;
			return price;
		}
		else if(itemName == "egg curry")
		{
			price = 140;
			return price;
		}
		else if(itemName == "chicken curry")
		{
			price = 220;
			return price;
		}
		else if(itemName == "fish fry")
		{
			price = 200;
			return price;
		}
		else if(itemName == "prawn curry")
		{
			price = 250;
			return price;
		}
		else if(itemName == "ice cream")
		{
			price = 60;
			return price;
		}
		else if(itemName == "chocolate cake")
		{
			price = 150;
			return price;
		}
		else if(itemName == "gulab jamun")
		{
			price = 80;
			return price;
		}
		else if(itemName == "rasgulla")
		{
			price = 80;
			return price;
		}
		else if(itemName == "jalebi")
		{
			price = 70;
			return price;
		}
		else if(itemName == "milkshake")
		{
			price = 120;
			return price;
		}
		else if(itemName == "cold coffee")
		{
			price = 110;
			return price;
		}
		else if(itemName == "tea")
		{
			price = 20;
			return price;
		}
		else if(itemName == "coffee")
		{
			price = 30;
			return price;
		}
		else if(itemName == "green tea")
		{
			price = 40;
			return price;
		}
		else if(itemName == "fruit juice")
		{
			price = 90;
			return price;
		}
		else if(itemName == "lassi")
		{
			price = 80;
			return price;
		}
		else if(itemName == "buttermilk")
		{
				price = 40;
				return price;
			}
		else if(itemName == "soft drink")
		{
				price = 50;
				return price;
			}
			else if(itemName == "mineral water")
			{
				price = 20;
				return price;
			}

			return price;
		}
	public static double search(String itemName, int quantity)
	{
		if(itemName == "burger")
		{
			price = 120 * quantity;
			return price;
		}
		else if(itemName == "pizza")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "sandwich")
		{
			price = 90 * quantity;
			return price;
		}
		else if(itemName == "french fries")
		{
			price = 80 * quantity;
			return price;
		}
		else if(itemName == "pasta")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "noodles")
		{
			price = 140 * quantity;
			return price;
		}
		else if(itemName == "fried rice")
		{
			price = 130 * quantity;
			return price;
		}
		else if(itemName == "biryani")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "veg meals")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "paneer curry")
		{
			price = 160 * quantity;
			return price;
		}
		else if(itemName == "chapati")
		{
			price = 40 * quantity;
			return price;
		}
		else if(itemName == "naan")
		{
			price = 50 * quantity;
			return price;
		}
		else if(itemName == "paratha")
		{
			price = 60 * quantity;
			return price;
		}
		else if(itemName == "idli")
		{
			price = 40 * quantity;
			return price;
		}
		else if(itemName == "dosa")
		{
			price = 70 * quantity;
			return price;
		}
		else if(itemName == "masala dosa")
		{
			price = 90 * quantity;
			return price;
		}
		else if(itemName == "vada")
		{
			price = 30 * quantity;
			return price;
		}
		else if(itemName == "upma")
		{
			price = 50 * quantity;
			return price;
		}
		else if(itemName == "pongal")
		{
			price = 60 * quantity;
			return price;
		}
		else if(itemName == "poha")
		{
			price = 50 * quantity;
			return price;
		}
		else if(itemName == "pav bhaji")
		{
			price = 100 * quantity;
			return price;
		}
		else if(itemName == "samosa")
		{
			price = 25 * quantity;
			return price;
		}
		else if(itemName == "kachori")
		{
			price = 30 * quantity;
			return price;
		}
		else if(itemName == "chole bhature")
		{
			price = 120 * quantity;
			return price;
		}
		else if(itemName == "rajma rice")
		{
			price = 130 * quantity;
			return price;
		}
		else if(itemName == "dal rice")
		{
			price = 100 * quantity;
			return price;
		}
		else if(itemName == "curd rice")
		{
			price = 90 * quantity;
			return price;
		}
		else if(itemName == "lemon rice")
		{
			price = 80 * quantity;
			return price;
		}
		else if(itemName == "tomato rice")
		{
			price = 85 * quantity;
			return price;
		}
		else if(itemName == "veg pulao")
		{
			price = 110 * quantity;
			return price;
		}
		else if(itemName == "momos")
		{
			price = 90 * quantity;
			return price;
		}
		else if(itemName == "spring rolls")
		{
			price = 100 * quantity;
			return price;
		}
		else if(itemName == "manchurian")
		{
			price = 120 * quantity;
			return price;
		}
		else if(itemName == "chilli paneer")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "paneer tikka")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "veg cutlet")
		{
			price = 60 * quantity;
			return price;
		}
		else if(itemName == "bread omelette")
		{
			price = 70 * quantity;
			return price;
		}
		else if(itemName == "egg curry")
		{
			price = 140 * quantity;
			return price;
		}
		else if(itemName == "chicken curry")
		{
			price = 220 * quantity;
			return price;
		}
		else if(itemName == "fish fry")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "prawn curry")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "ice cream")
		{
			price = 60 * quantity;
			return price;
		}
		else if(itemName == "chocolate cake")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "gulab jamun")
		{
			price = 80 * quantity;
			return price;
		}
		else if(itemName == "rasgulla")
		{
			price = 80 * quantity;
			return price;
		}
		else if(itemName == "jalebi")
		{
			price = 70 * quantity;
			return price;
		}
		else if(itemName == "milkshake")
		{
			price = 120 * quantity;
			return price;
		}
		else if(itemName == "cold coffee")
		{
			price = 110 * quantity;
			return price;
		}
		else if(itemName == "tea")
		{
			price = 20 * quantity;
			return price;
		}
		else if(itemName == "coffee")
		{
			price = 30 * quantity;
			return price;
		}
		else if(itemName == "green tea")
		{
			price = 40 * quantity;
			return price;
		}
		else if(itemName == "fruit juice")
		{
			price = 90 * quantity;
			return price;
		}
		else if(itemName == "lassi")
		{
			price = 80 * quantity;
			return price;
		}
		else if(itemName == "buttermilk")
		{
			price = 40 * quantity;
			return price;
		}
		else if(itemName == "soft drink")
		{
			price = 50 * quantity;
			return price;
		}
		else if(itemName == "mineral water")
		{
			price = 20 * quantity;
			return price;
		}

		return price;
	}
}