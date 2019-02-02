package com.capita.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Calculator {
	
	public String calculate(String expr) {
		
		final Set<Character> operands = new HashSet<Character>();
		operands.add('+');
		operands.add('-');
		operands.add('*');
		operands.add('/');
		operands.add('^');
		//operands.add('(');
		//operands.add(')');
		List<Character> l = new ArrayList<Character>();
		char[] c = expr.toCharArray();
		
		//expr.split("[+-*/^()]");
		
		
		return null;
	}
}
