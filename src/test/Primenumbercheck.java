package test;

import java.util.Scanner;

public class Primenumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Prime number check
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num6 = scanner.nextInt();
		boolean flag = true;
		for(int index=2;index<num6;index++) {
			int remainder = num6%index;
			if(remainder==0) {
				flag= false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("The number is Prime");
		}else {
			
			System.out.println("The number is not Prime");
		}
		
		scanner.close();
	}

}
