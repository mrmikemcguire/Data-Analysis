import java.util.ArrayList;

public class Analyzer
	{
	private static int qqqCount = 0;
	private static int gCodeCounter = 0;
	private static int length6Count = 0;
	
	public static void main(String[] args)
		{
		Data.addData();
		countRecords();
		findQQQs();
		countLettercodesStartingWithG();
		countLength6Lettercodes();
		}
	
		public static void countRecords()
			{
			System.out.println("There are " + Data.data.size() + " records in the database.");
			}	
		
		public static void findQQQs()
			{
			for (Record r : Data.data)
				{
				if (r.getLetterCode().contains("qqq"))
					{
					qqqCount++;
					}
				}
			System.out.println("There are " + qqqCount + " occurances of \"qqq\" in the data.");
			}
		
		public static void countLength6Lettercodes()
			{
			for (int i = 0; i < Data.data.size(); i++)
				{
				if (Data.data.get(i).getLetterCode().length() == 6)
					length6Count++;
				}
			System.out.println("There are " + length6Count + " lettercodes of length six.");
			}
		
		public static void countLettercodesStartingWithG()
			{
			for (Record r : Data.data)
				{
				if (r.getLetterCode().substring(0,1).equals("g"))
					gCodeCounter++;
				}
			double gStartPercentage = (double) gCodeCounter / (double) Data.data.size() * 100;
			System.out.println("There are " + gCodeCounter +
					" records beginning with the letter \"g\".");
			System.out.println("That is " + gStartPercentage + "% of the records.");
			}
	}

	
