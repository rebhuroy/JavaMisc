
 class ThisEXP {
//Understanding the problem using and  without this keyword
	/*int rollno;  
	String name;  
	float fee;  
	ThisEXP(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	  
	public static void main(String args[]){  
	ThisEXP s1=new ThisEXP(111,"ankit",5000f);  
	ThisEXP s2=new ThisEXP(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
		

	}*/

	// Using this() to invoke current class constructor
	// Java code for using this() to 
	// invoke current class constructor
	
	   /* int a;
	    int b;
	 
	    //Default constructor
	    ThisEXP()
	    {  
	        this(10, 20);
	        System.out.println("Inside  default constructor \n");
	    }
	     
	    //Parameterized constructor
	   ThisEXP(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	        System.out.println("Inside parameterized constructor");
	    }
	 
	    public static void main(String[] args)
	    {
	        ThisEXP object = new ThisEXP();
	    }*/
	 
	//Java code for using 'this' keyword 
	//to return the current class instance
	/* int a;
	    int b;
	 
	    //Default constructor
	    ThisEXP()
	    {
	        a = 10;
	        b = 20;
	    }
	     
	    //Method that returns current class instance
	    ThisEXP get()
	    {
	        return this;
	    }
	     
	    //Displaying value of variables a and b
	    void display()
	    {
	        System.out.println("a = " + a + "  b = " + b);
	    }
	 
	    public static void main(String[] args)
	    {
	        ThisEXP object = new ThisEXP();
	        object.get().display();
	    }*/
	/* void display()
	    {
	        // calling fuction show()
	        this.show();
	    
	       System.out.println("Inside display function");
	    }
	     
	    void show() {
	        System.out.println("Inside show funcion");
	    }
	     
	 
	    public static void main(String args[]) {
	        ThisEXP t1 = new ThisEXP();
	        t1.display();
	    }*/
}
