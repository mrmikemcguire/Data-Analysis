import java.util.ArrayList;

public class Analyzer
	{
	private static int qqqCount = 0;
	private static int length6Count = 0;
	
	public static void main(String[] args)
		{
		Data.addData();
		countRecords();
		findQQQs();
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
	}

	
