package defaultPorject;

public class LongestCommonSubSeq {

	public static String f(String s1,String s2,int i1,int i2){
		if(  (i1==s1.length())||(i2==s2.length())  )
		return "";
		if(s1.charAt(i1)==s2.charAt(i2))
			return s1.charAt(i1)+f(s1,s2,i1+1,i2+1);
		String resA=f(s1,s2,i1+1,i2);
		String resB=f(s1,s2,i1,i2+1);
		if(resA.length()>resB.length())
			return resA;
		else
		
		return resB;
		
	}
	public static void main(String[] args) {
		String s1="I Am Waiting";
		String s2="I Have Been Waiting";
		System.out.println(f(s1,s2,0,0));
	}

}
