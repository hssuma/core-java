class InstaMart
{
	static double price = 0.0;

	public static double search(String vegName)
	{
		if(vegName == "potato")
		{
			price = 20;
			return price;
		}
		else if(vegName == "tomato")
		{
			price = 30;
			return price;
		}
		else if(vegName == "onion")
		{
			price = 25;
			return price;
		}
		else if(vegName == "carrot")
		{
			price = 40;
			return price;
		}
		else if(vegName == "cabbage")
		{
			price = 35;
			return price;
		}
		else if(vegName == "cauliflower")
		{
			price = 50;
			return price;
		}
		else if(vegName == "brinjal")
		{
			price = 30;
			return price;
		}
		else if(vegName == "beans")
		{
			price = 60;
			return price;
		}
		else if(vegName == "capsicum")
		{
			price = 70;
			return price;
		}
		else if(vegName == "green chilli")
		{
			price = 20;
			return price;
		}
		else if(vegName == "cucumber")
		{
			price = 25;
			return price;
		}
		else if(vegName == "radish")
		{
			price = 30;
			return price;
		}
		else if(vegName == "beetroot")
		{
			price = 35;
			return price;
		}
		else if(vegName == "spinach")
		{
			price = 20;
			return price;
		}
		else if(vegName == "fenugreek")
		{
			price = 25;
			return price;
		}
		else if(vegName == "coriander")
		{
			price = 10;
			return price;
		}
		else if(vegName == "mint")
		{
			price = 10;
			return price;
		}
		else if(vegName == "drumstick")
		{
			price = 60;
			return price;
		}
		else if(vegName == "bottle gourd")
		{
			price = 30;
			return price;
		}
		else if(vegName == "ridge gourd")
		{
			price = 35;
			return price;
		}
		else if(vegName == "snake gourd")
		{
			price = 40;
			return price;
		}
		else if(vegName == "bitter gourd")
		{
			price = 45;
			return price;
		}
		else if(vegName == "pumpkin")
		{
			price = 30;
			return price;
		}
		else if(vegName == "sweet potato")
		{
			price = 50;
			return price;
		}
		else if(vegName == "raw banana")
		{
			price = 35;
			return price;
		}
		else if(vegName == "yam")
		{
			price = 60;
			return price;
		}
		else if(vegName == "tapioca")
		{
			price = 45;
			return price;
		}
		else if(vegName == "peas")
		{
			price = 80;
			return price;
		}
		else if(vegName == "corn")
		{
			price = 50;
			return price;
		}
		else if(vegName == "broccoli")
		{
			price = 120;
			return price;
		}
		else if(vegName == "lettuce")
		{
			price = 90;
			return price;
		}
		else if(vegName == "zucchini")
		{
			price = 100;
			return price;
		}
		else if(vegName == "mushroom")
		{
			price = 120;
			return price;
		}
		else if(vegName == "spring onion")
		{
			price = 40;
			return price;
		}
		else if(vegName == "leek")
		{
			price = 80;
			return price;
		}
		else if(vegName == "garlic")
		{
			price = 200;
			return price;
		}
		else if(vegName == "ginger")
		{
			price = 150;
			return price;
		}
		else if(vegName == "turmeric")
		{
			price = 100;
			return price;
		}
		else if(vegName == "ash gourd")
		{
			price = 35;
			return price;
		}
		else if(vegName == "cluster beans")
		{
			price = 60;
			return price;
		}
		else if(vegName == "ivy gourd")
		{
			price = 50;
			return price;
		}
		else if(vegName == "turnip")
		{
			price = 40;
			return price;
		}
		else if(vegName == "celery")
		{
			price = 90;
			return price;
		}
		else if(vegName == "parsley")
		{
			price = 100;
			return price;
		}
		else if(vegName == "kale")
		{
			price = 120;
			return price;
		}
		else if(vegName == "red cabbage")
		{
			price = 80;
			return price;
		}
		else if(vegName == "yellow capsicum")
		{
			price = 110;
			return price;
		}
		else if(vegName == "red capsicum")
		{
			price = 110;
			return price;
		}
		else if(vegName == "baby corn")
		{
			price = 60;
			return price;
		}
		else if(vegName == "lotus stem")
		{
			price = 70;
			return price;
		}
		else if(vegName == "raw mango")
		{
			price = 50;
			return price;
		}
		else if(vegName == "jackfruit raw")
		{
			price = 80;
			return price;
		}
		else if(vegName == "banana stem")
		{
			price = 40;
			return price;
		}
		else if(vegName == "banana flower")
		{
			price = 45;
			return price;
		}
		else if(vegName == "colocasia")
		{
			price = 60;
			return price;
		}
		else if(vegName == "green peas fresh")
		{
			price = 90;
			return price;
		}
		else if(vegName == "soya beans")
		{
			price = 70;
			return price;
		}
		else if(vegName == "chow chow")
		{
			price = 50;
			return price;
		}
		else if(vegName == "amaranth leaves")
		{
			price = 30;
			return price;
		}

		return price;
	}
	public static double search(String vegName , int quantity)
	{	
		if(vegName == "potato")
		{
			price = 20 * quantity;
			return price;
		}
		else if(vegName == "tomato")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "onion")
		{
			price = 25 * quantity;
			return price;
		}
		else if(vegName == "carrot")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "cabbage")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "cauliflower")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "brinjal")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "beans")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "capsicum")
		{
			price = 70 * quantity;
			return price;
		}
		else if(vegName == "green chilli")
		{
			price = 20 * quantity;
			return price;
		}
		else if(vegName == "cucumber")
		{
			price = 25 * quantity;
			return price;
		}
		else if(vegName == "radish")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "beetroot")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "spinach")
		{
			price = 20 * quantity;
			return price;
		}
		else if(vegName == "fenugreek")
		{
			price = 25 * quantity;
			return price;
		}
		else if(vegName == "coriander")
		{
			price = 10 * quantity;
			return price;
		}
		else if(vegName == "mint")
		{
			price = 10 * quantity;
			return price;
		}
		else if(vegName == "drumstick")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "bottle gourd")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "ridge gourd")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "snake gourd")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "bitter gourd")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "pumpkin")
		{
			price = 30 * quantity;
			return price;
		}
		else if(vegName == "sweet potato")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "raw banana")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "yam")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "tapioca")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "peas")
		{
			price = 80 * quantity;
			return price;
		}
		else if(vegName == "corn")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "broccoli")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "lettuce")
		{
			price = 90 * quantity;
			return price;
		}
		else if(vegName == "zucchini")
		{
			price = 100 * quantity;
			return price;
		}
		else if(vegName == "mushroom")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "spring onion")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "leek")
		{
			price = 80 * quantity;
			return price;
		}
		else if(vegName == "garlic")
		{
			price = 200 * quantity;
			return price;
		}
		else if(vegName == "ginger")
		{
			price = 150 * quantity;
			return price;
		}
		else if(vegName == "turmeric")
		{
			price = 100 * quantity;
			return price;
		}
		else if(vegName == "ash gourd")
		{
			price = 35 * quantity;
			return price;
		}
		else if(vegName == "cluster beans")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "ivy gourd")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "turnip")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "celery")
		{
			price = 90 * quantity;
			return price;
		}
		else if(vegName == "parsley")
		{
			price = 100 * quantity;
			return price;
		}
		else if(vegName == "kale")
		{
			price = 120 * quantity;
			return price;
		}
		else if(vegName == "red cabbage")
		{
			price = 80 * quantity;
			return price;
		}
		else if(vegName == "yellow capsicum")
		{
			price = 110 * quantity;
			return price;
		}
		else if(vegName == "red capsicum")
		{
			price = 110 * quantity;
			return price;
		}
		else if(vegName == "baby corn")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "lotus stem")
		{
			price = 70 * quantity;
			return price;
		}
		else if(vegName == "raw mango")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "jackfruit raw")
		{
			price = 80 * quantity;
			return price;
		}
		else if(vegName == "banana stem")
		{
			price = 40 * quantity;
			return price;
		}
		else if(vegName == "banana flower")
		{
			price = 45 * quantity;
			return price;
		}
		else if(vegName == "colocasia")
		{
			price = 60 * quantity;
			return price;
		}
		else if(vegName == "green peas fresh")
		{
			price = 90 * quantity;
			return price;
		}
		else if(vegName == "soya beans")
		{
			price = 70 * quantity;
			return price;
		}
		else if(vegName == "chow chow")
		{
			price = 50 * quantity;
			return price;
		}
		else if(vegName == "amaranth leaves")
		{
			price = 30 * quantity;
			return price;
		}
		else
		{
			System.out.println("vegetable not found");
		}
		
		return price;
		
	}
		
	
}