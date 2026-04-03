class OlympicExec
{
	public static void main(String[] args)
	{
		Olympic o = new Olympic();
		o.addSportNames("Hockey");
		o.addSportNames("Athletics");
		o.addSportNames("Swimming");
		o.addSportNames("Football");
		o.addSportNames("Gymnastics");
		o.addSportNames("Cycling");
		o.addSportNames("Ice hokey");
		o.addSportNames("Skating");
		o.addSportNames("Skiing");
		o.addSportNames("Tokyo 2020");
		o.addSportNames("Rio 2016 ");
		
		
		o.getDetails();
	}
}