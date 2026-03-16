class Numbers
{
	public static void main(String args[])
	{
		int num[]={90,78,767,78,2,4 ,3 ,42,5};
		//if(num[] %2==0)
			//System.out.println(num);
		//else
		//	System.out.println(num);
		for(int n=0; n<num.length; n++)
		{
			if(num[n]%2==0)
			{
				System.out.println("even numbers are\n");
				System.out.println(num[n]);
			}
			else
			{
				System.out.println("odd numbers are:\n");
				System.out.println(num[n]);
			}
		}
	}
}