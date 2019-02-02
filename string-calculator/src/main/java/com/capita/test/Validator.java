package com.capita.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
	
	public boolean validate(String expr) {
		
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
		
		boolean flag = false;
		
		//Check if first character is an operand
		if(operands.contains(c[0]))
			return false;
		
		for(int i=0; i<c.length; i++) {
		
			//Validate conditions for '('
			if(c[i] == '(' && i<c.length) {
				
				if(operands.contains(c[i]) && operands.contains(c[i+1]))
					return false;
				
				if(c[i+1] == '(' || (c[i+1]>47 && c[i+1]<58))
					if(i!=0 && operands.contains(c[i-1]))
						flag = true;
			}
		}
			
		
		return flag;
	}
	
}
