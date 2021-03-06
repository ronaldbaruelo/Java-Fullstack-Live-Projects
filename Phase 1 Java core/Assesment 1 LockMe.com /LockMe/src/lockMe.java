import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException; 
import java.io.FileWriter;




public class lockMe{
	
	public static void clearScreen() {
		
		
		
	}
	
	
	public void  addUser()
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter name"); 
    	String newName = scnr.next();
    	
    	FileWriter filePath = null;
    	
 
		try {
			
			filePath = new FileWriter("/Users/ronaldbaruelo/Desktop/simplilearn/Java_Fullstack _Live_Class _Projects/Phase 1 Java core/Assesment 1 LockMe.com /LockMe/src/user.txt",true); 
			filePath.write(newName + "\n");
			System.out.println("Data is written to the file.");
			filePath.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
    	
       } 


	public static void main(String[] args) {
		 
		
		int choiceNum;
		Scanner choice = new Scanner(System.in);
				
		System.out.println("============================================================");
		System.out.println("=                                                          =");
		System.out.println("=                                                          =");
		System.out.println("=                                                          =");
		System.out.println("=                             LockMe                       =");
		System.out.println("=                                                          =");
		System.out.println("=                                                          =");
		System.out.println("=                                                          =");
		System.out.println("=                   Developed by:Ronald Baruelo            =");
		System.out.println("=                                                          =");
		System.out.println("=                                                          =");
		System.out.println("=                                                          =");
		System.out.println("============================================================");
		
		System.out.println("\n1.Select this option to add user to this application");
		System.out.println("2.Select this option to delete user to this application");
		System.out.println("3.Select this option to search user to this application");
		System.out.println("4.Select this option to close to this application");
		System.out.println("Please select the number you choice?");
		choiceNum = choice.nextInt();
		lockMe ob = new lockMe();
		
		switch(choiceNum) {
		case 1:
	    	ob.addUser();
	    	clearScreen();
	    	
	    	
	    	break;
	    case 2:
	    	
	    	break;
	    case 3:
	    	
	    	break;
	    case 4:
            System.exit(0);
	    	break;
	    default:
	    	System.out.println("Error operator not correct"); 
	    	return;
	    }
		}
}
	

		
	


