package learning.filehandling;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class FileOperationsTest {

	private FileOperations fileOperations;
	
	@Before
	public void setup(){
		fileOperations = new FileOperations();
	}
	
	@Test
	public void testGetFileContent() throws IOException {
		// Test data
		String path = "/home/vfroot/naveen/gitrepo/goal/README.md";
		// Test operation
		String fileContent = fileOperations.getFileContent(path);
		System.out.println(fileContent);
	}

	@Test
	public void testWriteContentInFile() throws IOException{
		// Test Data
		String path = "/home/vfroot/naveen/gitrepo/goal/temp/Test.text";
		String content = "Nitin upadhyay";
		// Test operation
		fileOperations.writeCotentInFile(path, content);
		// Test verification
		String fileContent = fileOperations.getFileContent(path);
		Assert.assertEquals(content, fileContent);
	}
	
	// TODO : DELETE a File
	// TODO: Append content in a file
	
	
}
