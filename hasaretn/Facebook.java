class Facebook
{
	Account account[] = new Account[5];
	int index= 0;
	
	boolean createAccount(Account account)
	{
		boolean iscreateAccount = false;
		this.account[index++] = account;
		
		boolean isaccountId = false;
		if(account.accountId!=0)
			isaccountId = true;
		else
			System.out.println(account.accountId+" is not valid");
		
		boolean isUserNameValid = false;
		if(account.userName != null)
			return isUserNameValid = true;
		else
			System.out.println(account.userName+" is not valid");
		
		boolean isEmailValid = false;
		if(account.email != null)
			return isEmailValid = true;
		else
			System.out.println(account.email + " is not a valid mail id");
		
		boolean isPhoneNorValid = false;
		if(account.phoneNor != 0)
			isPhoneNorValid = true;
		else
			System.out.println(account.phoneNor + " is not valid");
			
			
		if(isaccountId && isEmailValid && isUserNameValid && isPhoneNorValid  )
			iscreateAccount = true;
			
		return iscreateAccount;
	}
	
	/*void getFacebookDetails()
	{
		System.out.println("account deatils are");
		for(Account a : account)
		{
			System.out.println(a);
		}
		
	}*/
	void getAccountDetails()
	{
		for(Account a : account)
		{
			System.out.println("The account details are ");
			System.out.println("The accountId is "+a.accountId);
			System.out.println("The userName is "+a.userName);
			System.out.println("The user email is"+a.email);
			System.out.println("The user phone number is "+a.phoneNor);
			System.out.println();
		}
	}
}