class Netflix
{
	public static void main(String args[])
	{
		String appName = "Netflix";

		String languages[] = {
			"English",
			"Hindi",
			"Telugu",
			"Tamil",
			"Kannada",
			"Malayalam"
		};

		String englishMovies[] = {
			"Extraction","Red Notice","Bird Box","The Gray Man","Don’t Look Up",
			"The Irishman","6 Underground","Bright","Triple Frontier","Enola Holmes",
			"The Old Guard","Project Power","The Mother","Army of the Dead","The Adam Project",
			"Glass Onion","Murder Mystery","Murder Mystery 2","The Killer","The Guilty",
			"Spencer Confidential","Polar","Outside the Wire","Kate","IO",
			"Anon","The Platform","Cargo","How It Ends"
		};

		String hindiMovies[] = {
			"RRR Hindi","Dunki","Jawan","Pathaan","Animal",
			"Drishyam","Drishyam 2","Ludo","Bulbbul","Mimi",
			"Gunjan Saxena","Darlings","Pagglait","Chor Nikal Ke Bhaga","Monica O My Darling",
			"Jaane Jaan","The White Tiger","Badla","Ajeeb Daastaans","Sardar Udham",
			"Shershaah","Raat Akeli Hai","Laila Majnu","Khufiya","Mission Majnu",
			"Bhakshak","Bawaal","Ginny Weds Sunny","Haseen Dillruba","Atrangi Re"
		};

		String teluguMovies[] = {
			"RRR","Baahubali","Baahubali 2","Salaar","Pushpa",
			"Ala Vaikunta Puramulo","Rangasthalam","Jersey","Arjun Reddy","Sita Ramam",
			"Eega","Magadheera","Athadu","Khaleja","Bichagadu",
			"Khaidi","Syeraa","Leader","Oopiri","Vikramarkudu",
			"Chatrapathi","Fidaa","Happy Days","Dear Comrade","Geetha Govindam",
			"Janatha Garage","Dasara","Pushpa 2","Hanuman","Guntur Kaaram"
		};

		String tamilMovies[] = {
			"Jailer","Vikram","Leo","Master","Kaithi",
			"Petta","Kabali","Enthiran","2.0","Sivaji",
			"Asuran","Soorarai Pottru","Jai Bhim","Visaranai","96",
			"Thani Oruvan","Mersal","Bigil","Theri","Kaththi",
			"Ayan","Ghajini","Alaipayuthey","Vinnaithaandi Varuvaayaa","Ponniyin Selvan",
			"Ponniyin Selvan 2","Maamannan","Varisu","Beast","Doctor"
		};

		String kannadaMovies[] = {
			"KGF","KGF 2","Kantara","Ugramm","Mufti",
			"Roberrt","Yuvarathnaa","Raajakumara","Tagaru","Avane Srimannarayana",
			"Bell Bottom","777 Charlie","Garuda Gamana Vrishabha Vahana","Ulidavaru Kandanthe","Lucia",
			"Kirik Party","Dia","Love Mocktail","Vikrant Rona","James",
			"Operation Alamelamma","RangiTaranga","Birbal","Pailwaan","Pogaru",
			"Ayogya","Bhajarangi","Mr and Mrs Ramachari","Gaalipata","Hudugaru"
		};

		String malayalamMovies[] = {
			"Drishyam","Drishyam 2","Lucifer","Empuraan","Premam",
			"Bangalore Days","Uyare","Take Off","Kumbalangi Nights","Joji",
			"Maheshinte Prathikaaram","Charlie","Virus","Android Kunjappan","Home",
			"Great Indian Kitchen","Minnal Murali","Kurup","Jaya Jaya Jaya Hey","Hridayam",
			"Romancham","Bheeshma Parvam","Rorschach","Mukundan Unni Associates","Thallumaala",
			"2018","Cold Case","Helen","CU Soon","Bro Daddy"
		};

		System.out.println("App name is " + appName);

		System.out.println("Available Languages:");
		System.out.println(
			languages[0]+"\n"+languages[1]+"\n"+languages[2]+"\n"+
			languages[3]+"\n"+languages[4]+"\n"+languages[5]+"\n"
		);

		System.out.println("English Movies:");
		System.out.println(
			englishMovies[0]+"\n"+englishMovies[1]+"\n"+englishMovies[2]+"\n"+englishMovies[3]+"\n"+englishMovies[4]+"\n"+
			englishMovies[5]+"\n"+englishMovies[6]+"\n"+englishMovies[7]+"\n"+englishMovies[8]+"\n"+englishMovies[9]+"\n"+
			englishMovies[10]+"\n"+englishMovies[11]+"\n"+englishMovies[12]+"\n"+englishMovies[13]+"\n"+englishMovies[14]+"\n"+
			englishMovies[15]+"\n"+englishMovies[16]+"\n"+englishMovies[17]+"\n"+englishMovies[18]+"\n"+englishMovies[19]+"\n"+
			englishMovies[20]+"\n"+englishMovies[21]+"\n"+englishMovies[22]+"\n"+englishMovies[23]+"\n"+englishMovies[24]+"\n"+
			englishMovies[25]+"\n"+englishMovies[26]+"\n"+englishMovies[27]+"\n"+englishMovies[28]+"\n"+englishMovies[29]
		);

		System.out.println("Hindi Movies:");
		System.out.println(
			hindiMovies[0]+"\n"+hindiMovies[1]+"\n"+hindiMovies[2]+"\n"+hindiMovies[3]+"\n"+hindiMovies[4]+"\n"+
			hindiMovies[5]+"\n"+hindiMovies[6]+"\n"+hindiMovies[7]+"\n"+hindiMovies[8]+"\n"+hindiMovies[9]+"\n"+
			hindiMovies[10]+"\n"+hindiMovies[11]+"\n"+hindiMovies[12]+"\n"+hindiMovies[13]+"\n"+hindiMovies[14]+"\n"+
			hindiMovies[15]+"\n"+hindiMovies[16]+"\n"+hindiMovies[17]+"\n"+hindiMovies[18]+"\n"+hindiMovies[19]+"\n"+
			hindiMovies[20]+"\n"+hindiMovies[21]+"\n"+hindiMovies[22]+"\n"+hindiMovies[23]+"\n"+hindiMovies[24]+"\n"+
			hindiMovies[25]+"\n"+hindiMovies[26]+"\n"+hindiMovies[27]+"\n"+hindiMovies[28]+"\n"+hindiMovies[29]
		);

		System.out.println("Telugu Movies:");
		System.out.println(
			teluguMovies[0]+"\n"+teluguMovies[1]+"\n"+teluguMovies[2]+"\n"+teluguMovies[3]+"\n"+teluguMovies[4]+"\n"+
			teluguMovies[5]+"\n"+teluguMovies[6]+"\n"+teluguMovies[7]+"\n"+teluguMovies[8]+"\n"+teluguMovies[9]+"\n"+
			teluguMovies[10]+"\n"+teluguMovies[11]+"\n"+teluguMovies[12]+"\n"+teluguMovies[13]+"\n"+teluguMovies[14]+"\n"+
			teluguMovies[15]+"\n"+teluguMovies[16]+"\n"+teluguMovies[17]+"\n"+teluguMovies[18]+"\n"+teluguMovies[19]+"\n"+
			teluguMovies[20]+"\n"+teluguMovies[21]+"\n"+teluguMovies[22]+"\n"+teluguMovies[23]+"\n"+teluguMovies[24]+"\n"+
			teluguMovies[25]+"\n"+teluguMovies[26]+"\n"+teluguMovies[27]+"\n"+teluguMovies[28]+"\n"+teluguMovies[29]
		);

		System.out.println("Tamil Movies:");
		System.out.println(
			tamilMovies[0]+"\n"+tamilMovies[1]+"\n"+tamilMovies[2]+"\n"+tamilMovies[3]+"\n"+tamilMovies[4]+"\n"+
			tamilMovies[5]+"\n"+tamilMovies[6]+"\n"+tamilMovies[7]+"\n"+tamilMovies[8]+"\n"+tamilMovies[9]+"\n"+
			tamilMovies[10]+"\n"+tamilMovies[11]+"\n"+tamilMovies[12]+"\n"+tamilMovies[13]+"\n"+tamilMovies[14]+"\n"+
			tamilMovies[15]+"\n"+tamilMovies[16]+"\n"+tamilMovies[17]+"\n"+tamilMovies[18]+"\n"+tamilMovies[19]+"\n"+
			tamilMovies[20]+"\n"+tamilMovies[21]+"\n"+tamilMovies[22]+"\n"+tamilMovies[23]+"\n"+tamilMovies[24]+"\n"+
			tamilMovies[25]+"\n"+tamilMovies[26]+"\n"+tamilMovies[27]+"\n"+tamilMovies[28]+"\n"+tamilMovies[29]
		);

		System.out.println("Kannada Movies:");
		System.out.println(
			kannadaMovies[0]+"\n"+kannadaMovies[1]+"\n"+kannadaMovies[2]+"\n"+kannadaMovies[3]+"\n"+kannadaMovies[4]+"\n"+
			kannadaMovies[5]+"\n"+kannadaMovies[6]+"\n"+kannadaMovies[7]+"\n"+kannadaMovies[8]+"\n"+kannadaMovies[9]+"\n"+
			kannadaMovies[10]+"\n"+kannadaMovies[11]+"\n"+kannadaMovies[12]+"\n"+kannadaMovies[13]+"\n"+kannadaMovies[14]+"\n"+
			kannadaMovies[15]+"\n"+kannadaMovies[16]+"\n"+kannadaMovies[17]+"\n"+kannadaMovies[18]+"\n"+kannadaMovies[19]+"\n"+
			kannadaMovies[20]+"\n"+kannadaMovies[21]+"\n"+kannadaMovies[22]+"\n"+kannadaMovies[23]+"\n"+kannadaMovies[24]+"\n"+
			kannadaMovies[25]+"\n"+kannadaMovies[26]+"\n"+kannadaMovies[27]+"\n"+kannadaMovies[28]+"\n"+kannadaMovies[29]
		);

		System.out.println("Malayalam Movies:");
		System.out.println(
			malayalamMovies[0]+"\n"+malayalamMovies[1]+"\n"+malayalamMovies[2]+"\n"+malayalamMovies[3]+"\n"+malayalamMovies[4]+"\n"+
			malayalamMovies[5]+"\n"+malayalamMovies[6]+"\n"+malayalamMovies[7]+"\n"+malayalamMovies[8]+"\n"+malayalamMovies[9]+"\n"+
			malayalamMovies[10]+"\n"+malayalamMovies[11]+"\n"+malayalamMovies[12]+"\n"+malayalamMovies[13]+"\n"+malayalamMovies[14]+"\n"+
			malayalamMovies[15]+"\n"+malayalamMovies[16]+"\n"+malayalamMovies[17]+"\n"+malayalamMovies[18]+"\n"+malayalamMovies[19]+"\n"+
			malayalamMovies[20]+"\n"+malayalamMovies[21]+"\n"+malayalamMovies[22]+"\n"+malayalamMovies[23]+"\n"+malayalamMovies[24]+"\n"+
			malayalamMovies[25]+"\n"+malayalamMovies[26]+"\n"+malayalamMovies[27]+"\n"+malayalamMovies[28]+"\n"+malayalamMovies[29]
		);
	}
}
