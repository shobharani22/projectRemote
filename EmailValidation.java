package org;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		ArrayList<String> emailLists= new ArrayList<String>();
		emailLists.add("tom@gmail.com");
		emailLists.add("shyam@gmail.com");
		emailLists.add("leela@gmail.com");
		emailLists.add("ram@gmail.com");
		emailLists.add("jerry@gmail.com");
		emailLists.add("pia@gmail.com");

		Scanner sc = new Scanner(System.in);

		for(int j=1;j<=2;j++) {
			System.out.println("enter email to search :");

			String email=sc.next();
			int flag=0;
			for(int i=0;i<emailLists.size();i++) {

				if(email.equals(emailLists.get(i))) {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println(email+" present in given list of array");
			}
			else {
				System.out.println(email+" not present in given list of array");

			}
		}
	}


}
