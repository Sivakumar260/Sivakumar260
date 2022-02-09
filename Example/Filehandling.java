package Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
 
public class Filehandling
{

    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("D://example//File1.txt");

          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
 
          FileWriter writer = new FileWriter(file);
          writer.write("Hello,Good morning everyone.......");
          writer.close();
          
		  }
    public static void readFileFileReaderClass() throws IOException
	{
		
		FileReader reader= new FileReader("D:\\example\\File1.txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
	}
    public static void modifyFile(String file,String olddata,String newdata)
	{
		File fileToBeModified= new File(file);
		String fileData="";
		BufferedReader reader=null;
		FileWriter writer=null;
		try {
			reader=new BufferedReader(new FileReader(fileToBeModified));
			String line=reader.readLine();
			while(line!=null)
			{
				fileData=fileData+line+System.lineSeparator();
				line=reader.readLine();
			}

			String newFileData=fileData.replaceAll(olddata, newdata);

			writer=new FileWriter(fileToBeModified);
			writer.write(newFileData);
			System.out.println("\nData Updated Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
    static void DeleteInfile() throws IOException {
    	try {
			Path path= Paths.get("D:\\example\\File1.txt");
			if(Files.deleteIfExists(path))
				System.out.println("File deleted");
			else
				System.out.println("file not deleted");
			
		} catch (Exception e) {
			System.out.println("No such file exist"+e);
		}
    }
    public static void main(String[] args) throws IOException
    {
    	
        createFileUsingFileClass();
        readFileFileReaderClass();
        modifyFile("D:\\example\\File1.txt", "good", "happy");
        DeleteInfile();
    }
	
   
   
}
