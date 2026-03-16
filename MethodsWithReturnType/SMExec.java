class SuperMartExec
{
	public static void main(String []ref)
	{
		String bis[] = SM.searchBrandByProduct("biscuit");
		for(String biscuits : bis)
		{
			System.out.println(biscuits);
		}
		System.out.println();
		String shampoos[] = SM.searchBrandByProduct("shampoo");
		for(String shamp : shampoos)
		{
			System.out.println(shamp);
		}
		System.out.println();
		String soaps[] = SM.searchBrandByProduct("soap");
		for(String soapp : soaps)
		{
			System.out.println(soapp);
		}
		System.out.println();
		String rices[] = SM.searchBrandByProduct("rice");
		for(String ricee : rices)
		{
			System.out.println(ricee);
		}
		System.out.println();
		String milks[] = SM.searchBrandByProduct("milk");
		for(String mil : milks)
		{
			System.out.println(mil);
		}
		
		System.out.println();
		String oils[] = SM.searchBrandByProduct("oil");
		for(String cookingoil : oils)
		{
			System.out.println(cookingoil);
		}
		
	}
}