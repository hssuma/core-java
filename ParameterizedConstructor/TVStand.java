class TVStand
{
	String height;
	String  color;
	String brand;
	int cost;
	
	TVStand()
	{
		System.out.println("This is a default constructor");
	}
	
	TVStand(String height, String color)
	{
		this.height = height;
		this.color = color;
	}
	
	void display()
	{
		System.out.println("The height of a TVStand is "+height);
		System.out.println("The color of a TVStand is "+color);
	}
	
	
	TVStand(String b, int c, String h)
	{
		System.out.println("TVStand with 3 param");
		brand = b;
		cost =c;	
		height = h;
		
	}
	void displayDetails()
	{
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(height);
	}
}