package test;

public class Reversalexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse String variable
		//reversal of Array
		//reversal of Number
		
		String str1= "Clean India Green India";
		String revStr1 = "";
		
		for(int index=str1.length()-1;index>=0;index--) {
			revStr1=revStr1 + str1.charAt(index);
		}
		System.out.println("Reversed String " + revStr1);
		
		
		 
		 //Reversal of Number
		 
		 //result = 653254
		 int num5 = 452356;
		 int rev=0;
		 
		 while(num5>0) {
			 int remainder = num5%10;
			 rev = rev*10 + remainder;
			 num5 = num5/10;
		 }
		 System.out.println("The reversed number is "+ rev);		}
	}



