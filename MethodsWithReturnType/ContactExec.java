class ContactExec
{
	public static void main(String ref[])
	{
		long contactName = Contacts.contactDeatils("me");
		System.out.println(contactName);
		long num = Contacts.contactDeatils("amma");
		System.out.println(num);
		long number = Contacts.contactDeatils("appa");
		System.out.println(number);
		long phnnum = Contacts.contactDeatils("appa2");
		System.out.println(phnnum);
		long phnNum = Contacts.contactDeatils("chikkappa");
		System.out.println(phnNum);
		long contact = Contacts.contactDeatils("chikkappa2");
		System.out.println(contact);
	}
}