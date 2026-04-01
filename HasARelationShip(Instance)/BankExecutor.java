class BankExecutor
{
    public static void main(String[] args)
	{
        Bank b1 = new Bank();
        b1.bankId = 1;
        b1.bankName = "SBI";
        b1.location = "Bangalore";
        b1.isNationalized = true;

        AccountHolder a1 = new AccountHolder();
        a1.holderId = 101;
        a1.name = "Ravi";
        a1.accountType = "Savings";
        a1.hasDebitCard = true;

        b1.accountHolder = a1;


        
        Bank b2 = new Bank();
        b2.bankId = 2;
        b2.bankName = "HDFC";
        b2.location = "Mysore";
        b2.isNationalized = false;

        AccountHolder a2 = new AccountHolder();
        a2.holderId = 102;
        a2.name = "Sita";
        a2.accountType = "Current";
        a2.hasDebitCard = true;

        b2.accountHolder = a2;


        
        Bank b3 = new Bank();
        b3.bankId = 3;
        b3.bankName = "ICICI";
        b3.location = "Chennai";
        b3.isNationalized = false;

        AccountHolder a3 = new AccountHolder();
        a3.holderId = 103;
        a3.name = "Arjun";
        a3.accountType = "Savings";
        a3.hasDebitCard = false;

        b3.accountHolder = a3;


        
        Bank b4 = new Bank();
        b4.bankId = 4;
        b4.bankName = "Axis";
        b4.location = "Hyderabad";
        b4.isNationalized = false;

        AccountHolder a4 = new AccountHolder();
        a4.holderId = 104;
        a4.name = "Meena";
        a4.accountType = "Current";
        a4.hasDebitCard = true;

        b4.accountHolder = a4;


        
        Bank b5 = new Bank();
        b5.bankId = 5;
        b5.bankName = "Canara";
        b5.location = "Delhi";
        b5.isNationalized = true;

        AccountHolder a5 = new AccountHolder();
        a5.holderId = 105;
        a5.name = "Kiran";
        a5.accountType = "Savings";
        a5.hasDebitCard = true;

        b5.accountHolder = a5;


       
        Bank b6 = new Bank();
        b6.bankId = 6;
        b6.bankName = "Union Bank";
        b6.location = "Mumbai";
        b6.isNationalized = true;

        AccountHolder a6 = new AccountHolder();
        a6.holderId = 106;
        a6.name = "Divya";
        a6.accountType = "Current";
        a6.hasDebitCard = false;

        b6.accountHolder = a6;


        
        Bank b7 = new Bank();
        b7.bankId = 7;
        b7.bankName = "Kotak";
        b7.location = "Pune";
        b7.isNationalized = false;

        AccountHolder a7 = new AccountHolder();
        a7.holderId = 107;
        a7.name = "Rahul";
        a7.accountType = "Savings";
        a7.hasDebitCard = true;

        b7.accountHolder = a7;


        
        Bank b8 = new Bank();
        b8.bankId = 8;
        b8.bankName = "Indian Bank";
        b8.location = "Coimbatore";
        b8.isNationalized = true;

        AccountHolder a8 = new AccountHolder();
        a8.holderId = 108;
        a8.name = "Lakshmi";
        a8.accountType = "Savings";
        a8.hasDebitCard = false;

        b8.accountHolder = a8;


        
        Bank b9 = new Bank();
        b9.bankId = 9;
        b9.bankName = "Yes Bank";
        b9.location = "Noida";
        b9.isNationalized = false;

        AccountHolder a9 = new AccountHolder();
        a9.holderId = 109;
        a9.name = "Vikas";
        a9.accountType = "Current";
        a9.hasDebitCard = true;

        b9.accountHolder = a9;


        
        Bank b10 = new Bank();
        b10.bankId = 10;
        b10.bankName = "PNB";
        b10.location = "Jaipur";
        b10.isNationalized = true;

        AccountHolder a10 = new AccountHolder();
        a10.holderId = 110;
        a10.name = "Anita";
        a10.accountType = "Savings";
        a10.hasDebitCard = true;

        b10.accountHolder = a10;
		
		
		        Bank b11 = new Bank();
        b11.bankId = 11;
        b11.bankName = "IDBI";
        b11.location = "Lucknow";
        b11.isNationalized = true;

        AccountHolder a11 = new AccountHolder();
        a11.holderId = 111;
        a11.name = "Amit";
        a11.accountType = "Savings";
        a11.hasDebitCard = true;

        b11.accountHolder = a11;


        Bank b12 = new Bank();
        b12.bankId = 12;
        b12.bankName = "UCO";
        b12.location = "Kolkata";
        b12.isNationalized = true;

        AccountHolder a12 = new AccountHolder();
        a12.holderId = 112;
        a12.name = "Neha";
        a12.accountType = "Current";
        a12.hasDebitCard = false;

        b12.accountHolder = a12;


        Bank b13 = new Bank();
        b13.bankId = 13;
        b13.bankName = "Bandhan";
        b13.location = "Patna";
        b13.isNationalized = false;

        AccountHolder a13 = new AccountHolder();
        a13.holderId = 113;
        a13.name = "Rohit";
        a13.accountType = "Savings";
        a13.hasDebitCard = true;

        b13.accountHolder = a13;


        Bank b14 = new Bank();
        b14.bankId = 14;
        b14.bankName = "RBL";
        b14.location = "Indore";
        b14.isNationalized = false;

        AccountHolder a14 = new AccountHolder();
        a14.holderId = 114;
        a14.name = "Pooja";
        a14.accountType = "Current";
        a14.hasDebitCard = true;

        b14.accountHolder = a14;


        Bank b15 = new Bank();
        b15.bankId = 15;
        b15.bankName = "Federal";
        b15.location = "Kochi";
        b15.isNationalized = false;

        AccountHolder a15 = new AccountHolder();
        a15.holderId = 115;
        a15.name = "Karthik";
        a15.accountType = "Savings";
        a15.hasDebitCard = true;

        b15.accountHolder = a15;


        Bank b16 = new Bank();
        b16.bankId = 16;
        b16.bankName = "South Indian";
        b16.location = "Thrissur";
        b16.isNationalized = false;

        AccountHolder a16 = new AccountHolder();
        a16.holderId = 116;
        a16.name = "Sneha";
        a16.accountType = "Current";
        a16.hasDebitCard = false;

        b16.accountHolder = a16;


        Bank b17 = new Bank();
        b17.bankId = 17;
        b17.bankName = "Karnataka Bank";
        b17.location = "Mangalore";
        b17.isNationalized = false;

        AccountHolder a17 = new AccountHolder();
        a17.holderId = 117;
        a17.name = "Manoj";
        a17.accountType = "Savings";
        a17.hasDebitCard = true;

        b17.accountHolder = a17;


        Bank b18 = new Bank();
        b18.bankId = 18;
        b18.bankName = "Dhanlaxmi";
        b18.location = "Kerala";
        b18.isNationalized = false;

        AccountHolder a18 = new AccountHolder();
        a18.holderId = 118;
        a18.name = "Anu";
        a18.accountType = "Current";
        a18.hasDebitCard = true;

        b18.accountHolder = a18;


        Bank b19 = new Bank();
        b19.bankId = 19;
        b19.bankName = "City Union";
        b19.location = "Tamil Nadu";
        b19.isNationalized = false;

        AccountHolder a19 = new AccountHolder();
        a19.holderId = 119;
        a19.name = "Surya";
        a19.accountType = "Savings";
        a19.hasDebitCard = false;

        b19.accountHolder = a19;


        Bank b20 = new Bank();
        b20.bankId = 20;
        b20.bankName = "Karur Vysya";
        b20.location = "Karur";
        b20.isNationalized = false;

        AccountHolder a20 = new AccountHolder();
        a20.holderId = 120;
        a20.name = "Deepa";
        a20.accountType = "Current";
        a20.hasDebitCard = true;

        b20.accountHolder = a20;


        Bank b21 = new Bank();
        b21.bankId = 21;
        b21.bankName = "Syndicate";
        b21.location = "Manipal";
        b21.isNationalized = true;

        AccountHolder a21 = new AccountHolder();
        a21.holderId = 121;
        a21.name = "Varun";
        a21.accountType = "Savings";
        a21.hasDebitCard = true;

        b21.accountHolder = a21;


        Bank b22 = new Bank();
        b22.bankId = 22;
        b22.bankName = "Allahabad";
        b22.location = "Prayagraj";
        b22.isNationalized = true;

        AccountHolder a22 = new AccountHolder();
        a22.holderId = 122;
        a22.name = "Shreya";
        a22.accountType = "Current";
        a22.hasDebitCard = false;

        b22.accountHolder = a22;


        Bank b23 = new Bank();
        b23.bankId = 23;
        b23.bankName = "Corporation";
        b23.location = "Udupi";
        b23.isNationalized = true;

        AccountHolder a23 = new AccountHolder();
        a23.holderId = 123;
        a23.name = "Girish";
        a23.accountType = "Savings";
        a23.hasDebitCard = true;

        b23.accountHolder = a23;


        Bank b24 = new Bank();
        b24.bankId = 24;
        b24.bankName = "Oriental";
        b24.location = "Gurgaon";
        b24.isNationalized = true;

        AccountHolder a24 = new AccountHolder();
        a24.holderId = 124;
        a24.name = "Nisha";
        a24.accountType = "Current";
        a24.hasDebitCard = true;

        b24.accountHolder = a24;


        Bank b25 = new Bank();
        b25.bankId = 25;
        b25.bankName = "HSBC";
        b25.location = "Mumbai";
        b25.isNationalized = false;

        AccountHolder a25 = new AccountHolder();
        a25.holderId = 125;
        a25.name = "Rahul";
        a25.accountType = "Savings";
        a25.hasDebitCard = true;

        b25.accountHolder = a25;


        Bank b26 = new Bank();
        b26.bankId = 26;
        b26.bankName = "Standard Chartered";
        b26.location = "Delhi";
        b26.isNationalized = false;

        AccountHolder a26 = new AccountHolder();
        a26.holderId = 126;
        a26.name = "Priya";
        a26.accountType = "Current";
        a26.hasDebitCard = false;

        b26.accountHolder = a26;


        Bank b27 = new Bank();
        b27.bankId = 27;
        b27.bankName = "Deutsche";
        b27.location = "Bangalore";
        b27.isNationalized = false;

        AccountHolder a27 = new AccountHolder();
        a27.holderId = 127;
        a27.name = "Arun";
        a27.accountType = "Savings";
        a27.hasDebitCard = true;

        b27.accountHolder = a27;


        Bank b28 = new Bank();
        b28.bankId = 28;
        b28.bankName = "Citi";
        b28.location = "Chennai";
        b28.isNationalized = false;

        AccountHolder a28 = new AccountHolder();
        a28.holderId = 128;
        a28.name = "Divya";
        a28.accountType = "Current";
        a28.hasDebitCard = true;

        b28.accountHolder = a28;


        Bank b29 = new Bank();
        b29.bankId = 29;
        b29.bankName = "DBS";
        b29.location = "Hyderabad";
        b29.isNationalized = false;

        AccountHolder a29 = new AccountHolder();
        a29.holderId = 129;
        a29.name = "Kiran";
        a29.accountType = "Savings";
        a29.hasDebitCard = false;

        b29.accountHolder = a29;

		b1.getBankDetails();
        b2.getBankDetails();
        b3.getBankDetails();
        b4.getBankDetails();
        b5.getBankDetails();
        b6.getBankDetails();
        b7.getBankDetails();
        b8.getBankDetails();
        b9.getBankDetails();
        b10.getBankDetails();
        b11.getBankDetails();
        b12.getBankDetails();
        b13.getBankDetails();
        b14.getBankDetails();
        b15.getBankDetails();
        b16.getBankDetails();
        b17.getBankDetails();
        b18.getBankDetails();
        b19.getBankDetails();
        b20.getBankDetails();
        b21.getBankDetails();
        b22.getBankDetails();
        b23.getBankDetails();
        b24.getBankDetails();
        b25.getBankDetails();
        b26.getBankDetails();
        b27.getBankDetails();
        b28.getBankDetails();
        b29.getBankDetails();
  
    }
}