class DigitalZone
{
	String laptopBrands[] = new String[6];
	int index;

	public boolean addlaptopBrands(String laptopBrand)
	{
		boolean isadded = false;
		if(index< laptopBrands.length)
		{
			if(laptopBrand != null && !laptopBrand.isEmpty()){
				laptopBrands[index++] = laptopBrand;
				isadded = true;
			}
			else
				System.out.println(laptopBrand+" is not valid");
		}
		else
			System.out.println("the memory is full");
		return isadded;
	}
	public void getLaptops()
	{
		for(String laptopName : laptopBrands)
			System.out.println(laptopName);
	}
	pubic void updateLaptop(String existinglaptopName, String updateLaptopName)
	{
		for(int i=0; i<laptopBrands.length; i++)
		{
			if(laptopBrands[i] == existinglaptopName)
				laptopBrands[i] = updateLaptopName;
		}
	}
}