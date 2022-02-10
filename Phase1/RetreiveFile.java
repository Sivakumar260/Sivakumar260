package Phase1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RetreiveFile extends Operations{
	
	static void Retrivefile() throws IOException {
		File dir=new File("D:\\example");
		File[] files = null;
		if(dir.isDirectory()){
			 files = dir.listFiles();
		}
		Arrays.sort(files);
		System.out.println("The Files in the given directory ");
		for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	 }
}
