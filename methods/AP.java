class AP {

    
       static String appName = "Amazon Prime Video";

        
      static  String englishComedies[] = {
            "The Office", "Parks and Recreation", "The Marvelous Mrs Maisel", "Fleabag", "The Big Bang Theory",
            "Modern Family", "Schitts Creek", "Brooklyn Nine Nine", "Upload", "Coming 2 America",
            "Borat", "The Dictator", "21 Jump Street", "The Upside", "Brittany Runs a Marathon",
            "Late Night", "The Internship", "Good Omens", "Two and a Half Men", "Young Sheldon",
            "The Hangover", "Superbad", "Step Brothers", "Game Night", "Horrible Bosses",
            "Ted", "Were the Millers", "Central Intelligence", "Booksmart", "The Heat"
        };

      static  String hindiComedies[] = {
            "Panchayat", "Hera Pheri", "Andaz Apna Apna", "Munna Bhai MBBS", "3 Idiots",
            "Golmaal", "Welcome", "Bhool Bhulaiyaa", "Good Newwz", "Dream Girl",
            "Chhichhore", "Fukrey", "Hindi Medium", "Vicky Donor", "Stree",
            "Bala", "Badhaai Ho", "Bareilly Ki Barfi", "Ludo", "Piku",
            "Sonu Ke Titu Ki Sweety", "Shubh Mangal Saavdhan", "Total Dhamaal", "Dhamaal", "Housefull",
            "Madgaon Express", "Crew", "Munjya", "Fukrey 3", "Bad Newz"
        };

       static String teluguComedies[] = {
            "Mathu Vadalara", "Jathi Ratnalu", "Agent Sai", "Pelli Choopulu", "Ee Nagaraniki Emaindi",
            "Brochevarevarura", "F2", "Ami Thumi", "Manmadhudu", "Venky",
            "Dubai Seenu", "Ready", "King", "Dookudu", "Baadshah",
            "Nuvvu Naaku Nachav", "Malliswari", "Kick", "Race Gurram", "Ala Vaikunthapurramuloo",
            "Dj Tillu", "Tillu Square", "Om Bheem Bush", "Hasith Goli", "Vivaha Bhojanambu",
            "Middle Class Melodies", "Pushpaka Vimanam", "Skylab", "Paagal", "Cinema Bandi"
        };

       static String tamilComedies[] = {
            "Panchatanthiram", "Kalakalappu", "Vasool Raja MBBS", "Indru Netru Naalai", "Soodhu Kavvum",
            "Kadhalum Kadandhu Pogum", "Moodar Koodam", "Boss Engira Bhaskaran", "Varuthapadatha Valibar Sangam", "Rajini Murugan",
            "Comali", "Love Insurance", "Doctor", "Don", "Thallumaala",
            "Vaayai Moodi Pesavum", "Mandela", "Oh My Kadavule", "Aandavan Kattalai", "Kaathuvaakula Rendu Kaadhal",
            "Pammal K Sambandam", "Michael Madana", "Theali", "Kanni Maadam", "Gulu Gulu",
            "Vadhandhi", "Time Enna Boss", "Vellai Pookal", "Manmatha Leelai", "Sila Nerangalil"
        };

        
      static  String kannadaSeries[] = {
            "Nograj", "Honeymoon", "Loose Connection", "Ekam", "By Mistake",
            "Love You Abhi", "Shuddhi", "Bhinna", "Aarambha", "Namma Metro",
            "Mayabazar", "Satya", "Jothe Jotheyali", "Kasturi Nivasa", "Mahanati",
            "Ranganayaki", "Radha Ramana", "Gattimela", "Lakshmi Baramma", "Kavaludaari",
            "Ratnan Prapancha", "Badava Rascal", "Galipata 2", "Hostel Hudugaru", "Daredevil Mustafa",
            "Toby", "Sapta Sagaradaache", "Aachar Co", "Kousalya", "French Biriyani"
        };

       static String malayalamComedies[] = {
            "Aavesham", "Kumbalangi Nights", "Jan E Man", "Jaya Jaya Hey", "Minnal Murali",
            "Premam", "Bangalore Days", "Charlie", "Sudani from Nigeria", "Thaneer Mathan",
            "Adi Kapyare", "Aadu", "Aadu 2", "Kunjiramayanam", "Vellimoonga",
            "Maheshinte Prathikaaram", "Action Hero Biju", "North 24 Kaatham", "Driving Licence", "Pranjiyettan",
            "God Father", "In Harihar Nagar", "Sandhesam", "Kilukkam", "Chithram",
            "Boeing Boeing", "Nadodikkattu", "Mannar Mathai", "Ramji Rao", "Falimy"
        };

		
		
		
		
			//method declaration
			
			
		static void englishComedies()
		{
			System.out.println("English comidies are ");
			for( String englishComedy : englishComedies)
			{
				System.out.println(englishComedy);
			}
			System.out.println();
		}
		
		
		static void  hindiComedies()
		{
			System.out.println("Hindi comedies are ");
			for(String hindiComedy : hindiComedies)
			{
				System.out.println(hindiComedies);
			}
			System.out.println();
		}
		
		
		static void teluguComedies()
		{
			System.out.println("telugu comedies are ");
			for(String telugucomedy : teluguComedies)
			{
				System.out.println(telugucomedy);
			}
			System.out.println();
		}
		
		
		static void tamilComedies()
		{
			System.out.println("telugu comedies are :");
			for (String tamilcomedy : tamilComedies)
			{
				System.out.println(tamilcomedy);
			}
			System.out.println();
		}
		
		static void kannadaSeries()
		{
			System.out.println("kannada series are ");
			for (String kannadaserieses : kannadaSeries)
			{
				System.out.println(kannadaserieses);
			}
			System.out.println();
		}
		
		static void malayalamComedies()
		{
			System.out.println("Malayalm comedies are ");
			String malayalmComedy;
			for(malayalmComedy : malayalamComedies)
			{
				System.out.println(malayalmComedy);
			}
			System.out.println();
		}
		
		
		
		
		public static void main(String args[]) {
		
		//method initialization
		englishComedies();
		 hindiComedies();
		 teluguComedies();
		 tamilComedies();
		

    }
}