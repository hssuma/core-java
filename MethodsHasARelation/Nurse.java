class Nurse
{
	static void basicCheckup(String name, String symptom, boolean isbp, boolean issugar)
	{
		System.out.println("basicCheckup method is executing from nurse class");
		System.out.println("NUrse is doing basic checkup");
		System.out.println("basicCheckup method is ended");
		Doctor.treat();
	}
}