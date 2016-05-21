package controller;

import java.util.ArrayList;

public class Stack {
	
	private int top;
	
	private ArrayList<Integer> stackList;
	
	public Stack() {
		top = 0;
		stackList = new ArrayList<Integer>();
	}
	
	private boolean isFull() {
		boolean isFull = false;
		
		if( stackList.size() < 5) { isFull = false;}
		else { isFull = true; }
		
		return isFull;
	}
	
	public void push(int value) {
		
		if(isFull() == true) {
			new Exception("Stack can not add anymore.");
		}
		
		stackList.add(value);
		top++;
	}
	
	private boolean isEmpty() {
		
		if( stackList.size() == 0 ) { return true; }
		else { return false;}
	}
	
	public int pop() {
		if( isEmpty() == true ) {
			new Exception("Stack is empty");
		}
		
		int value = stackList.get(top);
		top--;
		
		return value;
	}
	
	public String toString() {
		String s = "";
		
		for(int i=0; i<top; i++) {
			s += stackList.get(i) + " ";
		}
		
		return s;
	}
}
