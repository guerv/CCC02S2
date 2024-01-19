import java.util.Scanner;
import java.util.ArrayList;


public class FractionAction {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int denom = scan.nextInt();

		int mixed= 0, gcf = 0, cgcf = 0;
		ArrayList<Integer> numfactors = new ArrayList<Integer>();
		ArrayList<Integer> denomfactors = new ArrayList<Integer>();

		//int numcounter = 0, denomcounter = 0; 


		if (num%denom == 0)
		{
			System.out.println(num/denom);
		}
		else
		{
			//finding whole number
			while (num - denom >= 0)
			{
				mixed++;
				num = num -denom; 
			}


			if (denom%num == 0)
			{
				//System.out.println("ASGDYUSGU");
				denom = denom/num;
				num = num/num;
			}
			else
			{

				//finding gcf (process of simplifying)
			//	System.out.println("asdhbD");

				//finding factors for numerator
				for (int i = 2; i <= num/2; i++)
				{
					if (num%i == 0)
					{
						numfactors.add(i);

					//	System.out.println(i);
						//System.out.println(numcounter);ASGDGASHDGAHSGDJHGSDJAHGSDHAFSDHGFSHADGFJHASGDFJHAGS
						//numcounter++; 
					}
				}
				
				//System.out.println();

				//finding factors for denominator 
				for (int i = 2; i <= denom/2; i++)
				{
					if (denom%i ==0 )
					{
						denomfactors.add(i);
						//System.out.println(i);

						//denomcounter++; 
					}
				}

				//finding gcf between both 
				if (numfactors.size() >= denomfactors.size())
				{
					for (int i = (denomfactors.size()-1); i > -1; i--)
					{

						cgcf = denomfactors.get(i);

						for (int j = i; j > -1; j--)
						{
							if (cgcf == numfactors.get(j))
							{
								gcf = numfactors.get(j);
								break; 
							}
						}

						if (gcf != 0)
						{
							break;
						}
					}
				}
				else 
				{
					for (int i = (numfactors.size()-1); i > -1; i--)
					{

						cgcf = numfactors.get(i);

						for (int j = (denomfactors.size()-1); j > -1; j--)
						{
							
							//System.out.println(cgcf);
							if (cgcf == denomfactors.get(j))
							{
								//System.out.println("FEe");

								gcf = denomfactors.get(j);
								break; 
							}
						}

						if (gcf != 0)
						{
							break;
						}
					}
				}
			}

			//setting num and demon
			if (gcf != 0)
			{

				denom = denom/gcf;

				num = num/gcf;
			}


			//printing fraction
			if(mixed >0)
			{
				System.out.println(mixed + " " + num + "/" + denom);
			}
			else
			{
				System.out.println(num + "/" + denom);
			}
		}


		scan.close();

	}

}
