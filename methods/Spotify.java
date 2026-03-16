class Spotify
{
	
	static String languages[]={"kannada", "English","Hindi","Tamil", "Telugu"};
	static String categories[] ={"Classical", "Folk", "Romantic","pop","Rock","Rap"};
	static String classical[] = {"Spring", "Antonio Vivaldi", "Radetzky March", "Opera William Tell", "Piano Concerto No", "Gioachino Rossini"};
	static String folks[] = {"Kuchipudi", "Bihu", "Lavani", "Bhangra", " Caporales", "Samba", "Ghoomar"};
	
	static void music()
	{
		System.out.println("Songs available in different languages are  ");
		for (String language : languages)
		{
			System.out.println(language);
		}
		System.out.println();
		System.out.println("Different categories of songs are ");
		for(String category : categories)
		{
			System.out.println(category);			
		}
		System.out.println();
		System.out.println("classical songs are ");
		for(String classic : classical)
		{
			System.out.println(classic);
		}
		System.out.println();
		System.out.println("folk songs are ");
		for(String folk : folks)
		{
			System.out.println(folk);
		}
		
	}
	public static void main(String args[])
	{
		music();
	}
}