package assignment_java_program;
import java.util.ArrayList;
import java.util.Collections;

//Define the first interface
interface InterfaceA {
    void methodA();
}

// Define the second interface
interface InterfaceB {
    void methodB();
}

//public class java_programs {
	// Implement both interfaces in a single class
	class MultiInheritanceClass implements InterfaceA, InterfaceB {
	    // Implement the method from InterfaceA
	    public void methodA() {
	        System.out.println("Method A from InterfaceA");
	    }

	    // Implement the method from InterfaceB
	    public void methodB() {
	        System.out.println("Method B from InterfaceB");
	    }

	    // Additional method
	    public void additionalMethod() {
	        System.out.println("Additional method in MultiInheritanceClass");
	    }
	}

	public class java_programs {
	    public static void main(String[] args) {
	        // Create an instance of MultiInheritanceClass
	        MultiInheritanceClass obj = new MultiInheritanceClass();
	        // Call methods from both interfaces
	        obj.methodA();
	        obj.methodB();
	        obj.additionalMethod();
	    }
	}

//}
	

	    /*public static void main(String[] args) {
	        // Create an ArrayList and add some elements
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(5);
	        list.add(2);
	        list.add(9);
	        list.add(1);
	        list.add(6);

	        // Print the original ArrayList
	        System.out.println("Original ArrayList: " + list);

	        // Sort the ArrayList in ascending order
	        Collections.sort(list);

	        // Print the sorted ArrayList
	        System.out.println("Sorted ArrayList in Ascending Order: " + list);
	    }
	}*/

//}
	/*public static void main(String[] args) {
        handleArrayIndexOutOfBounds();
        handleNullPointerException();
    }
    //a.ArrayIndexOutOfBound
    private static void handleArrayIndexOutOfBounds() {
        try {
            int[] array = {1, 2, 3};
            // Attempting to access an invalid index
            int value = array[5];
            System.out.println("This will not be printed: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
 
    // b.NullPointerException
    private static void handleNullPointerException() {
        try {
            String str = null;
            // Attempting to call a method on a null object
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

}*/
	
	  /* public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;  
	       String  primeNumbers = "";//Empty String
	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     
		     primeNumbers = primeNumbers + i + " ";//Appended the Prime number to the String
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	}*/

/*public static void main(String[] args) {
//program to reverse a string without reverse() function
   String str1  =  "Star Agile";
   System.out.println("Original string: "+str1);
   int n = str1.length(); // Calculates length of String
   String Reverse_String ="";
   char ch;
   for(int i=0;i<n;i++) {          
       ch = str1.charAt(i);//fetch each character
       Reverse_String = ch + Reverse_String;//concatenates each character in front of the new string
   }
   System.out.println("Reversed string: "+Reverse_String); //  Display the reversed String
   
   
   //program to reverse a string with a reverse() function
   String str  =  "Reverse String Using reverse function";
   System.out.println("Original string: "+str);
   StringBuilder reverseString = new StringBuilder(str);// Declaring a StringBuilder and converting string to StringBuilder
   reverseString.reverse();  // Reversing the StringBuilder
   String result = reverseString.toString();// Converting StringBuilder to String
   System.out.println("Reversed string: "+result);

}

}*/

