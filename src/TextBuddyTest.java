import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TextBuddyTest {
	
	private static final String fileName = "mytextfile.txt";
	
	@Before
	public void intialiseProgram() throws IOException {
		TextBuddy.setFileName(fileName);
		TextBuddy.getFileReady();
	}
	
	// Test Sort Case 1: Sort Alphabetical Order
	@Test
	public void testSortFile() throws IOException {
		// test sorting an empty file
		TextBuddy.clearFile();
		assertEquals(fileName + " has nothing to sort", TextBuddy.sortFileContents());
	}
	
}
