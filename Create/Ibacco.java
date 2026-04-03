class Ibacco
{
	String iceCreams[] = new String[10];
	int index;
	
	public boolean addIceCream(String iceCream)
	{
		boolean isadded = false;
		if(index < iceCreams.length)
		{
			System.out.println("You can add iceCream memory is free");
		if(iceCream != null && !iceCream.isEmpty())
		{
			iceCreams[index++] = iceCream;
		}
		else
			System.out.println(iceCream +" is not valid ");
		}
		else
			System.out.println("Icream is full already");
		return isadded;
	}
	public void getIcecream()
	{
		for(String iceCream : iceCreams)	
			System.out.println(iceCream);
	}
}