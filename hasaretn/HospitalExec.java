class HospitalExec
{
	public static void main(String args[])
	{
		int index=0;
		Hospital h = new Hospital();
		
		Doctor d = new Doctor();
		h.doctors[index++] = d;
		d.doctorId = 1;
		d.doctorName = "Preethi";
		d.specialization = "Gynacologiest";
		
		
		Doctor dTwo = new Doctor();
		h.doctors[index++] = dTwo;
		dTwo.doctorId = 2;
		dTwo.doctorName = "Jyothi";
		dTwo.specialization = "Dentist";
		
		Doctor dThree = new Doctor();
		h.doctors[index++] = dThree;
		dThree.doctorId = 3;
		dThree.doctorName = "Prassanna";
		dThree.specialization = "cardiologist";
		
		
		Doctor dFour = new Doctor();
		h.doctors[index++] = dFour;
		dFour.doctorId = 4;
		dFour.doctorName = "Sandeep";
		dFour.specialization = "Diabitics";
		
		
		Doctor dFive = new Doctor();
		h.doctors[index++] = dFive;
		dFive.doctorId = 5;
		dFive.doctorName = "Ganesh";
		dFive.specialization = "cardiologist";
		
		h.getInfo();
	}
}
