class WebsiteExec
{
	public static void main(String args[])
	{
		Website w = new Website();
		
		UserAccount u = new UserAccount();
		u.id = 1;
		u.name = "Suma";
		u.email = "sumahsiddappa@gmail.com";
		u.password = "!@jg24";
		boolean added = w.addAccount(u);
		System.out.println(added);
		
		UserAccount u2 = new UserAccount();
		u2.id = 2;
		u2.name = "Sandeep";
		u2.email = "sandeephs@gmail.com";
		u2.password = "!#T$h89";
		added = w.addAccount(u2);
		System.out.println(added);
		
		UserAccount u3 = new UserAccount();
		u3.id = 3;
		u3.name = "Chaithra";
		u3.email = "chai123@gmail.com";
		u3.password="AD!#!DE43";
		added = w.addAccount(u3);
		System.out.println(added);
		
		UserAccount u4 = new UserAccount();
		u4.id = 4;
		u4.name = "Ganesh";
		u4.email = "ganesh01@gmail.com";
		u4.password = "gdWR#!56";
		added = w.addAccount(u4);
		System.out.println(added);
		
		UserAccount u5 = new UserAccount();
		u5.id = 5;
		u5.name = "Monika";
		u5.email = "monikahs12@gmail.com";
		u5.password = "IKJ21";
		added = w.addAccount(u5);
		System.out.println(added);
		
		UserAccount u6 = new UserAccount();
		u6.id = 6;
		u6.name = "Darshan";
		u6.email = "darshanhs12@gmail.com";
		u6.password = "ghzD@dd3";
		added = w.addAccount(u6);
		System.out.println(added);
		
		UserAccount u7 = new UserAccount();
		u7.id = 7;
		u7.name = "Shravani";
		u7.email = "shravani@gmail.com";
		u7.password = "dtgtf12";
		added = w.addAccount(u7);
		System.out.println(added);
		
		UserAccount u8 = new UserAccount();
		u8.id =8;
		u8.name = "Poojitha";
		u8.email = "poojitha@gmail.com";
		u8.password = "12Poo8i";
		added = w.addAccount(u8);
		System.out.println(added);
		
		UserAccount u9 = new UserAccount();
		u9.id = 9;
		u9.name ="pragnya";
		u9.email = "pragnyaao@gmail.com";
		u9.password= "zf@#89";
		added = w.addAccount(u9);
		System.out.println(added);
		
		UserAccount u10 = new UserAccount();
		u10.id = 10;
		u10.name = "Rakshitha";
		u10.email = "rakshitha@gmail.com";
		u10.password = "fh12$%";
		added = w.addAccount(u10);
		System.out.println(added);
		
		UserAccount u11 = new UserAccount();
		u11.id = 11;
		u11.name = "Sinchana";
		u11.email = "sinchana@gmail.com";
		u11.password = "Sg24@W";
		added = w.addAccount(u11);
		System.out.println(added);
		
		UserAccount u12 = new UserAccount();
		u12.id = 12;
		u12.name = "Mamatha";
		u12.email = "mamatha@gmail.com";
		u12.password = "IJH23@#";
		added = w.addAccount(u12);
		System.out.println(added);
		
		UserAccount u13 = new UserAccount();
		u13.id = 13;
		u13.name = "Priya";
		u13.email = "priya64@gmail.com";
		u13.password = "SAS13";
		added = w.addAccount(u13);
		System.out.println(added);
		
		UserAccount u14 = new UserAccount();
		u14.id = 14;
		u14.name = "Kavya";
		u14.email = "kavyasp123@gmail.com";
		u14.password = "djj23@";
		added = w.addAccount(u14);
		System.out.println(added);
		
		UserAccount u15 = new UserAccount();
		u15.id = 15;
		u15.name = "kruthi";
		u15.email = "kruthi12@gmail.com";
		u15.password = "hf#5t57";
		added = w.addAccount(u15);
		System.out.println(added);
		
		
		w.getAccount();
		
	}
}