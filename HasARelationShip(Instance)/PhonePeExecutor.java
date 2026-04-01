class PhonePeExecutor {
    public static void main(String[] args) {

        
        PhonePe p1 = new PhonePe();
        p1.phonePeId = 1;
        p1.userName = "Suma";
        p1.balance = 5000;
        p1.isKYCVerified = true;

        History h1 = new History();
        h1.transactionId = 201;
        h1.type = "Recharge";
        h1.amount = 299;
        h1.isSuccess = true;

        p1.history = h1;
 
        PhonePe p2 = new PhonePe();
        p2.phonePeId = 2;
        p2.userName = "Ravi";
        p2.balance = 3000;
        p2.isKYCVerified = true;

        History h2 = new History();
        h2.transactionId = 202;
        h2.type = "Bill Payment";
        h2.amount = 500;
        h2.isSuccess = true;

        p2.history = h2;

        PhonePe p3 = new PhonePe();
        p3.phonePeId = 3;
        p3.userName = "Sita";
        p3.balance = 4500;
        p3.isKYCVerified = false;

        History h3 = new History();
        h3.transactionId = 203;
        h3.type = "Transfer";
        h3.amount = 1000;
        h3.isSuccess = true;

        p3.history = h3;

        PhonePe p4 = new PhonePe();
        p4.phonePeId = 4;
        p4.userName = "Arjun";
        p4.balance = 6000;
        p4.isKYCVerified = true;

        History h4 = new History();
        h4.transactionId = 204;
        h4.type = "Recharge";
        h4.amount = 199;
        h4.isSuccess = false;

        p4.history = h4;


        
        PhonePe p5 = new PhonePe();
        p5.phonePeId = 5;
        p5.userName = "Meena";
        p5.balance = 7000;
        p5.isKYCVerified = true;

        History h5 = new History();
        h5.transactionId = 205;
        h5.type = "Shopping";
        h5.amount = 1500;
        h5.isSuccess = true;

        p5.history = h5;

        PhonePe p6 = new PhonePe();
        p6.phonePeId = 6;
        p6.userName = "Kiran";
        p6.balance = 2500;
        p6.isKYCVerified = false;

        History h6 = new History();
        h6.transactionId = 206;
        h6.type = "Transfer";
        h6.amount = 700;
        h6.isSuccess = true;

        p6.history = h6;

        PhonePe p7 = new PhonePe();
        p7.phonePeId = 7;
        p7.userName = "Divya";
        p7.balance = 8000;
        p7.isKYCVerified = true;

        History h7 = new History();
        h7.transactionId = 207;
        h7.type = "Recharge";
        h7.amount = 399;
        h7.isSuccess = true;

        p7.history = h7;

        PhonePe p8 = new PhonePe();
        p8.phonePeId = 8;
        p8.userName = "Rahul";
        p8.balance = 3500;
        p8.isKYCVerified = true;

        History h8 = new History();
        h8.transactionId = 208;
        h8.type = "Bill Payment";
        h8.amount = 1200;
        h8.isSuccess = false;

        p8.history = h8;


        
        PhonePe p9 = new PhonePe();
        p9.phonePeId = 9;
        p9.userName = "Lakshmi";
        p9.balance = 9000;
        p9.isKYCVerified = true;

        History h9 = new History();
        h9.transactionId = 209;
        h9.type = "Shopping";
        h9.amount = 2000;
        h9.isSuccess = true;

        p9.history = h9;


        
        PhonePe p10 = new PhonePe();
        p10.phonePeId = 10;
        p10.userName = "Vikas";
        p10.balance = 4000;
        p10.isKYCVerified = false;

        History h10 = new History();
        h10.transactionId = 210;
        h10.type = "Transfer";
        h10.amount = 800;
        h10.isSuccess = true;

        p10.history = h10;


        
        PhonePe p11 = new PhonePe();
        p11.phonePeId = 11;
        p11.userName = "Anita";
        p11.balance = 5500;
        p11.isKYCVerified = true;

        History h11 = new History();
        h11.transactionId = 211;
        h11.type = "Recharge";
        h11.amount = 249;
        h11.isSuccess = true;

        p11.history = h11;


        
        PhonePe p12 = new PhonePe();
        p12.phonePeId = 12;
        p12.userName = "Manoj";
        p12.balance = 6200;
        p12.isKYCVerified = true;

        History h12 = new History();
        h12.transactionId = 212;
        h12.type = "Shopping";
        h12.amount = 1800;
        h12.isSuccess = false;

        p12.history = h12;


        
        PhonePe p13 = new PhonePe();
        p13.phonePeId = 13;
        p13.userName = "Sneha";
        p13.balance = 7100;
        p13.isKYCVerified = true;

        History h13 = new History();
        h13.transactionId = 213;
        h13.type = "Bill Payment";
        h13.amount = 900;
        h13.isSuccess = true;

        p13.history = h13;


        
        PhonePe p14 = new PhonePe();
        p14.phonePeId = 14;
        p14.userName = "Ramesh";
        p14.balance = 4800;
        p14.isKYCVerified = false;

        History h14 = new History();
        h14.transactionId = 214;
        h14.type = "Recharge";
        h14.amount = 149;
        h14.isSuccess = true;

        p14.history = h14;


        
        PhonePe p15 = new PhonePe();
        p15.phonePeId = 15;
        p15.userName = "Pooja";
        p15.balance = 8300;
        p15.isKYCVerified = true;

        History h15 = new History();
        h15.transactionId = 215;
        h15.type = "Transfer";
        h15.amount = 2200;
        h15.isSuccess = true;

        p15.history = h15;
		        PhonePe p16 = new PhonePe();
        p16.phonePeId = 16;
        p16.userName = "Karthik";
        p16.balance = 5200;
        p16.isKYCVerified = true;

        History h16 = new History();
        h16.transactionId = 216;
        h16.type = "Recharge";
        h16.amount = 199;
        h16.isSuccess = true;

        p16.history = h16;


        PhonePe p17 = new PhonePe();
        p17.phonePeId = 17;
        p17.userName = "Asha";
        p17.balance = 6400;
        p17.isKYCVerified = false;

        History h17 = new History();
        h17.transactionId = 217;
        h17.type = "Bill Payment";
        h17.amount = 1100;
        h17.isSuccess = true;

        p17.history = h17;


        PhonePe p18 = new PhonePe();
        p18.phonePeId = 18;
        p18.userName = "Surya";
        p18.balance = 7700;
        p18.isKYCVerified = true;

        History h18 = new History();
        h18.transactionId = 218;
        h18.type = "Shopping";
        h18.amount = 2500;
        h18.isSuccess = false;

        p18.history = h18;


        PhonePe p19 = new PhonePe();
        p19.phonePeId = 19;
        p19.userName = "Deepa";
        p19.balance = 3900;
        p19.isKYCVerified = true;

        History h19 = new History();
        h19.transactionId = 219;
        h19.type = "Transfer";
        h19.amount = 600;
        h19.isSuccess = true;

        p19.history = h19;


        PhonePe p20 = new PhonePe();
        p20.phonePeId = 20;
        p20.userName = "Varun";
        p20.balance = 8800;
        p20.isKYCVerified = true;

        History h20 = new History();
        h20.transactionId = 220;
        h20.type = "Recharge";
        h20.amount = 349;
        h20.isSuccess = true;

        p20.history = h20;


        PhonePe p21 = new PhonePe();
        p21.phonePeId = 21;
        p21.userName = "Nisha";
        p21.balance = 4600;
        p21.isKYCVerified = false;

        History h21 = new History();
        h21.transactionId = 221;
        h21.type = "Bill Payment";
        h21.amount = 1300;
        h21.isSuccess = false;

        p21.history = h21;


        PhonePe p22 = new PhonePe();
        p22.phonePeId = 22;
        p22.userName = "Girish";
        p22.balance = 7100;
        p22.isKYCVerified = true;

        History h22 = new History();
        h22.transactionId = 222;
        h22.type = "Shopping";
        h22.amount = 1700;
        h22.isSuccess = true;

        p22.history = h22;


        PhonePe p23 = new PhonePe();
        p23.phonePeId = 23;
        p23.userName = "Priya";
        p23.balance = 5800;
        p23.isKYCVerified = true;

        History h23 = new History();
        h23.transactionId = 223;
        h23.type = "Transfer";
        h23.amount = 900;
        h23.isSuccess = true;

        p23.history = h23;


        PhonePe p24 = new PhonePe();
        p24.phonePeId = 24;
        p24.userName = "Arun";
        p24.balance = 6200;
        p24.isKYCVerified = false;

        History h24 = new History();
        h24.transactionId = 224;
        h24.type = "Recharge";
        h24.amount = 299;
        h24.isSuccess = true;

        p24.history = h24;


        PhonePe p25 = new PhonePe();
        p25.phonePeId = 25;
        p25.userName = "Shreya";
        p25.balance = 9300;
        p25.isKYCVerified = true;

        History h25 = new History();
        h25.transactionId = 225;
        h25.type = "Shopping";
        h25.amount = 3000;
        h25.isSuccess = true;

        p25.history = h25;


        PhonePe p26 = new PhonePe();
        p26.phonePeId = 26;
        p26.userName = "Rahul";
        p26.balance = 4100;
        p26.isKYCVerified = true;

        History h26 = new History();
        h26.transactionId = 226;
        h26.type = "Bill Payment";
        h26.amount = 700;
        h26.isSuccess = false;

        p26.history = h26;


        PhonePe p27 = new PhonePe();
        p27.phonePeId = 27;
        p27.userName = "Divya";
        p27.balance = 7600;
        p27.isKYCVerified = true;

        History h27 = new History();
        h27.transactionId = 227;
        h27.type = "Transfer";
        h27.amount = 1200;
        h27.isSuccess = true;

        p27.history = h27;


        PhonePe p28 = new PhonePe();
        p28.phonePeId = 28;
        p28.userName = "Kiran";
        p28.balance = 5400;
        p28.isKYCVerified = false;

        History h28 = new History();
        h28.transactionId = 228;
        h28.type = "Recharge";
        h28.amount = 159;
        h28.isSuccess = true;

        p28.history = h28;


        PhonePe p29 = new PhonePe();
        p29.phonePeId = 29;
        p29.userName = "Anu";
        p29.balance = 8700;
        p29.isKYCVerified = true;

        History h29 = new History();
        h29.transactionId = 229;
        h29.type = "Shopping";
        h29.amount = 2100;
        h29.isSuccess = true;

        p29.history = h29;

		p1.getPhonePeDetails();
        p2.getPhonePeDetails();
        p3.getPhonePeDetails();
        p4.getPhonePeDetails();
        p5.getPhonePeDetails();
        p6.getPhonePeDetails();
        p7.getPhonePeDetails();
        p8.getPhonePeDetails();
        p9.getPhonePeDetails();
        p10.getPhonePeDetails();
        p11.getPhonePeDetails();
        p12.getPhonePeDetails();
        p13.getPhonePeDetails();
        p14.getPhonePeDetails();
        p15.getPhonePeDetails();
        p16.getPhonePeDetails();
        p17.getPhonePeDetails();
        p18.getPhonePeDetails();
        p19.getPhonePeDetails();
        p20.getPhonePeDetails();
        p21.getPhonePeDetails();
        p22.getPhonePeDetails();
        p23.getPhonePeDetails();
        p24.getPhonePeDetails();
        p25.getPhonePeDetails();
        p26.getPhonePeDetails();
        p27.getPhonePeDetails();
        p28.getPhonePeDetails();
        p29.getPhonePeDetails();

    }
}