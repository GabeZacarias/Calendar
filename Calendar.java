import java.util.Scanner;

/**
 * 
 */

/**
 * @author Gabriel Zacarias
 *
 */
public class Calendar 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int month = 0;
		int year = 0;
		int day = 0;
		int count;
		
		String month_name = "";
		
		boolean done = false;
		boolean month_valid = false;
		boolean year_valid = true;
		boolean day_in_week_valid = true;
		
		Scanner input = new Scanner(System.in);
		
				
		while (done == false)
		{
			if (month_valid == false)
			{
				System.out.print("Enter Month number: ");
				month = input.nextInt();
				
				if (month < 1 || month > 12)
				{
					System.out.print("Month must be between 1-12\n");
					month_valid = false;
				}
					
				else
				{	
					month_valid = true;
					year_valid = false;
					
					switch (month)
					{
						case 1:
							month_name = "JANUARY";
							break;
						case 2:
							month_name = "FEBRUARY";
							break;
						case 3:
							month_name = "MARCH";
							break;
						case 4:
							month_name = "APRIL";
							break;
						case 5:
							month_name = "MAY";
							break;
						case 6:
							month_name = "JUNE";
							break;
						case 7:
							month_name = "JULY";
							break;
						case 8:
							month_name = "AUGUST";
							break;
						case 9:
							month_name = "SEPTEMBER";
							break;
						case 10:
							month_name = "OCTOBER";
							break;
						case 11:
							month_name = "NOVEMBER";
							break;
						case 12:
							month_name = "DECEMBER";
							break;
					}
				}
			}
			
			if (year_valid == false)
			{
				System.out.print("Enter Year: ");
				year = input.nextInt();
				
				if (year < 1800 || year > 2200)
				{
					System.out.print("Year must be between 1800-2200\n");
					year_valid = false;
				}
				
				else
				{
					year_valid = true;
					day_in_week_valid = false;
				}
			}
			
			if (day_in_week_valid == false)
			{
				System.out.print("Enter starting day of month (0 = Sunday, 1 = Monday, etc.): ");
				day = input.nextInt();
				
				if (day < 0 || day > 6)
				{
					System.out.print("Day of week must be between 0-6\n");
					day_in_week_valid = false;
				}
				
				else
				{
					day_in_week_valid = true;
				}
			}
			
			if (month_valid == true && year_valid == true && day_in_week_valid == true)
			{
				System.out.println("\n\t\t" + "  " + month_name + " " + year);
				System.out.println("S\tM\tT\tW\tT\tF\tS");
				
				for (int index = 0; index < day; index++)
					System.out.print("\t");
				
				int monthDays;
				count = day;
				
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					monthDays = 31;

				else if (year % 4 == 0 && month == 2)
					monthDays = 29;
				
				else if (month == 2 && year % 4 != 0)
					monthDays = 28;
				
				else
					monthDays = 30;
				
				for (int index = 1; index <= monthDays; index++)
				{
					if (count < 7)
					{
						count++;
						System.out.print(index + "\t");
					}
					
					else
					{
						count = 1;
						System.out.println();
						System.out.print(index + "\t");
					}
				}
				
				done = true;
			}
		}	
		
		
		
		
		
		
	}
}	
