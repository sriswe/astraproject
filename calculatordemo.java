package srinuswe;

import java.util.Scanner;

public class calculatordemo {

	public static void main(String[] args) {
		calculator cobj = new calculator();
		String input;
		Scanner sobj1 = new Scanner(System.in);
		
		do{cobj.add();
		cobj.sub();
		System.out.println("do you want another calculation? for yes type 'y' for no type 'n'");
		input = sobj1.next();
		}while(input.equalsIgnoreCase("Y"));
	}

}
