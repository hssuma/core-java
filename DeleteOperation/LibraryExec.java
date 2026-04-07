class LibraryExec
{
	public static void main(String args[])
	{
		Library l = new Library();
		l.addBooks("MAHA BHARATA");
		l.addBooks("Bhagavadgeeta");
		l.addBooks("Smarter than the storm");
		l.addBooks("HELI HOGU KARANAVA");
		l.addBooks("Mookajjiya kanasugalu");
		l.addBooks("Bettada jeeva");
		l.addBooks("Kamalapura estate");
		l.addBooks("Vamsha vruksha");
		l.addBooks("Monitizing inovation");
		l.addBooks("Inspired");
		l.addBooks("AI driven leader");
		l.addBooks("Power of subconsicious mind");
		l.addBooks("the magic");
		l.addBooks("War and peace");
		l.getBooks();
		System.out.println("\nAfter Updating\n");
		l.updateBook("Smarter than the storm", "SMARTER THAN THE STORM");
		l.getBooks();
		System.out.println("\nAfter deleting\n");
		l.deleteBook("the magic");
		l.getBooks();
	}
}