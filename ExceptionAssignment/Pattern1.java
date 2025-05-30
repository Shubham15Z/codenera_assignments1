class Pattern1
{
	void printPattern()
	{
		int n = 4;
		int num = 4;

		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++)
			{
				if(j == 1 || j == i)
				{
					System.out.print((char)('A'+j-1) + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Pattern1 p1 = new Pattern1();
		p1.printPattern();
	}
}