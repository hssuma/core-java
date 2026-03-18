class MagicPin
{
	static double price = 0.0;

	public static double search(String itemName)
	{
		if(itemName == "gold ring")
		{
			price = 15000;
			return price;
		}
		else if(itemName == "diamond ring")
		{
			price = 50000;
			return price;
		}
		else if(itemName == "silver ring")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "gold necklace")
		{
			price = 70000;
			return price;
		}
		else if(itemName == "diamond necklace")
		{
			price = 120000;
			return price;
		}
		else if(itemName == "silver necklace")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "gold chain")
		{
			price = 40000;
			return price;
		}
		else if(itemName == "silver chain")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "platinum chain")
		{
			price = 60000;
			return price;
		}
		else if(itemName == "gold earrings")
		{
			price = 20000;
			return price;
		}
		else if(itemName == "diamond earrings")
		{
			price = 45000;
			return price;
		}
		else if(itemName == "silver earrings")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "gold bracelet")
		{
			price = 25000;
			return price;
		}
		else if(itemName == "silver bracelet")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "platinum bracelet")
		{
			price = 55000;
			return price;
		}
		else if(itemName == "gold bangle")
		{
			price = 30000;
			return price;
		}
		else if(itemName == "silver bangle")
		{
			price = 4000;
			return price;
		}
		else if(itemName == "diamond bangle")
		{
			price = 80000;
			return price;
		}
		else if(itemName == "anklet")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "toe ring")
		{
			price = 500;
			return price;
		}
		else if(itemName == "nose ring")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "nose pin")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "maang tikka")
		{
			price = 7000;
			return price;
		}
		else if(itemName == "choker necklace")
		{
			price = 15000;
			return price;
		}
		else if(itemName == "pearl necklace")
		{
			price = 12000;
			return price;
		}
		else if(itemName == "pearl earrings")
		{
			price = 6000;
			return price;
		}
		else if(itemName == "pearl bracelet")
		{
			price = 8000;
			return price;
		}
		else if(itemName == "emerald ring")
		{
			price = 25000;
			return price;
		}
		else if(itemName == "ruby ring")
		{
			price = 30000;
			return price;
		}
		else if(itemName == "sapphire ring")
		{
			price = 28000;
			return price;
		}
		else if(itemName == "gold pendant")
		{
			price = 10000;
			return price;
		}
		else if(itemName == "diamond pendant")
		{
			price = 35000;
			return price;
		}
		else if(itemName == "silver pendant")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "locket")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "cufflinks")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "brooch")
		{
			price = 4000;
			return price;
		}
		else if(itemName == "hair pin jewelry")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "waist chain")
		{
			price = 12000;
			return price;
		}
		else if(itemName == "temple jewelry set")
		{
			price = 90000;
			return price;
		}
		else if(itemName == "bridal jewelry set")
		{
			price = 150000;
			return price;
		}
		else if(itemName == "antique necklace")
		{
			price = 60000;
			return price;
		}
		else if(itemName == "oxidized earrings")
		{
			price = 1200;
			return price;
		}
		else if(itemName == "oxidized necklace")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "oxidized ring")
		{
			price = 800;
			return price;
		}
		else if(itemName == "beaded necklace")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "beaded bracelet")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "stone earrings")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "stone necklace")
		{
			price = 7000;
			return price;
		}
		else if(itemName == "gold studs")
		{
			price = 10000;
			return price;
		}
		else if(itemName == "diamond studs")
		{
			price = 30000;
			return price;
		}
		else if(itemName == "silver studs")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "jhumka earrings")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "hoop earrings")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "drop earrings")
		{
			price = 4000;
			return price;
		}
		else if(itemName == "layered necklace")
		{
			price = 9000;
			return price;
		}
		else if(itemName == "charm bracelet")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "thread necklace")
		{
			price = 1200;
			return price;
		}
		else if(itemName == "custom name pendant")
		{
			price = 4500;
			return price;
		}

		return price;
	}
	public static double search(String itemName, int quantity)
{
	if(itemName == "gold ring")
	{
		price = 15000 * quantity;
		return price;
	}
	else if(itemName == "diamond ring")
	{
		price = 50000 * quantity;
		return price;
	}
	else if(itemName == "silver ring")
	{
		price = 2000 * quantity;
		return price;
	}
	else if(itemName == "gold necklace")
	{
		price = 70000 * quantity;
		return price;
	}
	else if(itemName == "diamond necklace")
	{
		price = 120000 * quantity;
		return price;
	}
	else if(itemName == "silver necklace")
	{
		price = 5000 * quantity;
		return price;
	}
	else if(itemName == "gold chain")
	{
		price = 40000 * quantity;
		return price;
	}
	else if(itemName == "silver chain")
	{
		price = 3000 * quantity;
		return price;
	}
	else if(itemName == "platinum chain")
	{
		price = 60000 * quantity;
		return price;
	}
	else if(itemName == "gold earrings")
	{
		price = 20000 * quantity;
		return price;
	}
	else if(itemName == "diamond earrings")
	{
		price = 45000 * quantity;
		return price;
	}
	else if(itemName == "silver earrings")
	{
		price = 2500 * quantity;
		return price;
	}
	else if(itemName == "gold bracelet")
	{
		price = 25000 * quantity;
		return price;
	}
	else if(itemName == "silver bracelet")
	{
		price = 3500 * quantity;
		return price;
	}
	else if(itemName == "platinum bracelet")
	{
		price = 55000 * quantity;
		return price;
	}
	else if(itemName == "gold bangle")
	{
		price = 30000 * quantity;
		return price;
	}
	else if(itemName == "silver bangle")
	{
		price = 4000 * quantity;
		return price;
	}
	else if(itemName == "diamond bangle")
	{
		price = 80000 * quantity;
		return price;
	}
	else if(itemName == "anklet")
	{
		price = 1500 * quantity;
		return price;
	}
	else if(itemName == "toe ring")
	{
		price = 500 * quantity;
		return price;
	}
	else if(itemName == "nose ring")
	{
		price = 2000 * quantity;
		return price;
	}
	else if(itemName == "nose pin")
	{
		price = 1500 * quantity;
		return price;
	}
	else if(itemName == "maang tikka")
	{
		price = 7000 * quantity;
		return price;
	}
	else if(itemName == "choker necklace")
	{
		price = 15000 * quantity;
		return price;
	}
	else if(itemName == "pearl necklace")
	{
		price = 12000 * quantity;
		return price;
	}
	else if(itemName == "pearl earrings")
	{
		price = 6000 * quantity;
		return price;
	}
	else if(itemName == "pearl bracelet")
	{
		price = 8000 * quantity;
		return price;
	}
	else if(itemName == "emerald ring")
	{
		price = 25000 * quantity;
		return price;
	}
	else if(itemName == "ruby ring")
	{
		price = 30000 * quantity;
		return price;
	}
	else if(itemName == "sapphire ring")
	{
		price = 28000 * quantity;
		return price;
	}
	else if(itemName == "gold pendant")
	{
		price = 10000 * quantity;
		return price;
	}
	else if(itemName == "diamond pendant")
	{
		price = 35000 * quantity;
		return price;
	}
	else if(itemName == "silver pendant")
	{
		price = 2000 * quantity;
		return price;
	}
	else if(itemName == "locket")
	{
		price = 3000 * quantity;
		return price;
	}
	else if(itemName == "cufflinks")
	{
		price = 5000 * quantity;
		return price;
	}
	else if(itemName == "brooch")
	{
		price = 4000 * quantity;
		return price;
	}
	else if(itemName == "hair pin jewelry")
	{
		price = 1500 * quantity;
		return price;
	}
	else if(itemName == "waist chain")
	{
		price = 12000 * quantity;
		return price;
	}
	else if(itemName == "temple jewelry set")
	{
		price = 90000 * quantity;
		return price;
	}
	else if(itemName == "bridal jewelry set")
	{
		price = 150000 * quantity;
		return price;
	}
	else if(itemName == "antique necklace")
	{
		price = 60000 * quantity;
		return price;
	}
	else if(itemName == "oxidized earrings")
	{
		price = 1200 * quantity;
		return price;
	}
	else if(itemName == "oxidized necklace")
	{
		price = 3000 * quantity;
		return price;
	}
	else if(itemName == "oxidized ring")
	{
		price = 800 * quantity;
		return price;
	}
	else if(itemName == "beaded necklace")
	{
		price = 2500 * quantity;
		return price;
	}
	else if(itemName == "beaded bracelet")
	{
		price = 1500 * quantity;
		return price;
	}
	else if(itemName == "stone earrings")
	{
		price = 3500 * quantity;
		return price;
	}
	else if(itemName == "stone necklace")
	{
		price = 7000 * quantity;
		return price;
	}
	else if(itemName == "gold studs")
	{
		price = 10000 * quantity;
		return price;
	}
	else if(itemName == "diamond studs")
	{
		price = 30000 * quantity;
		return price;
	}
	else if(itemName == "silver studs")
	{
		price = 2000 * quantity;
		return price;
	}
	else if(itemName == "jhumka earrings")
	{
		price = 5000 * quantity;
		return price;
	}
	else if(itemName == "hoop earrings")
	{
		price = 2500 * quantity;
		return price;
	}
	else if(itemName == "drop earrings")
	{
		price = 4000 * quantity;
		return price;
	}
	else if(itemName == "layered necklace")
	{
		price = 9000 * quantity;
		return price;
	}
	else if(itemName == "charm bracelet")
	{
		price = 3500 * quantity;
		return price;
	}
	else if(itemName == "thread necklace")
	{
		price = 1200 * quantity;
		return price;
	}
	else if(itemName == "custom name pendant")
	{
		price = 4500 * quantity;
		return price;
	}

	return price;
}
}