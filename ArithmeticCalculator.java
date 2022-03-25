package org;
import java.util.Scanner;

public class ArithmeticCalculator {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:addtion\n2:subtraction\n3:multiplication\n4:division");
		for(int i=1;i<=5;i++) {
			System.out.println("enter your choice to perform calculation : ");
			int selected_choice=sc.nextInt();
			System.out.println("enter the inputs");
			int a=sc.nextInt();
			int b=sc.nextInt();
			switch(selected_choice) {
			case 1:System.out.println("addtion of "+a+"+"+b+" is "+(a+b));
			break;
			case 2:System.out.println("subtraction of "+a+"-"+b+" is "+(a-b));
			break;
			case 3:System.out.println("multiplication of "+a+"*"+b+" is "+(a*b));
			break;
			case 4:System.out.println("division of "+a+"/"+b+" is "+(a/b));
			break;
			default:
				System.out.println("please enter the valid choice");
			}
		}
		
    sc.close();//optional
	}

}
