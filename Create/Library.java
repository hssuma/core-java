class Library
{
	String bookNames[] = new String[13];
	int index;
	
	public boolean addBooks(String bookName)
	{
		boolean isAdded = false;
		if(index<bookNames.length)
		{
			if(bookName != null && !bookName.isEmpty())
				bookNames[index++] = bookName;
			else
				System.out.println(bookName+"is not valid");
		}
		else
			System.out.println("memory is full");
		return isAdded;
	}
	void getBooks()
	{
		for(String bookName : bookNames)
			System.out.println(bookName);
	}
}