class ECommerceExec
{
	public static void main(String args[])
	{
		int index =0;
		
		
		ECommerce e = new ECommerce();
		Product p = new Product();
		e.products[index++] = p;
		p.productId = 1;
		p.productName = "Storage box";
		p.cost = 150.23;
		
		Product pTwo = new Product();
		e.products[index++] = pTwo;
		pTwo.productId = 2;
		pTwo.productName = "Punch bag";
		pTwo.cost = 3000.25;
		
		Product pThree = new Product();
		e.products[index++] = pThree;
		pThree.productId = 3;
		pThree.productName = "Belt";
		pThree.cost = 300.54;
		
		Product pFour = new Product();
		e.products[index++] = pFour;
		pFour.productId = 4;
		pFour.productName = "Stand";
		pFour.cost = 146.23;
		
		Product pFive = new Product();
		e.products[index++] = pFive;
		pFive.productId = 5;
		pFive.productName = "TV Stand";
		pFive.cost = 900.78;
		
		Product pSix = new Product();
		e.products[index++] = pSix;
		pSix.productId = 6;
		pSix.productName = "electric nail cutter";
		pSix.cost = 900.00;
		
		Product pSeven = new Product();
		e.products[index++] = pSeven;
		pSeven.productId = 7;
		pSeven.productName = "air pump";
		pSeven.cost = 4503.25;
		
		Product pEight = new Product();
		e.products[index++] = pEight;
		pEight.productId = 8;
		pEight.productName = "juicer";
		pEight.cost = 9008;
		
		Product pNine = new Product();
		e.products[index++] = pNine;
		pNine.productId = 9;
		pNine.productName = "Induction stove";
		pNine.cost = 4500.23;
	
		
		Product pTen = new Product();
		e.products[index++] = pTen;
		pTen.productId = 10;
		pTen.productName = "Sticker mirror";
		pTen.cost = 421.32;

		e.getProducts();
	}
}