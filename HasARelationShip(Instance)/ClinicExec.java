class ClinicExec
{
	public static void main(String args[])
	{
		Clinic clinic = new Clinic();
		clinic.clinicID = 1;
		clinic.clinicName = "Prashanth clinic";
		clinic.address = "Prashanth clinic opposite to Govt. girl's high school Nyamathi";
		
		
		Doctor doctor = new Doctor();
		clinic.doctor = doctor;
		
		doctor.doctorId = 12;
		doctor.doctorName = "Jyothi";
		doctor.experience = "8 years";
		
		clinic.getDetails();
	}
}