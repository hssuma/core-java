class Shivamogga
{
	int pincodes[] = new int[8];
	int index;
	
	public boolean addPincodes(int pincode)
	{
		boolean isadded = false;
		if(index<pincodes.length){
		if(pincode != 0)
		{
			pincodes[index++] = pincode;
		}
		else
			System.out.println("Pincode is not valid");
		}
		else
			System.out.println("pincode is already");
		return isadded;
	}
	
	public void getPincodes()
	{
		System.out.println("The list of pincodes are");
		for(int pincode : pincodes)
			System.out.println(pincode);
	}
}