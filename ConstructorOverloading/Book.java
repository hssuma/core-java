class Book
{
	String bookName ;
	String author;
	double cost;
	int pages;
	byte rank;
	long isbnNo ;
	
	Book()
	{
		System.out.println("This is a default constructor ");
	}
	Book(String bookName)
	{
		this.bookName = bookName;
		System.out.println("The book is "+bookName);
	}
	Book(String bookName, String author)
	{
		this.bookName = bookName;
		this.author = author;
		System.out.println("The author of the book "+bookName + " is "+author);
	}
	Book(String bookName, int pages)
	{
		this.bookName = bookName;
		this.pages = pages;
		System.out.println("the book "+bookName +" Consists of "+pages+" pages");
	}
	Book(String bookName, double cost)
	{
		this.bookName = bookName;
		this.cost = cost;
		System.out.println("The cost of the book "+bookName+" is "+cost);
	}
	Book(byte rank)
	{
		this.rank = rank;
		System.out.println("The rank of the book "+bookName + " is ");
	}
	Book(long isbnNo)
	{
		this.isbnNo = isbnNo;
		System.out.println("The book's ISBN Number "+isbnNo);
	}
}