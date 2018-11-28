+++++++++++++++++++
public class StaticEXP {
	/* int rollno;  
	   String name;  
	   static String college ="GCELT";  
	     
	  StaticEXP(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){System.out.println(rollno+" "+name+" "+college);}  
	  

	public static void main(String[] args) {
		StaticEXP s1 = new StaticEXP(111,"Karan");  
		StaticEXP s2 = new StaticEXP(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
		
	}*/
	
	
	//Program of counterusing satatic and without static variable
	/*
	 int count=0;//will get memory when instance is created  
	  
	StaticEXP(){  
	count++;  
	System.out.println(count);  
	}  
	public static void main(String args[]){  
		  
		StaticEXP c1=new StaticEXP();  
		StaticEXP c2=new StaticEXP();  
		StaticEXP c3=new StaticEXP();  
		  
		 }  */
	
	//Example of Static Method 
	/*int rollno;  
    String name;  
    static String college = "ITS";  
      
    static void change(){  
    college = "BBDIT";  
    }  
 
    StaticEXP(int r, String n){  
    rollno = r;  
    name = n;  
    }  
 
    void display (){System.out.println(rollno+" "+name+" "+college);}  
    public static void main(String args[]){  
        StaticEXP.change();  
      
        StaticEXP s1 = new StaticEXP(111,"Karan");  
      StaticEXP s2 = new StaticEXP(222,"Aryan");  
        StaticEXP s3 = new StaticEXP(333,"Sonoo");  
      
        s1.display();  
        s2.display();  
        s3.display();  
        }  
	  */

	//RESTRICTION OF STATIC METHOD
	
	 /*  int a=40;//non static  
	   
	 public static void main(String args[]){  
	  System.out.println(a);  
	 }  
	*/
	// EXAMPLE STATIC BLOCK 
	static{
		System.out.println("static block is invoked");
		} 
	 public static void main(String args[]){  
	   System.out.println("Hello main");  
	  }  
	
	//A PROGRAM WITHOUT USING MAIN METHOD but it is possible in previous version of JDK not in JDK 1.7
	/*static{  
		  System.out.println("static block is invoked");  
		  System.exit(0);  
		  }  */
}
