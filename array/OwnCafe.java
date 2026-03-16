class OwnCafe
{
	public static void main(String args[])
	{
		String cafeName = "tea";
		String teaNames[] = {"Amrut tea ", "Ginger tea ", "Lemon tea ","Black tea", "Elachi tea", "masala chai"};
		String coffeNames[] = {"black coffee ", " Cappuccino", "Iced Coffees", "cold coffee", "Espresso", "Latte", "mocha", "mocha breve", "Americano","Cortado", " Flat White"};
		String snackNames[]  = {"burger","sandwich","Samosa","Spiced Nuts","Garlic Bread Toast", "pav bhaji","masala bun","french fries","pizza"," roasted nuts"};
		System.out.println("cafe name is "+cafeName);
		System.out.println("available teas are");
		System.out.println(teaNames[0]+"\n"+ teaNames[1]+"\n"+teaNames[2]+"\n"+teaNames[3]+"\n"+teaNames[4]+"\n"+teaNames[5]+"\n"+"\n");
		System.out.println("Available coffees are");
		System.out.println("List of Coffe Names are:");
		System.out.println(coffeNames[0]+ "\n" + coffeNames[1]+ "\n" + coffeNames[2]+ "\n" + coffeNames[3]+ "\n" + coffeNames[4]+ "\n" + coffeNames[5]+ "\n" + coffeNames[6]+ "\n" +coffeNames[7]+ "\n" + coffeNames[8]+ "\n" + coffeNames[9]+ "\n" + coffeNames[10]+"\n");
		
		System.out.println("List of Snacks Names are:");
    System.out.println(snackNames[0]+ "\n" + snackNames[1]+ "\n" + snackNames[2]+ "\n" + snackNames[3]+ "\n" + snackNames[4]+ "\n" + snackNames[5]+ "\n" + snackNames[6]+ "\n" + 
                       snackNames[7]+ "\n" + snackNames[8]+ "\n" + snackNames[9]);
	}
}