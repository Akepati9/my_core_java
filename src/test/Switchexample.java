package test;

import java.util.Scanner;

public class Switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "Clean World Green World";
		int vowelcount=0;
		for(int index=0;index<str1.length();index++) {
			char temp = str1.charAt(index);
			
			switch(temp) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelcount = vowelcount+1;
				break;
			}
		}
		System.out.println("Total vowel count "+ vowelcount);
		
		//enter string
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		String str2 = scanner.nextLine();
		int vowelcount1=0;
		for(int index=0;index<str2.length();index++) {
			char temp = str2.charAt(index);
			
			switch(temp) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelcount1 = vowelcount1+1;
				break;
				default:
					System.out.println("No vowel");
			}
		}
		System.out.println("Total vowel count "+ vowelcount1);
	
	scanner.close();
	}

}
