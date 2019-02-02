package com.capita.test;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Application {
	public static void main(String[] args) {
		
		//Validator v = new Validator();
		String s = "7+6-2";
		Set<Character> operands = new HashSet<Character>();
		operands.add('+');
		operands.add('-');
		operands.add('*');
		operands.add('/');
		operands.add('^');
		operands.add('(');
		operands.add(')');
		
		Stack<Integer> st = new Stack<Integer>();
		Stack<Character> op = new Stack<Character>();
		
		char[] ca = s.toCharArray();
		
		int index = 0;
		for(int i=0; i<ca.length; i++) {
			StringBuilder sb = new StringBuilder();
			
			if(operands.contains(ca[i])) {
				op.add(ca[i]);
				while(index<i)
					sb.append(ca[index++]);
				index = i+1;
				st.add(Integer.valueOf(sb.toString()));
			}
			
		}
		StringBuilder sb = new StringBuilder();
		while(index<ca.length)
			sb.append(ca[index++]);
		st.add(Integer.valueOf(sb.toString()));
		
		double result = st.pop();
		
		while(!op.isEmpty()) {
			result = operations(result, st.pop(), op.pop());
			
		}
		
		System.out.println(result);
	}
	
	public static double operations(double b, int a, char op) {
		switch (op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/': 
			return a/b;
		default:
			break;
		}
		
		return 0;
	}
	
}
