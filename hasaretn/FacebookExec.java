class FacebookExec
{
	public static void main(String args[])
	{
		int index = 0;
		
		Facebook f = new Facebook();
		
		Account a = new Account();
		f.account[index++] = a;
		a.accountId = 1;
		a.userName = "Suma";
		a.email = "sumahsiddappa@gmail.com";
		a.phoneNor = 545121783l;
		
		Account aTwo = new Account();
		f.account[index++] = aTwo;
		aTwo.accountId = 2;
		aTwo.userName = "Shravani";
		aTwo.email = "shravanis@gmail.com";
		aTwo.phoneNor = 879541783l;
		
		Account aThree = new Account();
		f.account[index++] = aThree;
		aThree.accountId = 3;
		aThree.userName = "Monika";
		aThree.email = "monikahs@gmail.com";
		aThree.phoneNor = 879246783l;
		
		Account aFour = new Account();
		f.account[index++] = aFour;
		aFour.accountId = 4;
		aFour.userName = "Poojitha";
		aFour.email = "poojitha@gmail.com";
		aFour.phoneNor = 789121783l;
		
		Account aFive = new Account();
		f.account[index++] = aFive;
		aFive.accountId = 5;
		aFive.userName = "Suma";
		aFive.email = "sumahsiddappa@gmail.com";
		aFive.phoneNor = 789121783l;
		
		f.getAccountDetails();
	}
}