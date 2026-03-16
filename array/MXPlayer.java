class MXPlayer
{
	public static void main(String args[])
	{
		String appName = "MX Player";

		String languages[] = {
			"Hindi",
			"English",
			"Telugu",
			"Tamil",
			"Kannada",
			"Malayalam"
		};

		String hindiDramas[] = {
			"Aashram","Aashram 2","Aashram 3","Queen","Bhaukaal",
			"Bhaukaal 2","Masoom","Masoom 2","Raktanchal","Raktanchal 2",
			"Lock Upp","Hello Mini","Hello Mini 2","Hello Mini 3","Ek Thi Begum",
			"Ek Thi Begum 2","Chakravyuh","High","The Missing Stone",
			"Dangerous","Thinkistan","Matsya Kaand","Bisaat","Miya Biwi Aur Murder",
			"Roohaniyat","Roohaniyat 2","Campus Diaries","Shiksha Mandal",
			"Jab We Matched","Half Pants Full Pants"
		};

		String englishDramas[] = {
			"All American","The Good Doctor","Chicago Fire","Chicago PD","Chicago Med",
			"The Resident","This Is Us","New Amsterdam","Grey's Anatomy","House",
			"Suits","Mad Men","Billions","The Office","Friends",
			"How I Met Your Mother","Breaking Bad","Better Call Saul","Prison Break",
			"Lost","Dexter","The Mentalist","Castle","Lucifer",
			"Supernatural","Vampire Diaries","Originals","Arrow",
			"Flash","Gotham"
		};

		String teluguDramas[] = {
			"Kudi Yedamaithe","Anando Brahma","Hello World","Loser",
			"Loser 2","Bhamakalapam","Gaalivaana","Meet Cute",
			"Oka Chinna Family Story","Manu","Sathya","Aha Naa Pellanta",
			"Chadarangam","Parampara","Parampara 2","Recce",
			"Modern Love Hyderabad","Jhansi","Dayaa","Sthree",
			"Vere Level Office","Newsense","Commit Mental Madhilo",
			"3 Roses","Gaalipatam","Super Singer",
			"Iddaru Ammayilu","Krishnaveni","Amrutham Reloaded","Rudraveena"
		};

		String tamilDramas[] = {
			"Queen Tamil","Vella Raja","Suzhal","Iru Dhuruvam",
			"Iru Dhuruvam 2","Triples","Fingertip","Fingertip 2",
			"Paper Rocket","Vadhandhi","Sweet Kaaram Coffee",
			"Mathagam","Mansion 24","The Village","Live Telecast",
			"Time Enna Boss","Kalachithiram","Aindham Vedham",
			"Kanna Kanna","Velan","Roja",
			"Chithi","Kolangal","Metti Oli",
			"Deivamagal","Thirumathi Hitler","Sembaruthi",
			"Rettai Roja","Poove Poochoodava","Pandian Stores"
		};

		String kannadaDramas[] = {
			"Honeymoon","Hustle","Bicchugatti","Mathagathi",
			"Love Mocktail Series","Kshamisi Nimma Khaateyalli Hanavilla",
			"Badava Rascal","French Biryani","Mayabazar",
			"Guru Brahma","Simple Aag Ond Love Story",
			"Tagaru Palya","Birbal","Birbal 2",
			"Kirik Party","Dia","Gantumoote",
			"Ugramm","Mufti","Popcorn Monkey Tiger",
			"Operation Alamelamma","RangiTaranga",
			"Bell Bottom","Avane Srimannarayana",
			"777 Charlie","Kantara",
			"KGF","KGF 2","Salaga","Garuda Gamana"
		};

		String malayalamDramas[] = {
			"Karikku","Thera Para","Oru Chiri Iru Chiri Bumper Chiri",
			"Maniyarayile Ashokan","Thuramukham",
			"Operation Java","CU Soon","Kala",
			"Joji","Drishyam","Drishyam 2",
			"Home","Take Off","Virus",
			"Android Kunjappan","Minnal Murali",
			"Great Indian Kitchen","Kuruthi",
			"Cold Case","Forensic",
			"Uyare","Kumbalangi Nights",
			"Maheshinte Prathikaaram","Charlie",
			"Premam","Bangalore Days",
			"Lucifer","Bheeshma Parvam",
			"Romancham","Rorschach"
		};

		System.out.println("App name is " + appName);

		System.out.println("Available Languages:");
		System.out.println(
			languages[0]+"\n"+languages[1]+"\n"+languages[2]+"\n"+
			languages[3]+"\n"+languages[4]+"\n"+languages[5]+"\n"
		);

		System.out.println("Hindi Dramas:");
		System.out.println(
			hindiDramas[0]+"\n"+hindiDramas[1]+"\n"+hindiDramas[2]+"\n"+hindiDramas[3]+"\n"+hindiDramas[4]+"\n"+
			hindiDramas[5]+"\n"+hindiDramas[6]+"\n"+hindiDramas[7]+"\n"+hindiDramas[8]+"\n"+hindiDramas[9]+"\n"+
			hindiDramas[10]+"\n"+hindiDramas[11]+"\n"+hindiDramas[12]+"\n"+hindiDramas[13]+"\n"+hindiDramas[14]+"\n"+
			hindiDramas[15]+"\n"+hindiDramas[16]+"\n"+hindiDramas[17]+"\n"+hindiDramas[18]+"\n"+hindiDramas[19]+"\n"+
			hindiDramas[20]+"\n"+hindiDramas[21]+"\n"+hindiDramas[22]+"\n"+hindiDramas[23]+"\n"+hindiDramas[24]+"\n"+
			hindiDramas[25]+"\n"+hindiDramas[26]+"\n"+hindiDramas[27]+"\n"+hindiDramas[28]+"\n"+hindiDramas[29]
		);

		System.out.println("English Dramas:");
		System.out.println(
			englishDramas[0]+"\n"+englishDramas[1]+"\n"+englishDramas[2]+"\n"+englishDramas[3]+"\n"+englishDramas[4]+"\n"+
			englishDramas[5]+"\n"+englishDramas[6]+"\n"+englishDramas[7]+"\n"+englishDramas[8]+"\n"+englishDramas[9]+"\n"+
			englishDramas[10]+"\n"+englishDramas[11]+"\n"+englishDramas[12]+"\n"+englishDramas[13]+"\n"+englishDramas[14]+"\n"+
			englishDramas[15]+"\n"+englishDramas[16]+"\n"+englishDramas[17]+"\n"+englishDramas[18]+"\n"+englishDramas[19]+"\n"+
			englishDramas[20]+"\n"+englishDramas[21]+"\n"+englishDramas[22]+"\n"+englishDramas[23]+"\n"+englishDramas[24]+"\n"+
			englishDramas[25]+"\n"+englishDramas[26]+"\n"+englishDramas[27]+"\n"+englishDramas[28]+"\n"+englishDramas[29]
		);

				System.out.println("Telugu Dramas:");
		System.out.println(
			teluguDramas[0]+"\n"+teluguDramas[1]+"\n"+teluguDramas[2]+"\n"+teluguDramas[3]+"\n"+teluguDramas[4]+"\n"+
			teluguDramas[5]+"\n"+teluguDramas[6]+"\n"+teluguDramas[7]+"\n"+teluguDramas[8]+"\n"+teluguDramas[9]+"\n"+
			teluguDramas[10]+"\n"+teluguDramas[11]+"\n"+teluguDramas[12]+"\n"+teluguDramas[13]+"\n"+teluguDramas[14]+"\n"+
			teluguDramas[15]+"\n"+teluguDramas[16]+"\n"+teluguDramas[17]+"\n"+teluguDramas[18]+"\n"+teluguDramas[19]+"\n"+
			teluguDramas[20]+"\n"+teluguDramas[21]+"\n"+teluguDramas[22]+"\n"+teluguDramas[23]+"\n"+teluguDramas[24]+"\n"+
			teluguDramas[25]+"\n"+teluguDramas[26]+"\n"+teluguDramas[27]+"\n"+teluguDramas[28]+"\n"+teluguDramas[29]
		);

		System.out.println("Tamil Dramas:");
		System.out.println(
			tamilDramas[0]+"\n"+tamilDramas[1]+"\n"+tamilDramas[2]+"\n"+tamilDramas[3]+"\n"+tamilDramas[4]+"\n"+
			tamilDramas[5]+"\n"+tamilDramas[6]+"\n"+tamilDramas[7]+"\n"+tamilDramas[8]+"\n"+tamilDramas[9]+"\n"+
			tamilDramas[10]+"\n"+tamilDramas[11]+"\n"+tamilDramas[12]+"\n"+tamilDramas[13]+"\n"+tamilDramas[14]+"\n"+
			tamilDramas[15]+"\n"+tamilDramas[16]+"\n"+tamilDramas[17]+"\n"+tamilDramas[18]+"\n"+tamilDramas[19]+"\n"+
			tamilDramas[20]+"\n"+tamilDramas[21]+"\n"+tamilDramas[22]+"\n"+tamilDramas[23]+"\n"+tamilDramas[24]+"\n"+
			tamilDramas[25]+"\n"+tamilDramas[26]+"\n"+tamilDramas[27]+"\n"+tamilDramas[28]+"\n"+tamilDramas[29]
		);

		System.out.println("Kannada Dramas:");
		System.out.println(
			kannadaDramas[0]+"\n"+kannadaDramas[1]+"\n"+kannadaDramas[2]+"\n"+kannadaDramas[3]+"\n"+kannadaDramas[4]+"\n"+
			kannadaDramas[5]+"\n"+kannadaDramas[6]+"\n"+kannadaDramas[7]+"\n"+kannadaDramas[8]+"\n"+kannadaDramas[9]+"\n"+
			kannadaDramas[10]+"\n"+kannadaDramas[11]+"\n"+kannadaDramas[12]+"\n"+kannadaDramas[13]+"\n"+kannadaDramas[14]+"\n"+
			kannadaDramas[15]+"\n"+kannadaDramas[16]+"\n"+kannadaDramas[17]+"\n"+kannadaDramas[18]+"\n"+kannadaDramas[19]+"\n"+
			kannadaDramas[20]+"\n"+kannadaDramas[21]+"\n"+kannadaDramas[22]+"\n"+kannadaDramas[23]+"\n"+kannadaDramas[24]+"\n"+
			kannadaDramas[25]+"\n"+kannadaDramas[26]+"\n"+kannadaDramas[27]+"\n"+kannadaDramas[28]+"\n"+kannadaDramas[29]
		);

		System.out.println("Malayalam Dramas:");
		System.out.println(malayalamDramas[0]+"\n"+malayalamDramas[1]+"\n"+malayalamDramas[2]+"\n"+malayalamDramas[3]+"\n"+malayalamDramas[4]+"\n"+malayalamDramas[5]+"\n"+malayalamDramas[6]+"\n"+malayalamDramas[7]+"\n"+malayalamDramas[8]+"\n"+malayalamDramas[9]+"\n"+malayalamDramas[10]+"\n"+malayalamDramas[11]+"\n"+malayalamDramas[12]+"\n"+malayalamDramas[13]+"\n"+malayalamDramas[14]+"\n"+malayalamDramas[15]+"\n"+malayalamDramas[16]+"\n"+malayalamDramas[17]+"\n"+malayalamDramas[18]+"\n"+malayalamDramas[19]+"\n"+malayalamDramas[20]+"\n"+malayalamDramas[21]+"\n"+malayalamDramas[22]+"\n"+malayalamDramas[23]+"\n"+malayalamDramas[24]+"\n"+malayalamDramas[25]+"\n"+malayalamDramas[26]+"\n"+malayalamDramas[27]+"\n"+malayalamDramas[28]+"\n"+malayalamDramas[29]);

	}
}
