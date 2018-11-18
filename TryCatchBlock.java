 package com.java.dsprogram;

public class TryCatchBlock {
public static int s(){
	try{
		int a=10/0;
		
	}catch(Exception e){
		System.out.println("problem");
		return 1;
	}finally{
		System.out.println("finally");
	}
	return 0;
}
	
	public static void main(String[] args) {
        System.out.println(s());
	}

}
