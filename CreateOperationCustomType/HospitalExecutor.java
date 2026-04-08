class HospitalExecutor
{
	public static void main(String[] h)
	{
		String sumaSpecializations[] = {"Gynacologist", "dermatologist"};
		String sandySpecializations[] = {"general medicine", "Urologist"};
		String jamesSpecializations[] = {"surgeon", "neurologist"};
		
		Hospital hospital = new Hospital();
		
		Doctor doctor = new Doctor();
		doctor.docId = 1;
		doctor.docName = "Suma";
		doctor.designation = "chairman";
		doctor.experience = "4 years";
		doctor.fees = 1200;
		doctor.specializations = sumaSpecializations;
		
		boolean added = hospital.createDoctor(doctor);
		System.out.println(added);
		
		Doctor doctorOne = new Doctor();
		doctorOne.docId = 2;
		doctorOne.docName = "Sandeep";
		doctorOne.designation = "manager";
		doctorOne.experience = "5 years";
		doctorOne.fees = 1500;
		doctorOne.specializations = sandySpecializations;
		
		boolean addedOne = hospital.createDoctor(doctorOne);
		System.out.println(addedOne);
		
		Doctor doctorTwo = new Doctor();
		doctorTwo.docId = 3;
		doctorTwo.docName = "varsha";
		doctorTwo.designation = "director";
		doctorTwo.experience = "3 years";
		doctorTwo.fees = 1100;
		doctorTwo.specializations = jamesSpecializations;
		
		boolean addedTwo = hospital.createDoctor(doctorTwo);
		System.out.println(addedTwo);
		
		hospital.getDoctors();
		
	}
}