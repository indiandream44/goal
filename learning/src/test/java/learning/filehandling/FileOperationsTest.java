package learning.filehandling;

import java.io.File;
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
	@Test
	public void testDeleteAFile() throws IOException{
		// Test Data
		String path = "C:\\home\\vfroot\\naveen\\gitrepo\\goal\\temp\\testDeleteAFile.text";
		String content = "testDeleteAFile : Nitin upadhyay";
		fileOperations.writeCotentInFile(path, content);
		// Test operation
		fileOperations.deleteFile(path);
		// Test verification
		File file = new File(path);
		Assert.assertFalse(file.exists());
	}
	// TODO: Append content in a file
	
	
}
