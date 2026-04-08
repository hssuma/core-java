class RTOExec
{
	public static void main(String args[])
	{
		RTO r = new RTO();
		DrivingLicenseInfo d = new DrivingLicenseInfo();
		d.id = 1;
		d.name = "Suma";
		d.address = "Yaragnal Nyamathi Tq Shivamogga Dist";
		d.bloodGroup = "A+ve";
		boolean added = r.addLicenseInfo(d);
		System.out.println(added);
		
		DrivingLicenseInfo d2 = new DrivingLicenseInfo();
		d2.id = 2;
		d2.name = "Monika";
		d.address = "Yaragnal Nyamathi Tq Shivamogga Dist";
		d2.bloodGroup = "O-ve";
		added = r.addLicenseInfo(d2);
		System.out.println(added);
		
		DrivingLicenseInfo d3 = new DrivingLicenseInfo();
		d3.id = 3;
		d3.name = "Chaithra";
		d3.address = "Yaragnal Nyamathi Tq Shivamogga Dist";
		d3.bloodGroup = "A+ve";
		added = r.addLicenseInfo(d3);
		System.out.println(added);
		DrivingLicenseInfo d4 = new DrivingLicenseInfo();
		d4.id = 4;
		d4.name = "Sandeep";
		d4.address = "Yaragnal";
		d4.bloodGroup = "A+ve";
		added = r.addLicenseInfo(d4);
		System.out.println(added);
		DrivingLicenseInfo d5 = new DrivingLicenseInfo();
		d5.id = 5;
		d5.name = "Ganesh H Y";
		d5.address = "Bengaluru";
		d5.bloodGroup = "A-ve";
		added = r.addLicenseInfo(d5);
		System.out.println(added);
		DrivingLicenseInfo d6 = new DrivingLicenseInfo();
		d6.id = 6;
		d6.name = "Darshan";
		d6.address = "Yaragnal Nyamathi tq davanagere dist";
		d6.bloodGroup = "A-ve";
		added = r.addLicenseInfo(d6);
		System.out.println(added);
		
		
		DrivingLicenseInfo d7 = new DrivingLicenseInfo();
		d7.id = 7;
		d7.name = "Shravani";
		d7.address = "Davanagere";
		d7.bloodGroup = "A+ve";
		added = r.addLicenseInfo(d7);
		System.out.println(added);
		
		DrivingLicenseInfo d8 = new DrivingLicenseInfo();
		d8.id = 8;
		d8.name = "Poojitha";
		d8.address = "Davanagere";
		d8.bloodGroup = "A-ve";
		added = r.addLicenseInfo(d8);
		System.out.println(added);
		
		DrivingLicenseInfo d9 = new DrivingLicenseInfo();
		d9.id = 9;
		d9.name = "Pragnya";
		d9.address = "Belagavi";
		d9.bloodGroup = "A-ve";
		added = r.addLicenseInfo(d9);
		System.out.println(added);
		
		DrivingLicenseInfo d10 = new DrivingLicenseInfo();
		d10.id = 10;
		d10.name = "Mamatha";
		d10.address = "Gadag";
		d10.bloodGroup = "A-ve";
		added = r.addLicenseInfo(d10);
		System.out.println(added);
		
		r.getDLI();
	}
}
