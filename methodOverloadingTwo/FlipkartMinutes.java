class FlipkartMinutes
{
	static double price = 0.0;

	public static double search(String itemName)
	{
		if(itemName == "floor cleaner")
		{
			price = 120;
			return price;
		}
		else if(itemName == "toilet cleaner")
		{
			price = 150;
			return price;
		}
		else if(itemName == "dishwash liquid")
		{
			price = 110;
			return price;
		}
		else if(itemName == "dishwash bar")
		{
			price = 40;
			return price;
		}
		else if(itemName == "glass cleaner")
		{
			price = 130;
			return price;
		}
		else if(itemName == "surface cleaner")
		{
			price = 140;
			return price;
		}
		else if(itemName == "laundry detergent")
		{
			price = 220;
			return price;
		}
		else if(itemName == "washing powder")
		{
			price = 200;
			return price;
		}
		else if(itemName == "fabric conditioner")
		{
			price = 180;
			return price;
		}
		else if(itemName == "bleach")
		{
			price = 90;
			return price;
		}
		else if(itemName == "phenyl")
		{
			price = 100;
			return price;
		}
		else if(itemName == "hand wash")
		{
			price = 70;
			return price;
		}
		else if(itemName == "sanitizer")
		{
			price = 80;
			return price;
		}
		else if(itemName == "disinfectant spray")
		{
			price = 160;
			return price;
		}
		else if(itemName == "room freshener")
		{
			price = 190;
			return price;
		}
		else if(itemName == "mop")
		{
			price = 350;
			return price;
		}
		else if(itemName == "bucket")
		{
			price = 250;
			return price;
		}
		else if(itemName == "scrub pad")
		{
			price = 30;
			return price;
		}
		else if(itemName == "steel scrubber")
		{
			price = 35;
			return price;
		}
		else if(itemName == "cleaning brush")
		{
			price = 60;
			return price;
		}
		else if(itemName == "toilet brush")
		{
			price = 90;
			return price;
		}
		else if(itemName == "dustpan")
		{
			price = 120;
			return price;
		}
		else if(itemName == "broom")
		{
			price = 150;
			return price;
		}
		else if(itemName == "vacuum cleaner")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "microfiber cloth")
		{
			price = 100;
			return price;
		}
		else if(itemName == "paper towels")
		{
			price = 90;
			return price;
		}
		else if(itemName == "tissue roll")
		{
			price = 60;
			return price;
		}
		else if(itemName == "garbage bags")
		{
			price = 120;
			return price;
		}
		else if(itemName == "liquid soap")
		{
			price = 110;
			return price;
		}
		else if(itemName == "floor scrubber")
		{
			price = 400;
			return price;
		}
		else if(itemName == "carpet cleaner")
		{
			price = 250;
			return price;
		}
		else if(itemName == "tile cleaner")
		{
			price = 180;
			return price;
		}
		else if(itemName == "kitchen cleaner")
		{
			price = 160;
			return price;
		}
		else if(itemName == "drain cleaner")
		{
			price = 200;
			return price;
		}
		else if(itemName == "air freshener")
		{
			price = 170;
			return price;
		}
		else if(itemName == "sponge")
		{
			price = 25;
			return price;
		}
		else if(itemName == "lint roller")
		{
			price = 140;
			return price;
		}
		else if(itemName == "window wiper")
		{
			price = 180;
			return price;
		}
		else if(itemName == "dust cloth")
		{
			price = 70;
			return price;
		}
		else if(itemName == "cleaning gloves")
		{
			price = 90;
			return price;
		}
		else if(itemName == "floor wipes")
		{
			price = 130;
			return price;
		}
		else if(itemName == "disinfectant wipes")
		{
			price = 150;
			return price;
		}
		else if(itemName == "stain remover")
		{
			price = 200;
			return price;
		}
		else if(itemName == "oven cleaner")
		{
			price = 220;
			return price;
		}
		else if(itemName == "bathroom cleaner")
		{
			price = 180;
			return price;
		}
		else if(itemName == "soap dispenser")
		{
			price = 250;
			return price;
		}
		else if(itemName == "trash bin")
		{
			price = 500;
			return price;
		}
		else if(itemName == "toilet paper holder")
		{
			price = 300;
			return price;
		}
		else if(itemName == "floor squeegee")
		{
			price = 200;
			return price;
		}
		else if(itemName == "cleaning caddy")
		{
			price = 350;
			return price;
		}
		else if(itemName == "detergent pods")
		{
			price = 400;
			return price;
		}
		else if(itemName == "dish drying rack")
		{
			price = 600;
			return price;
		}
		else if(itemName == "sink cleaner")
		{
			price = 150;
			return price;
		}
		else if(itemName == "grill cleaner")
		{
			price = 220;
			return price;
		}
		else if(itemName == "shoe cleaner")
		{
			price = 180;
			return price;
		}
		else if(itemName == "floor polish")
		{
			price = 300;
			return price;
		}
		else if(itemName == "wood cleaner")
		{
			price = 280;
			return price;
		}
		else if(itemName == "metal polish")
		{
			price = 260;
			return price;
		}
		else if(itemName == "glass wipes")
		{
			price = 140;
			return price;
		}
		else
		{
			return 0.0;
		}
	}
	public static double search(String itemName, int quantity)
{
	if(itemName == "floor cleaner")
	{
		price = 120 * quantity;
		return price;
	}
	else if(itemName == "toilet cleaner")
	{
		price = 150 * quantity;
		return price;
	}
	else if(itemName == "dishwash liquid")
	{
		price = 110 * quantity;
		return price;
	}
	else if(itemName == "dishwash bar")
	{
		price = 40 * quantity;
		return price;
	}
	else if(itemName == "glass cleaner")
	{
		price = 130 * quantity;
		return price;
	}
	else if(itemName == "surface cleaner")
	{
		price = 140 * quantity;
		return price;
	}
	else if(itemName == "laundry detergent")
	{
		price = 220 * quantity;
		return price;
	}
	else if(itemName == "washing powder")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "fabric conditioner")
	{
		price = 180 * quantity;
		return price;
	}
	else if(itemName == "bleach")
	{
		price = 90 * quantity;
		return price;
	}
	else if(itemName == "phenyl")
	{
		price = 100 * quantity;
		return price;
	}
	else if(itemName == "hand wash")
	{
		price = 70 * quantity;
		return price;
	}
	else if(itemName == "sanitizer")
	{
		price = 80 * quantity;
		return price;
	}
	else if(itemName == "disinfectant spray")
	{
		price = 160 * quantity;
		return price;
	}
	else if(itemName == "room freshener")
	{
		price = 190 * quantity;
		return price;
	}
	else if(itemName == "mop")
	{
		price = 350 * quantity;
		return price;
	}
	else if(itemName == "bucket")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "scrub pad")
	{
		price = 30 * quantity;
		return price;
	}
	else if(itemName == "steel scrubber")
	{
		price = 35 * quantity;
		return price;
	}
	else if(itemName == "cleaning brush")
	{
		price = 60 * quantity;
		return price;
	}
	else if(itemName == "toilet brush")
	{
		price = 90 * quantity;
		return price;
	}
	else if(itemName == "dustpan")
	{
		price = 120 * quantity;
		return price;
	}
	else if(itemName == "broom")
	{
		price = 150 * quantity;
		return price;
	}
	else if(itemName == "vacuum cleaner")
	{
		price = 5000 * quantity;
		return price;
	}
	else if(itemName == "microfiber cloth")
	{
		price = 100 * quantity;
		return price;
	}
	else if(itemName == "paper towels")
	{
		price = 90 * quantity;
		return price;
	}
	else if(itemName == "tissue roll")
	{
		price = 60 * quantity;
		return price;
	}
	else if(itemName == "garbage bags")
	{
		price = 120 * quantity;
		return price;
	}
	else if(itemName == "liquid soap")
	{
		price = 110 * quantity;
		return price;
	}
	else if(itemName == "floor scrubber")
	{
		price = 400 * quantity;
		return price;
	}
	else if(itemName == "carpet cleaner")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "tile cleaner")
	{
		price = 180 * quantity;
		return price;
	}
	else if(itemName == "kitchen cleaner")
	{
		price = 160 * quantity;
		return price;
	}
	else if(itemName == "drain cleaner")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "air freshener")
	{
		price = 170 * quantity;
		return price;
	}
	else if(itemName == "sponge")
	{
		price = 25 * quantity;
		return price;
	}
	else if(itemName == "lint roller")
	{
		price = 140 * quantity;
		return price;
	}
	else if(itemName == "window wiper")
	{
		price = 180 * quantity;
		return price;
	}
	else if(itemName == "dust cloth")
	{
		price = 70 * quantity;
		return price;
	}
	else if(itemName == "cleaning gloves")
	{
		price = 90 * quantity;
		return price;
	}
	else if(itemName == "floor wipes")
	{
		price = 130 * quantity;
		return price;
	}
	else if(itemName == "disinfectant wipes")
	{
		price = 150 * quantity;
		return price;
	}
	else if(itemName == "stain remover")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "oven cleaner")
	{
		price = 220 * quantity;
		return price;
	}
	else if(itemName == "bathroom cleaner")
	{
		price = 180 * quantity;
		return price;
	}
	else if(itemName == "soap dispenser")
	{
		price = 250 * quantity;
		return price;
	}
	else if(itemName == "trash bin")
	{
		price = 500 * quantity;
		return price;
	}
	else if(itemName == "toilet paper holder")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "floor squeegee")
	{
		price = 200 * quantity;
		return price;
	}
	else if(itemName == "cleaning caddy")
	{
		price = 350 * quantity;
		return price;
	}
	else if(itemName == "detergent pods")
	{
		price = 400 * quantity;
		return price;
	}
	else if(itemName == "dish drying rack")
	{
		price = 600 * quantity;
		return price;
	}
	else if(itemName == "sink cleaner")
	{
		price = 150 * quantity;
		return price;
	}
	else if(itemName == "grill cleaner")
	{
		price = 220 * quantity;
		return price;
	}
	else if(itemName == "shoe cleaner")
	{
		price = 180 * quantity;
		return price;
	}
	else if(itemName == "floor polish")
	{
		price = 300 * quantity;
		return price;
	}
	else if(itemName == "wood cleaner")
	{
		price = 280 * quantity;
		return price;
	}
	else if(itemName == "metal polish")
	{
		price = 260 * quantity;
		return price;
	}
	else if(itemName == "glass wipes")
	{
		price = 140 * quantity;
		return price;
	}
	else
	{
		return 0.0;
	}
}
}