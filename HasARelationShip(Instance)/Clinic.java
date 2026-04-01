class Clinic
{
	int clinicID;
	String clinicName ;
	String address;
	
	Doctor doctor;
	
	
	void getDetails()
	{
		System.out.println("The clinic id is "+clinicID);
		System.out.println("The clinic name is "+clinicName);
		System.out.println("The clinic address is "+address);

		doctor.getDoctorDetails();
	}
	
}