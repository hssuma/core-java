class MedicalShopExec
{
    public static void main(String[] args)
    {
        MedicalShop m = new MedicalShop();

        m.addMedicine("Paracetamol");
        m.addMedicine("Crocin");
        m.addMedicine("Dolo");
        m.addMedicine("Aspirin");
        m.addMedicine("Ibuprofen");
        m.addMedicine("Amoxicillin");
        m.addMedicine("Cetirizine");
        m.addMedicine("ORS");
        m.addMedicine("Vitamin C");
        m.addMedicine("Insulin");
        m.getMedicines();
		m.updateMedicine("Dolo", "Dolo650");
		m.getMedicines();
		m.deleteMedicine("Paracetamol");
		m.getMedicines();
    }
}