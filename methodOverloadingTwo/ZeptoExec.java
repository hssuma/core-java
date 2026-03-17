class ZeptoExec
{
	public static void main(String ref[])
	{
		String itemName = "pizza";
		double price = Zepto.search("pizza");
		System.out.println("The price of the "+ itemName+ " is "+price);
		
		/*itemName = "burger";
		double price = Zomato.search("burger");
		System.out.println("The price of the "+itemName + " is "+price);*/
		price = Zepto.search("burger", 3);
		System.out.println("The price of burger is "+price );
		
		price = Zepto.search("sev puri",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("bhel puri",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("pani puri",2);
		System.out.println("The price is "+price);
		
		price = Zepto.search("gol gappa",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("dhai puri",3);
		System.out.println("The price is "+price);
		
		 price = Zepto.search("pizza", 2);
		System.out.println("The price of pizza is "+price);
		
		price = Zepto.search("sandwich",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("frenchfries",2);
		System.out.println("The price is "+price);
		
		price = Zepto.search("black current cone ice cream",6);
		System.out.println("The price is "+price);
		
		price = Zepto.search("lays",6);
		System.out.println("The price is "+price);
		
		price = Zepto.search("namkeen mixture",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("ggod day",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("marie gold",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("parle g",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("50-50",5);
		System.out.println("The price is "+price);
		
		price = Zepto.search("ragi biscuits",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("dairy milk",4);
		System.out.println("The price is "+price);
		
		price = Zepto.search("kit kat",4);
		System.out.println("The price is "+price);
		
		price = Zepto.search("5 star",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("chacolate bar",8);
		System.out.println("The price is "+price);
		
		price = Zepto.search("kurkure",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("chacolate ice cream",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("slice",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("cocola",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("7 up",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("zeera",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("sprite",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("thumbs up",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("mango juice",6);
		System.out.println("The price is "+price);
		
		price = Zepto.search("apple juice",2);
		System.out.println("The price is "+price);
		
		price = Zepto.search("grape juice",3);
		System.out.println("The price is "+price);
	
		price = Zepto.search("pomogranate juice",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("avacado juice",3);
		System.out.println("The price is "+price);
		
		price = Zepto.search("blue berry juice",6);
		System.out.println("The price is "+price);
		
		price = Zepto.search("orange juice",4);
		System.out.println("The price is "+price);
		price = Zepto.search("mix fruit juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("grape juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("carn berry juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("lemon juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("strawberry juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("watermelon juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("guva juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("amla juice",3);
		System.out.println("The price is "+price);
		price = Zepto.search("pav bhaji",3);
		System.out.println("The price is "+price);
		price = Zepto.search("samoas",3);
		System.out.println("The price is "+price);
		price = Zepto.search("aloo tiki sandwich",3);
		System.out.println("The price is "+price);
	
	}
	
}