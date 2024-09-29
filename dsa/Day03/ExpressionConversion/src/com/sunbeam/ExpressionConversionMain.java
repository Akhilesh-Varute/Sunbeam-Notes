package com.sunbeam;

public class ExpressionConversionMain {
	
	public static int prio(char opr) {
		switch(opr) {
		case '$': return 11;
		case '/': return 10;
		case '*': return 10;
		case '%': return 10;
		case '+': return 9;
		case '-': return 9;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix) {
		//1. create stack to push operators
		Stack st = new Stack(10);
		//2. create postfix string
		StringBuilder postfix = new StringBuilder();
		//3. traverse infix expression from left to right
		for(int i = 0 ; i < infix.length() ; i++) {
			//4. read character at ith index
			char ele = infix.charAt(i);
			//5. if element is operand
			if(Character.isDigit(ele))
				// append element into postfix expression
				postfix.append(ele);
			// if element is '('
			else if (ele == '(')
				// push current element on stack
				st.push(ele);
			// if element is ')'
			else if (ele == ')') {
				while(st.peek() != '(') {
					postfix.append(st.pop());
				}
				st.pop();  //to discard '('
			}
			//6. if element is operator
			else {
				// check priority of current element with top most element of stack
				while(!st.isEmpty() && prio(st.peek()) >= prio(ele)) {
					// stack is not empty
					// prio of top most element is greater or equal than current element
					postfix.append(st.pop());
				}
				//7. push current operator(ele) on stack
				st.push(ele);
			}
		}
		//8. pop all remaining elements from stack and append them into postfix expr one by one
		while(!st.isEmpty()) {
			postfix.append(st.pop());
		}
		//9. return postfix expression 
		return postfix.toString();
	}

	public static String infixToPrefix(String infix) {
		//1. create stack to push operators
		Stack st = new Stack(10);
		//2. create postfix string
		StringBuilder prefix = new StringBuilder();
		//3. traverse infix expression from right to left
		for(int i = infix.length()-1 ; i >= 0 ; i--) {
			//4. read character at ith index
			char ele = infix.charAt(i);
			//5. if element is operand
			if(Character.isDigit(ele))
				// append element into prefix expression
				prefix.append(ele);
			// if element is ')'
			else if (ele == ')')
				// push current element on stack
				st.push(ele);
			// if element is '('
			else if (ele == '(') {
				while(st.peek() != ')') {
					prefix.append(st.pop());
				}
				st.pop();  //to discard '('
			}
			//6. if element is operator
			else {
				// check priority of current element with top most element of stack
				while(!st.isEmpty() && prio(st.peek()) > prio(ele)) {
					// stack is not empty
					// prio of top most element is greater than current element
					prefix.append(st.pop());
				}
				//7. push current operator(ele) on stack
				st.push(ele);
			}
		}
		//8. pop all remaining elements from stack and append them into postfix expr one by one
		while(!st.isEmpty()) {
			prefix.append(st.pop());
		}
		//9. reverse the expression
		prefix.reverse();
		//9. return prefix expression 
		return prefix.toString();
	}
	public static void main(String[] args) {
		String infix = "1$9+3*4-(6+8/2)+7";
		
		System.out.println("Infix : " + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix : " + prefix);

	}

}
