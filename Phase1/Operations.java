package Phase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Operations extends CLoseApp{

    static Scanner sc=new Scanner(System.in);
	 
     static void CreatingFile() throws IOException {
    	String folder="D:\\example\\";
    	System.out.println("Enter the File name to Create a file :");
    	String Filename=sc.next();
    	Filename=folder+Filename+".txt";
    	File file=new File(Filename);
    	if(file.createNewFile()) {
    	       System.out.println("File Created");
    	}else {
    		System.out.println("File Already Exist");
    	}
         FileWriter writer = new FileWriter(file);

         System.out.println("Entet the data ");
         String data=sc.next();
         writer.write(data);
         writer.close();
         System.out.println("writed successfully");
       
    }
    static void DeletingFile() {
    	try {
    		System.out.println("Enter the file name to delete a file ");
    		String input=sc.next();
			Path path= Paths.get("D:\\example\\"+input+".txt");
			if(Files.deleteIfExists(path))
				System.out.println("File deleted");
			else
				System.out.println("File not exist");
			
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    static void SearchingFile() {

    	        File directory = new File("D:\\example");

    	        String[] flist = directory.list();
    	        int flag = 0;
    	        System.out.println("Enter the file name ");
    	        String input=sc.next();
    	        String search=input+".txt";
    	        if (flist == null) {
    	            System.out.println("Empty directory.");
    	        }
    	        else {
    	            for (int i = 0; i < flist.length; i++) {
    	                String filename = flist[i];
    	                if (filename.equalsIgnoreCase(search)) {
    	                    System.out.println(filename + " is present in the Directory");
    	                    flag = 1;
    	                }
    	            }
    	        }

    	        if (flag == 0) {
    	            System.out.println("File Not Found");
    	        }
    	}
        static void close() {
        	System.out.println("The current Business operation are closed ");
        	System.out.println("you can chose the new operation.");
        }
        

}      
