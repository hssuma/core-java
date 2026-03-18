class DoorDash
{
	static double price = 0.0;

	public static double search(String itemName)
	{
		if(itemName == "face wash")
		{
			price = 150;
			return price;
		}
		else if(itemName == "face cleanser")
		{
			price = 180;
			return price;
		}
		else if(itemName == "face scrub")
		{
			price = 200;
			return price;
		}
		else if(itemName == "face toner")
		{
			price = 220;
			return price;
		}
		else if(itemName == "face serum")
		{
			price = 350;
			return price;
		}
		else if(itemName == "moisturizer")
		{
			price = 250;
			return price;
		}
		else if(itemName == "sunscreen")
		{
			price = 300;
			return price;
		}
		else if(itemName == "night cream")
		{
			price = 280;
			return price;
		}
		else if(itemName == "day cream")
		{
			price = 260;
			return price;
		}
		else if(itemName == "under eye cream")
		{
			price = 320;
			return price;
		}
		else if(itemName == "face mask")
		{
			price = 150;
			return price;
		}
		else if(itemName == "sheet mask")
		{
			price = 120;
			return price;
		}
		else if(itemName == "clay mask")
		{
			price = 180;
			return price;
		}
		else if(itemName == "peel off mask")
		{
			price = 170;
			return price;
		}
		else if(itemName == "lip balm")
		{
			price = 90;
			return price;
		}
		else if(itemName == "lip scrub")
		{
			price = 110;
			return price;
		}
		else if(itemName == "body lotion")
		{
			price = 200;
			return price;
		}
		else if(itemName == "body butter")
		{
			price = 350;
			return price;
		}
		else if(itemName == "body scrub")
		{
			price = 250;
			return price;
		}
		else if(itemName == "body oil")
		{
			price = 300;
			return price;
		}
		else if(itemName == "hand cream")
		{
			price = 150;
			return price;
		}
		else if(itemName == "foot cream")
		{
			price = 180;
			return price;
		}
		else if(itemName == "foot scrub")
		{
			price = 160;
			return price;
		}
		else if(itemName == "face mist")
		{
			price = 220;
			return price;
		}
		else if(itemName == "makeup remover")
		{
			price = 200;
			return price;
		}
		else if(itemName == "micellar water")
		{
			price = 250;
			return price;
		}
		else if(itemName == "cleansing oil")
		{
			price = 300;
			return price;
		}
		else if(itemName == "cleansing balm")
		{
			price = 320;
			return price;
		}
		else if(itemName == "face oil")
		{
			price = 280;
			return price;
		}
		else if(itemName == "eye gel")
		{
			price = 260;
			return price;
		}
		else if(itemName == "pimple cream")
		{
			price = 150;
			return price;
		}
		else if(itemName == "acne gel")
		{
			price = 170;
			return price;
		}
		else if(itemName == "dark spot corrector")
		{
			price = 350;
			return price;
		}
		else if(itemName == "skin brightening cream")
		{
			price = 300;
			return price;
		}
		else if(itemName == "anti aging cream")
		{
			price = 400;
			return price;
		}
		else if(itemName == "retinol cream")
		{
			price = 450;
			return price;
		}
		else if(itemName == "vitamin c serum")
		{
			price = 500;
			return price;
		}
		else if(itemName == "hyaluronic acid serum")
		{
			price = 480;
			return price;
		}
		else if(itemName == "niacinamide serum")
		{
			price = 420;
			return price;
		}
		else if(itemName == "face gel")
		{
			price = 220;
			return price;
		}
		else if(itemName == "aloe vera gel")
		{
			price = 180;
			return price;
		}
		else if(itemName == "rose water")
		{
			price = 140;
			return price;
		}
		else if(itemName == "facial kit")
		{
			price = 600;
			return price;
		}
		else if(itemName == "face pack")
		{
			price = 200;
			return price;
		}
		else if(itemName == "tan removal cream")
		{
			price = 250;
			return price;
		}
		else if(itemName == "skin polish")
		{
			price = 300;
			return price;
		}
		else if(itemName == "after shave lotion")
		{
			price = 180;
			return price;
		}
		else if(itemName == "beard oil")
		{
			price = 250;
			return price;
		}
		else if(itemName == "beard balm")
		{
			price = 270;
			return price;
		}
		else if(itemName == "face sunscreen gel")
		{
			price = 320;
			return price;
		}
		else if(itemName == "spf moisturizer")
		{
			price = 300;
			return price;
		}
		else if(itemName == "body sunscreen")
		{
			price = 350;
			return price;
		}
		else if(itemName == "cooling gel")
		{
			price = 200;
			return price;
		}
		else if(itemName == "skin repair cream")
		{
			price = 380;
			return price;
		}
		else if(itemName == "face essence")
		{
			price = 420;
			return price;
		}
		else if(itemName == "skin booster")
		{
			price = 500;
			return price;
		}
		else if(itemName == "hydrating mist")
		{
			price = 260;
			return price;
		}
		else if(itemName == "face peeling solution")
		{
			price = 450;
			return price;
		}
		else
		{
			return 0.0;
		}
	}
		public static double search(String itemName, int quantity)
	{
		if(itemName == "face wash")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "face cleanser")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "face scrub")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "face toner")
		{
			price = 220 * quantity;
			return price;
		}
		else if(itemName == "face serum")
		{
			price = 350 * quantity;
			return price;
		}
		else if(itemName == "moisturizer")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "sunscreen")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "night cream")
		{
			price = 280 * quantity;
			return price;
		}
		else if(itemName == "day cream")
		{
			price = 260 * quantity;
			return price;
		}
		else if(itemName == "under eye cream")
		{
			price = 320 * quantity;
			return price;
		}
		else if(itemName == "face mask")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "sheet mask")
		{
			price = 120 * quantity;
			return price;
		}
		else if(itemName == "clay mask")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "peel off mask")
		{
			price = 170 * quantity;
			return price;
		}
		else if(itemName == "lip balm")
		{
			price = 90 * quantity;
			return price;
		}
		else if(itemName == "lip scrub")
		{
			price = 110 * quantity;
			return price;
		}
		else if(itemName == "body lotion")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "body butter")
		{
			price = 350 * quantity;
			return price;
		}
		else if(itemName == "body scrub")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "body oil")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "hand cream")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "foot cream")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "foot scrub")
		{
			price = 160 * quantity;
			return price;
		}
		else if(itemName == "face mist")
		{
			price = 220 * quantity;
			return price;
		}
		else if(itemName == "makeup remover")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "micellar water")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "cleansing oil")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "cleansing balm")
		{
			price = 320 * quantity;
			return price;
		}
		else if(itemName == "face oil")
		{
			price = 280 * quantity;
			return price;
		}
		else if(itemName == "eye gel")
		{
			price = 260 * quantity;
			return price;
		}
		else if(itemName == "pimple cream")
		{
			price = 150 * quantity;
			return price;
		}
		else if(itemName == "acne gel")
		{
			price = 170 * quantity;
			return price;
		}
		else if(itemName == "dark spot corrector")
		{
			price = 350 * quantity;
			return price;
		}
		else if(itemName == "skin brightening cream")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "anti aging cream")
		{
			price = 400 * quantity;
			return price;
		}
		else if(itemName == "retinol cream")
		{
			price = 450 * quantity;
			return price;
		}
		else if(itemName == "vitamin c serum")
		{
			price = 500 * quantity;
			return price;
		}
		else if(itemName == "hyaluronic acid serum")
		{
			price = 480 * quantity;
			return price;
		}
		else if(itemName == "niacinamide serum")
		{
			price = 420 * quantity;
			return price;
		}
		else if(itemName == "face gel")
		{
			price = 220 * quantity;
			return price;
		}
		else if(itemName == "aloe vera gel")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "rose water")
		{
			price = 140 * quantity;
			return price;
		}
		else if(itemName == "facial kit")
		{
			price = 600 * quantity;
			return price;
		}
		else if(itemName == "face pack")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "tan removal cream")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "skin polish")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "after shave lotion")
		{
			price = 180 * quantity;
			return price;
		}
		else if(itemName == "beard oil")
		{
			price = 250 * quantity;
			return price;
		}
		else if(itemName == "beard balm")
		{
			price = 270 * quantity;
			return price;
		}
		else if(itemName == "face sunscreen gel")
		{
			price = 320 * quantity;
			return price;
		}
		else if(itemName == "spf moisturizer")
		{
			price = 300 * quantity;
			return price;
		}
		else if(itemName == "body sunscreen")
		{
			price = 350 * quantity;
			return price;
		}
		else if(itemName == "cooling gel")
		{
			price = 200 * quantity;
			return price;
		}
		else if(itemName == "skin repair cream")
		{
			price = 380 * quantity;
			return price;
		}
		else if(itemName == "face essence")
		{
			price = 420 * quantity;
			return price;
		}
		else if(itemName == "skin booster")
		{
			price = 500 * quantity;
			return price;
		}
		else if(itemName == "hydrating mist")
		{
			price = 260 * quantity;
			return price;
		}
		else if(itemName == "face peeling solution")
		{
			price = 450 * quantity;
			return price;
		}
		else
		{
			return 0.0;
		}
	}
}