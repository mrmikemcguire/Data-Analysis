import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;


public class RecordTest extends TestCase
	{
	public void testRecord()
		{
		Record r = new Record("abc", 123);
		assertEquals("abc", r.getLetterCode());
		assertEquals(123, r.getNumberCode());
		}
	
	public void testSetLetterCode()
		{
		Record r2 = new Record("abc", 123);
		r2.setLetterCode("def");
		assertEquals("def", r2.getLetterCode());
		}
	
	public void testSetNumberCode()
		{
		Record r3 = new Record("abc", 123);
		r3.setNumberCode(456);
		assertEquals(456, r3.getNumberCode());
		}
	}
	
