package Phase1;

import java.io.IOException;

public class Main extends RetreiveFile {
	
      public static void main(String[] args) throws IOException {
		System.out.println("Welcome to LockMe ");
		System.out.println("This is Sivakumar, Developer of the Application ");
		while(true) {
		System.out.println("1.Retrieving the file names");
		System.out.println("2.Business operations");
		System.out.println("3.Close the application");
		System.out.println("Enter the choice ");
		int choice=sc.nextInt();
		if(choice==1) {
			Retrivefile();
		}
		else if(choice==2) { 
			System.out.println("1.creating a file");
			System.out.println("2.deleting a file");
			System.out.println("3.searching a file");
			System.out.println("4.Close Business operation");
			System.out.println("Enter the choice ");
			int choice1=sc.nextInt();
			if(choice1==1){
				CreatingFile();
			}
			else if(choice1==2) {
				DeletingFile();
			}
			else if(choice1==3){
				 SearchingFile();
			}
			else if(choice==4){
				close();	
			}
		}	
		else if(choice==3) {
			closeapp();
			break;
		}
	}
}
}

