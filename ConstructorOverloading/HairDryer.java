class HairDryer
{
	String brand ;
	double cost;
	String color;
	int unitCount;
	String countryOfOrigin;
	String material;
	
	HairDryer()
	{
		System.out.println("This is a default constructor");
	}
	HairDryer(String brand)
	{
		this.brand = brand;
		System.out.println(brand);
	}
	HairDryer(double cost)
	{
		this.cost = cost;
		System.out.println(cost);
	}
	HairDryer(String brand, double cost)
	{
		this.brand = brand;
		this.cost = cost;
		System.out.println(brand);
		System.out.println(cost);
	}
	HairDryer(String color, int unitCount)
	{
		this.color = color;
		this.unitCount = unitCount;
		System.out.println(color);
		System.out.println(unitCount);
	}
	HairDryer(int unitCount)
	{
		this.unitCount = unitCount;
		System.out.println(unitCount);
	}
	HairDryer(String countryOfOrigin, String material)
	{
		this.countryOfOrigin = countryOfOrigin;
		this.material = material;
		System.out.println(countryOfOrigin);
		System.out.println(material);
	}
	
}