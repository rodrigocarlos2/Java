import javax.swing.JOptionPane;


public class Code {
	
	// Here have Attributes
	
	static int global_attribute;
	// Variable static and global in the class.
	
	public static void main(String args[]){
		
		// Here is the method Main
		
		System.out.println("Author: Rodrigo Carlos Carvalho Lima Barbosa Leal.");
		System.out.println("Course: Information System.");
		
		String age = JOptionPane.showInputDialog(null);
		
		System.out.println("Age: "+age);
		
	}

}