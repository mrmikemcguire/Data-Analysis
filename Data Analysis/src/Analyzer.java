import java.util.ArrayList;

public class Analyzer
	{
	private static int qqqCount = 0;
	
	public static void main(String[] args)
		{
		Data.addData();
		countRecords();
		findQQQs();
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


		}

	
