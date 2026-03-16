class Hospital
{
	static void bookAppointment(String name, String symptom)
	{
		System.out.println("bookAppointment method from hospital class has started execution");
		System.out.println("booiking the appointment");
		System.out.println("bookAppointment method is endded");
		Nurse.basicCheckup("suma", "cold", false, false);
	}
}