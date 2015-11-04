package learning.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperations {

	
	public String getFileContent(String path) throws IOException{
		String content = "";
		File file = new File(path);
		InputStream isr = new FileInputStream(file);
		int b = 0;
		while((b=isr.read()) != -1){
			char ch = (char) b;
			content += ch;
		}
		isr.close();
		return content;
	}

	public void writeCotentInFile(String path, String content) throws IOException {
		File file = new File(path);
    	file.getParentFile().mkdirs();
		OutputStream os = new FileOutputStream(file);
		os.write(content.getBytes());
		os.close();
	}

	public void deleteFile(String path) {
		File file = new File(path);
		if(file.exists()){
			file.delete();
		}
	}
}
