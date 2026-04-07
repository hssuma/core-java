class DigitalZoneExec
{
	public static void main(String[] args)
	{
		DigitalZone d = new DigitalZone();
		d.addlaptopBrands("Dell");
		d.addlaptopBrands("HP");
		d.addlaptopBrands("Victus");
		d.addlaptopBrands("Think pad");
		d.addlaptopBrands("Lenovo");
		d.addlaptopBrands("Apple");
		d.updateLaptop("Think pad", "ASUS");
		d.getLaptops();
		d. deleteLaptop("ASUS");
		d.getLaptops();
	}
}