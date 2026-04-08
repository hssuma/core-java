class ECommerceExec
{
	public static void main(String args[])
	{
		ECommerce e = new ECommerce();
		Product p = new Product();
		
		p.productId = 1;
		p.productName = "MMTool";
		p.manufacturedDate = "01/04/2026";
		p.cost = 150.23;
		boolean added = e. addProducts(p);
		System.out.println(added);
		
		Product pTwo = new Product();
		pTwo.productId = 2;
		pTwo.productName = "Punch";
		pTwo.manufacturedDate = "9/3/2026";
		pTwo.cost = 300.25;
		added = e. addProducts(pTwo);
		System.out.println(added);
		
		Product pThree = new Product();
		pThree.productId = 3;
		pThree.productName = "Belt";
		pThree.manufacturedDate = "14/02/2026";
		pThree.cost = 300.54;
		added = e. addProducts(pThree);
		System.out.println(added);
		
		Product p4 = new Product();
		p4.productId = 4;
		p4.productName = "Stand";
		p4.manufacturedDate = "15/3/2026";
		p4.cost = 146.23;
		added = e. addProducts(p4);
		System.out.println(added);
		
		Product p5 = new Product();
		p5.productId = 5;
		p5.productName = "TV Stand";
		p5.manufacturedDate = "9/3/2026";
		p5.cost = 900.78;
		 added = e. addProducts(p5);
		System.out.println(added);
		
		Product p6 = new Product();
		p6.productId = 6;
		p6.productName = "electric nail cutter";
		p6.manufacturedDate = "15/3/2026";
		p6.cost = 900.00;
		added = e. addProducts(p6);
		System.out.println(added);
		
		Product p7 = new Product();
		p7.productId = 7;
		p7.productName = "air pump";
		p7.manufacturedDate = "9/3/2026";
		p7.cost = 4503.25;
		added = e. addProducts(p7);
		System.out.println(added);
		
		Product p8 = new Product();
		p8.productId = 8;
		p8.productName = "juicer";
		p8.manufacturedDate = "9/5/2026";
		p8.cost = 9008;
		 added = e. addProducts(p8);
		System.out.println(added);
		
		Product p9 = new Product();
		p9.productId = 9;
		p9.productName = "weighing machine";
		p9.manufacturedDate = "01/04/2026";
		p9.cost = 4500.23;
		added = e. addProducts(p9);
		System.out.println(added);
		
		Product p10 = new Product();
		p10.productId = 10;
		p10.productName = "mirror";
		p10.manufacturedDate= "15/3/2026";
		p10.cost = 421.32;
		added = e. addProducts(p10);
		System.out.println(added);
		
		Product p11 = new Product();
		p11.productId = 11;
		p11.productName = "kettle";
		p11.manufacturedDate = "15/1/2026";
		p11.cost = 451.23;
		added = e. addProducts(p11);
		System.out.println(added);
		Product p12 = new Product();
		p12.productId = 12;
		p12.productName = "bag";
		p12.manufacturedDate = "25/3/2026";
		p12.cost = 900.87;
		added = e. addProducts(p12);
		System.out.println(added);
		
		Product p13 = new Product();
		p13.productId = 13;
		p13.productName = "clock";
		p13.manufacturedDate = "01/04/2026";
		p13.cost = 256.23;
		added = e. addProducts(p13);
		System.out.println(added);
		
		Product p14 = new Product();
		p14.productId = 14;
		p14.productName = "table top";
		p14.manufacturedDate = "25/3/2026";
		p14.cost = 356.21;
		added = e. addProducts(p14);
		System.out.println(added);
		
		Product p15 = new Product();
		p15.productId = 15;
		p15.productName = "power bank";
		p15.manufacturedDate = "15/4/2026";
		p15.cost = 9087.89;
		 added = e. addProducts(p15);
		System.out.println(added);
		Product p16 = new Product();
		p16.productId = 16;
		p16.productName = "Cup holder";
		p16.manufacturedDate = "1/3/2026";
		p16.cost = 908.78;
		 added = e. addProducts(p16);
		System.out.println(added);
		Product p17 = new Product();
		p17.productId = 17;
		p17.productName = "wall hook";
		p17.manufacturedDate = "15/3/2026";
		p17.cost = 456.23;
		 added = e. addProducts(p17);
		System.out.println(added);
		Product p18 = new Product();
		p18.productId = 18;
		p18.productName = "Drill machine";
		p18.manufacturedDate = "11/04/2026";
		p18.cost = 4567.25;
		added = e. addProducts(p18);
		System.out.println(added);
		Product p19 = new Product();
		p19.productId = 19;
		p19.productName = "Study table";
		p19.manufacturedDate = "01/04/2026";
		p19.cost = 453.61;
		added = e. addProducts(p19);
		System.out.println(added);

		e.getProducts();
	}
}