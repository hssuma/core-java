class RainExec
{
    public static void main(String[] a) {

        Rain r1 = new Rain(1,"Light",10.5,"Monsoon",false);
		r1.display();
        Rain r2 = new Rain(2,"Heavy",20.0,"Winter",true);
		r2.display();
        Rain r3 = new Rain(3,"Moderate",15.0,"Summer",false);
		r3.display();
        Rain r4 = new Rain(4,"Drizzle",5.0,"Spring",false);
		r4.display();
        Rain r5 = new Rain(5,"Storm",25.0,"Monsoon",true);
		r5.display();
        Rain r6 = new Rain(6,"Light",8.0,"Winter",false);
		r6.display();
    }
}