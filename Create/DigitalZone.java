class DigitalZone
{
	String laptopBrands[] = new String[6];
	int index;

	public boolean addlaptopBrands(String laptopBrand)
	{
		boolean isadded = false;
		if(index< laptopBrands.length)
		{
			if(laptopBrand != null && !laptopBrand.isEmpty())
				laptopBrands[index++] = laptopBrand;
			else
				System.out.println(laptopBrand+" is not valid");
		}
		else
			System.out.println("the memory is full");
		return isadded;
	}
	public void getDetails()
	{
		for(String laptopName : laptopBrands)
			System.out.println(laptopName);
	}
}