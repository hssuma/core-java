class Hospital
{
	Doctor doctors[] = new Doctor[5];
	int index=0;
	
	void addDoctor(Doctor doc)
	{
		doctors[index++] = doc;
	}
	void getInfo()
	{
		for(Doctor doctor : doctors)
		{
			doctors[index++].getDoctorInfo();
		}
	}
}