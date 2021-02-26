

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using default access specifier"); 
     } 
} 

public class AccessSpecifiers1 {
	public static void main(String[] args) {
		
		//default
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}
