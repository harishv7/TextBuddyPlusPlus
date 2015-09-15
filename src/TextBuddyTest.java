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
	
	// Test Sort Method 1: Sort an empty file
	@Test
	public void testSortEmptyFile() throws IOException {
		// test sorting an empty file
		TextBuddy.clearFile();
		assertEquals(fileName + " has nothing to sort", TextBuddy.sortFileContents());
	}
	
	// Test Sort Method 2: Sort after adding statements/tasks
	@Test
	public void testSortAfterAdd() throws IOException {
		TextBuddy.clearFile();
		
		// add sample lines
		TextBuddy.addToFile("Camel");
		TextBuddy.addToFile("Penguin");
		TextBuddy.addToFile("Buffalo");
		TextBuddy.addToFile("Hippopotamus");
		TextBuddy.addToFile("Eagle");
		TextBuddy.addToFile("Meerkat");
		TextBuddy.addToFile("Reindeer");
		TextBuddy.addToFile("Zebra");
		TextBuddy.addToFile("Shark");
		TextBuddy.addToFile("Gorilla");
		TextBuddy.addToFile("Rabbit");
		TextBuddy.addToFile("Koala");
		TextBuddy.addToFile("Flamingo");
		TextBuddy.addToFile("Elephant");
		
		assertEquals(fileName + " has been sorted alphabetically", TextBuddy.sortFileContents());
		TextBuddy.displayFileContents();
	}
}
