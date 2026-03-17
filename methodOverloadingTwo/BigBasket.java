class BigBasket
{
	static double price = 0.0;

	public static double search(String itemName)
	{
		if(itemName == "mobile")
		{
			price = 15000;
			return price;
		}
		else if(itemName == "laptop")
		{
			price = 55000;
			return price;
		}
		else if(itemName == "tablet")
		{
			price = 20000;
			return price;
		}
		else if(itemName == "smart watch")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "earphones")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "headphones")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "bluetooth speaker")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "television")
		{
			price = 40000;
			return price;
		}
		else if(itemName == "refrigerator")
		{
			price = 30000;
			return price;
		}
		else if(itemName == "washing machine")
		{
			price = 25000;
			return price;
		}
		else if(itemName == "air conditioner")
		{
			price = 35000;
			return price;
		}
		else if(itemName == "microwave")
		{
			price = 10000;
			return price;
		}
		else if(itemName == "induction stove")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "electric kettle")
		{
			price = 1200;
			return price;
		}
		else if(itemName == "mixer grinder")
		{
			price = 4000;
			return price;
		}
		else if(itemName == "juicer")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "water purifier")
		{
			price = 12000;
			return price;
		}
		else if(itemName == "geyser")
		{
			price = 8000;
			return price;
		}
		else if(itemName == "ceiling fan")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "table fan")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "air cooler")
		{
			price = 9000;
			return price;
		}
		else if(itemName == "iron box")
		{
			price = 1200;
			return price;
		}
		else if(itemName == "hair dryer")
		{
			price = 1800;
			return price;
		}
		else if(itemName == "trimmer")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "camera")
		{
			price = 45000;
			return price;
		}
		else if(itemName == "printer")
		{
			price = 7000;
			return price;
		}
		else if(itemName == "scanner")
		{
			price = 6000;
			return price;
		}
		else if(itemName == "router")
		{
			price = 2500;
			return price;
		}
		else if(itemName == "modem")
		{
			price = 2000;
			return price;
		}
		else if(itemName == "keyboard")
		{
			price = 800;
			return price;
		}
		else if(itemName == "mouse")
		{
			price = 600;
			return price;
		}
		else if(itemName == "monitor")
		{
			price = 12000;
			return price;
		}
		else if(itemName == "cpu")
		{
			price = 25000;
			return price;
		}
		else if(itemName == "ups")
		{
			price = 4000;
			return price;
		}
		else if(itemName == "power bank")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "charger")
		{
			price = 500;
			return price;
		}
		else if(itemName == "usb cable")
		{
			price = 300;
			return price;
		}
		else if(itemName == "hard disk")
		{
			price = 5000;
			return price;
		}
		else if(itemName == "pen drive")
		{
			price = 700;
			return price;
		}
		else if(itemName == "memory card")
		{
			price = 600;
			return price;
		}
		else if(itemName == "smart bulb")
		{
			price = 900;
			return price;
		}
		else if(itemName == "led bulb")
		{
			price = 200;
			return price;
		}
		else if(itemName == "tube light")
		{
			price = 300;
			return price;
		}
		else if(itemName == "extension board")
		{
			price = 400;
			return price;
		}
		else if(itemName == "inverter")
		{
			price = 15000;
			return price;
		}
		else if(itemName == "stabilizer")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "projector")
		{
			price = 20000;
			return price;
		}
		else if(itemName == "gaming console")
		{
			price = 45000;
			return price;
		}
		else if(itemName == "vr headset")
		{
			price = 25000;
			return price;
		}
		else if(itemName == "smart door lock")
		{
			price = 18000;
			return price;
		}
		else if(itemName == "cctv camera")
		{
			price = 3500;
			return price;
		}
		else if(itemName == "door bell")
		{
			price = 800;
			return price;
		}
		else if(itemName == "vacuum cleaner")
		{
			price = 7000;
			return price;
		}
		else if(itemName == "dishwasher")
		{
			price = 40000;
			return price;
		}
		else if(itemName == "electric scooter")
		{
			price = 80000;
			return price;
		}
		else if(itemName == "fitness band")
		{
			price = 3000;
			return price;
		}
		else if(itemName == "digital clock")
		{
			price = 1500;
			return price;
		}
		else if(itemName == "alarm clock")
		{
			price = 700;
			return price;
		}
		else if(itemName == "calculator")
		{
			price = 500;
			return price;
		}
		else
		{
			return 0.0;
		}
	}
	public static double search(String itemName, int quantity)
	{
		if(itemName == "mobile")
		{
			price = 15000 * quantity;
			return price;
		}
		else if(itemName == "laptop")
		{
			price = 55000 * quantity;
			return price;
		}
		else if(itemName == "tablet")
		{
			price = 20000 * quantity;
			return price;
		}
		else if(itemName == "smart watch")
		{
			price = 5000 * quantity;
			return price;
		}
		else if(itemName == "earphones")
		{
			price = 1500 * quantity;
			return price;
		}
		else if(itemName == "headphones")
		{
			price = 3000 * quantity;
			return price;
		}
		else if(itemName == "bluetooth speaker")
		{
			price = 2500 * quantity;
			return price;
		}
		else if(itemName == "television")
		{
			price = 40000 * quantity;
			return price;
		}
		else if(itemName == "refrigerator")
		{
			price = 30000 * quantity;
			return price;
		}
		else if(itemName == "washing machine")
		{
			price = 25000 * quantity;
			return price;
		}
		else if(itemName == "air conditioner")
		{
			price = 35000 * quantity;
			return price;
		}
		else if(itemName == "microwave")
		{
			price = 10000 * quantity;
			return price;
		}
		else if(itemName == "induction stove")
		{
			price = 3000 * quantity;
			return price;
		}
		else if(itemName == "electric kettle")
		{
			price = 1200 * quantity;
			return price;
		}
		else if(itemName == "mixer grinder")
		{
			price = 4000 * quantity;
			return price;
		}
		else if(itemName == "juicer")
		{
			price = 3500 * quantity;
			return price;
		}
		else if(itemName == "water purifier")
		{
			price = 12000 * quantity;
			return price;
		}
		else if(itemName == "geyser")
		{
			price = 8000 * quantity;
			return price;
		}
		else if(itemName == "ceiling fan")
		{
			price = 2000 * quantity;
			return price;
		}
		else if(itemName == "table fan")
		{
			price = 1500 * quantity;
			return price;
		}
		else if(itemName == "air cooler")
		{
			price = 9000 * quantity;
			return price;
		}
		else if(itemName == "iron box")
		{
			price = 1200 * quantity;
			return price;
		}
		else if(itemName == "hair dryer")
		{
			price = 1800 * quantity;
			return price;
		}
		else if(itemName == "trimmer")
		{
			price = 2000 * quantity;
			return price;
		}
		else if(itemName == "camera")
		{
			price = 45000 * quantity;
			return price;
		}
		else if(itemName == "printer")
		{
			price = 7000 * quantity;
			return price;
		}
		else if(itemName == "scanner")
		{
			price = 6000 * quantity;
			return price;
		}
		else if(itemName == "router")
		{
			price = 2500 * quantity;
			return price;
		}
		else if(itemName == "modem")
		{
			price = 2000 * quantity;
			return price;
		}
		else if(itemName == "keyboard")
		{
			price = 800 * quantity;
			return price;
		}
		else if(itemName == "mouse")
		{
			price = 600 * quantity;
			return price;
		}
		else if(itemName == "monitor")
		{
			price = 12000 * quantity;
			return price;
		}
		else if(itemName == "cpu")
		{
			price = 25000 * quantity;
			return price;
		}
		else if(itemName == "ups")
		{
			price = 4000 * quantity;
			return price;
		}
		else if(itemName == "power bank")
		{
			price = 1500 * quantity;
			return price;
		}
		else if(itemName == "charger")
		{
			price = 500 * quantity;
			return price;
		}
		else if(itemName == "usb cable")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "hard disk")
		{
			price = 5000 * quantity;
			return price;
		}
		else if(itemName == "pen drive")
		{
			price = 700 * quantity;
			return price;
		}
		else if(itemName == "memory card")
		{
			price = 600 * quantity;
			return price;
		}
		else if(itemName == "smart bulb")
		{
			price = 900 * quantity;
			return price;
		}
		else if(itemName == "led bulb")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "tube light")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "extension board")
		{
			price = 400 * quantity;
			return price;
		}
		else if(itemName == "inverter")
		{
			price = 15000 * quantity;
			return price;
		}
		else if(itemName == "stabilizer")
		{
			price = 3000 * quantity;
			return price;
		}
		else if(itemName == "projector")
		{
			price = 20000 * quantity;
			return price;
		}
		else if(itemName == "gaming console")
		{
			price = 45000 * quantity;
			return price;
		}
		else if(itemName == "vr headset")
		{
			price = 25000 * quantity;
			return price;
		}
		else if(itemName == "smart door lock")
		{
			price = 18000 * quantity;
			return price;
		}
		else if(itemName == "cctv camera")
		{
			price = 3500 * quantity;
			return price;
		}
		else if(itemName == "door bell")
		{
			price = 800 * quantity;
			return price;
		}
		else if(itemName == "vacuum cleaner")
		{
			price = 7000 * quantity;
			return price;
		}
		else if(itemName == "dishwasher")
		{
			price = 40000 * quantity;
			return price;
		}
		else if(itemName == "electric scooter")
		{
			price = 80000 * quantity;
			return price;
		}
		else if(itemName == "fitness band")
		{
			price = 3000 * quantity;
			return price;
		}
		else if(itemName == "digital clock")
		{
			price = 1500 * quantity;
			return price;
		}
		else if(itemName == "alarm clock")
		{
			price = 700 * quantity;
			return price;
		}
		else if(itemName == "calculator")
		{
			price = 500 * quantity;
			return price;
		}
		else
		{
			return 0.0;
		}
	}
}