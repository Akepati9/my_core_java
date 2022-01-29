package test;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		int [] array1 = {10,20,30,40};
		
		try {
		int result = num/2;
		System.out.println(array1[2]);
		} catch (ArithmeticException e){
		
		System.out.println("Inside ArithmeticException");
				
	}
		catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println("Inside ArrayIndexOutOfBoundsException");
					
		}
		catch (Exception e){
			
			System.out.println("Inside default exception");
					
		}
System.out.println("after try and catch");}
}
