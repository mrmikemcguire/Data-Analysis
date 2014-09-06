public class Record
	{
	private String letterCode;
	private long numberCode;
	
	public Record (String l, long n)
		{
		letterCode = l;
		numberCode = n;
		}

	public String getLetterCode()
		{
		return letterCode;
		}

	public long getNumberCode()
		{
		return numberCode;
		}

	public void setLetterCode(String letterCode)
		{
		this.letterCode = letterCode;
		}

	public void setNumberCode(long numberCode)
		{
		this.numberCode = numberCode;
		}
	}
