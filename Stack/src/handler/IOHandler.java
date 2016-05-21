package handler;

import java.util.Scanner;

public class IOHandler {
	
	private Scanner s;
	
	public IOHandler() {
		s = new Scanner(System.in);
	}
	
	public int inputInt() {
		int value = s.nextInt();
		
		return value;
	}
	
	public void printString(String str) {
		System.out.println(str);
		
		System.out.println("commit hojung");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s.toString();
	}
}
