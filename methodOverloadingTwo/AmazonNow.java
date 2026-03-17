class AmazonNow
{
	static double price = 0.0;

	public static double search(String itemName)
	{
		if(itemName == "watering can")
		{
			price = 300;
			return price;
		}
		else if(itemName == "garden hose")
		{
			price = 800;
			return price;
		}
		else if(itemName == "sprinkler")
		{
			price = 600;
			return price;
		}
		else if(itemName == "hand trowel")
		{
			price = 250;
			return price;
		}
		else if(itemName == "garden fork")
		{
			price = 400;
			return price;
		}
		else if(itemName == "pruning shears")
		{
			price = 700;
			return price;
		}
		else if(itemName == "spade")
		{
			price = 900;
			return price;
		}
		else if(itemName == "rake")
		{
			price = 500;
			return price;
		}
		else if(itemName == "wheelbarrow")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "garden gloves")
		{
			price = 200;
			return price;
		}
		else if(itemName == "plant pots")
		{
			price = 150;
			return price;
		}
		else if(itemName == "seed tray")
		{
			price = 120;
			return price;
		}
		else if(itemName == "soil mix")
		{
			price = 250;
			return price;
		}
		else if(itemName == "compost")
		{
			price = 300;
			return price;
		}
		else if(itemName == "fertilizer")
		{
			price = 350;
			return price;
		}
		else if(itemName == "manure")
		{
			price = 200;
			return price;
		}
		else if(itemName == "garden shovel")
		{
			price = 700;
			return price;
		}
		else if(itemName == "watering nozzle")
		{
			price = 180;
			return price;
		}
		else if(itemName == "drip irrigation kit")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "garden scissors")
		{
			price = 350;
			return price;
		}
		else if(itemName == "hedge trimmer")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "lawn mower")
		{
			price = 8000;
			return price;
		}
		else if(itemName == "grass cutter")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "plant seeds")
		{
			price = 100;
			return price;
		}
		else if(itemName == "flower seeds")
		{
			price = 120;
			return price;
		}
		else if(itemName == "vegetable seeds")
		{
			price = 130;
			return price;
		}
		else if(itemName == "herb seeds")
		{
			price = 140;
			return price;
		}
		else if(itemName == "plant stand")
		{
			price = 900;
			return price;
		}
		else if(itemName == "hanging pots")
		{
			price = 200;
			return price;
		}
		else if(itemName == "garden net")
		{
			price = 300;
			return price;
		}
		else if(itemName == "shade net")
		{
			price = 400;
			return price;
		}
		else if(itemName == "plant labels")
		{
			price = 100;
			return price;
		}
		else if(itemName == "garden twine")
		{
			price = 80;
			return price;
		}
		else if(itemName == "bamboo sticks")
		{
			price = 150;
			return price;
		}
		else if(itemName == "plant ties")
		{
			price = 90;
			return price;
		}
		else if(itemName == "weed remover")
		{
			price = 350;
			return price;
		}
		else if(itemName == "garden hoe")
		{
			price = 500;
			return price;
		}
		else if(itemName == "watering timer")
		{
			price = 1200;
			return price;
		}
		else if(itemName == "garden sprayer")
		{
			price = 600;
			return price;
		}
		else if(itemName == "plant mister")
		{
			price = 250;
			return price;
		}
		else if(itemName == "leaf blower")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "garden cart")
		{
			price = 4000;
			return price;
		}
		else if(itemName == "soil tester")
		{
			price = 700;
			return price;
		}
		else if(itemName == "ph meter")
		{
			price = 800;
			return price;
		}
		else if(itemName == "garden knife")
		{
			price = 300;
			return price;
		}
		else if(itemName == "plant cover")
		{
			price = 250;
			return price;
		}
		else if(itemName == "mulch")
		{
			price = 200;
			return price;
		}
		else if(itemName == "garden bench")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "outdoor lights")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "solar lights")
		{
			price = 1800;
			return price;
		}
		else if(itemName == "watering pump")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "garden fence")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "plant rack")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "seed storage box")
		{
			price = 400;
			return price;
		}
		else if(itemName == "garden tool kit")
		{
			price = 1200;
			return price;
		}
		else if(itemName == "watering spikes")
		{
			price = 300;
			return price;
		}
		else if(itemName == "compost bin")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "garden apron")
		{
			price = 350;
			return price;
		}
		else if(itemName == "plant food")
		{
			price = 280;
			return price;
		}
		else
		{
			return 0.0;
		}
	}
	public static double search(String itemName, int quantity)
{
	if(itemName == "watering can")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "garden hose")
	{
		price = 800 * quantity;
		return price;
	}
	else if(itemName == "sprinkler")
	{
		price = 600 * quantity;
		return price;
	}
	else if(itemName == "hand trowel")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "garden fork")
	{
		price = 400 * quantity;
		return price;
	}
	else if(itemName == "pruning shears")
	{
		price = 700 * quantity;
		return price;
	}
	else if(itemName == "spade")
	{
		price = 900 * quantity;
		return price;
	}
	else if(itemName == "rake")
	{
		price = 500 * quantity;
		return price;
	}
	else if(itemName == "wheelbarrow")
	{
		price = 3500 * quantity;
		return price;
	}
	else if(itemName == "garden gloves")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "plant pots")
	{
		price = 150 * quantity;
		return price;
	}
	else if(itemName == "seed tray")
	{
		price = 120 * quantity;
		return price;
	}
	else if(itemName == "soil mix")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "compost")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "fertilizer")
	{
		price = 350 * quantity;
		return price;
	}
	else if(itemName == "manure")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "garden shovel")
	{
		price = 700 * quantity;
		return price;
	}
	else if(itemName == "watering nozzle")
	{
		price = 180 * quantity;
		return price;
	}
	else if(itemName == "drip irrigation kit")
	{
		price = 1500 * quantity;
		return price;
	}
	else if(itemName == "garden scissors")
	{
		price = 350 * quantity;
		return price;
	}
	else if(itemName == "hedge trimmer")
	{
		price = 2500 * quantity;
		return price;
	}
	else if(itemName == "lawn mower")
	{
		price = 8000 * quantity;
		return price;
	}
	else if(itemName == "grass cutter")
	{
		price = 3000 * quantity;
		return price;
	}
	else if(itemName == "plant seeds")
	{
		price = 100 * quantity;
		return price;
	}
	else if(itemName == "flower seeds")
	{
		price = 120 * quantity;
		return price;
	}
	else if(itemName == "vegetable seeds")
	{
		price = 130 * quantity;
		return price;
	}
	else if(itemName == "herb seeds")
	{
		price = 140 * quantity;
		return price;
	}
	else if(itemName == "plant stand")
	{
		price = 900 * quantity;
		return price;
	}
	else if(itemName == "hanging pots")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "garden net")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "shade net")
	{
		price = 400 * quantity;
		return price;
	}
	else if(itemName == "plant labels")
	{
		price = 100 * quantity;
		return price;
	}
	else if(itemName == "garden twine")
	{
		price = 80 * quantity;
		return price;
	}
	else if(itemName == "bamboo sticks")
	{
		price = 150 * quantity;
		return price;
	}
	else if(itemName == "plant ties")
	{
		price = 90 * quantity;
		return price;
	}
	else if(itemName == "weed remover")
	{
		price = 350 * quantity;
		return price;
	}
	else if(itemName == "garden hoe")
	{
		price = 500 * quantity;
		return price;
	}
	else if(itemName == "watering timer")
	{
		price = 1200 * quantity;
		return price;
	}
	else if(itemName == "garden sprayer")
	{
		price = 600 * quantity;
		return price;
	}
	else if(itemName == "plant mister")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "leaf blower")
	{
		price = 3500 * quantity;
		return price;
	}
	else if(itemName == "garden cart")
	{
		price = 4000 * quantity;
		return price;
	}
	else if(itemName == "soil tester")
	{
		price = 700 * quantity;
		return price;
	}
	else if(itemName == "ph meter")
	{
		price = 800 * quantity;
		return price;
	}
	else if(itemName == "garden knife")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "plant cover")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "mulch")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "garden bench")
	{
		price = 5000 * quantity;
		return price;
	}
	else if(itemName == "outdoor lights")
	{
		price = 1500 * quantity;
		return price;
	}
	else if(itemName == "solar lights")
	{
		price = 1800 * quantity;
		return price;
	}
	else if(itemName == "watering pump")
	{
		price = 2500 * quantity;
		return price;
	}
	else if(itemName == "garden fence")
	{
		price = 3000 * quantity;
		return price;
	}
	else if(itemName == "plant rack")
	{
		price = 2000 * quantity;
		return price;
	}
	else if(itemName == "seed storage box")
	{
		price = 400 * quantity;
		return price;
	}
	else if(itemName == "garden tool kit")
	{
		price = 1200 * quantity;
		return price;
	}
	else if(itemName == "watering spikes")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "compost bin")
	{
		price = 2500 * quantity;
		return price;
	}
	else if(itemName == "garden apron")
	{
		price = 350 * quantity;
		return price;
	}
	else if(itemName == "plant food")
	{
		price = 280 * quantity;
		return price;
	}
	else
	{
		return 0.0;
	}
}
	
}