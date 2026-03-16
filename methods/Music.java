import java.util.Scanner;
class Music
{
	static Scanner read = new Scanner(System.in);
	static String language;
	static void music()
	{
		switch(language) 
		{
			case "kannada":
			{		
				System.out.println("you have selected kannada language");				
				if(language.equals("kannada"))
				{					
					System.out.println("Select the song which u like to play ");
					System.out.println("type amma for amma song");
					System.out.println("type appa for amma song");
					System.out.println("tpe anna  for amma song");										
					
					String song;
					
					song = read.next();
					
					if(song.equals("amma")||song.equals("appa")||song.equals("anna"))
					{
					switch(song)
					{
						case "rap":
						{
							System.out.println("You have selected rap song");
							break;
						}
						case "romantic":
						{
							System.out.println("You have selected romantic song");
							break;
						}
						case "classical":
						{
							System.out.println("You have selected classical song");
							break;
						}
					}
					}
					else
					{
						System.out.println("you have entered wrong input ");
					}					
				}
				
				break;
			}
			case "english":{
				System.out.println("you have selected English language");
				break;
				
			}
			case "Tamil":
			{
				System.out.println("you have selected Tamil language");
				break;
			}
			case "Telugu":
			{
				System.out.println("you have selected Telugu language");
				
				break;
			}
		}
	}
	public static void main(String args[])
	{
		//Scanner read = new Scanner(System.in);
		System.out.println("Select kannada for kannada language");
		System.out.println("Select english for English language");
		System.out.println("Select tamil for Tamil language");
		System.out.println("Select telugu for Telugu language");
		language = read.next();
		
		music();
		return;
	}
	
}