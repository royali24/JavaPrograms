package leetCode;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		// check is a string is balanced

		String str = "({})[]{";
		char[] ch = str.toCharArray();
		int flag = 1;
		
		Stack<Character> stack= new Stack<Character>();

		for(int i=0; i<ch.length;i++) {

			if(ch[i]=='('|| ch[i]=='{' || ch[i]=='[') {

				stack.push(ch[i]);
			}

			else {
				if(stack.isEmpty()) {
					flag=0; //stack is already empty and you are trying to push closing brace, hence not balanced
					break;
				}
				else {
					char peek = stack.peek();  // Stack is not empty. Hence, get the last entered character.
					flag= match(stack, ch[i], peek);
				}
			}

		}
		if(stack.isEmpty()) {
			System.out.println("balanced");
		}

		else if((flag==1)|| !stack.isEmpty()) {
			System.out.println("Not balanced");
		}
	}


	static int match(Stack<Character> stack, char insert, char peek) {
		int flag;
		
		if(insert==')'&& peek=='(' || insert=='}'&& peek=='{' || insert==']'&& peek=='[' ) {
			stack.pop();
			flag=1;
		}
		else
			flag=0;
		
		return flag;
	}
}






















	/*else if(ch[i]==')') {

				if(stack.isEmpty()) {
					flag=0;  //stack is already empty and you are trying to push closing brace, hence not balanced
				}
				else{
					if(stack.peek().equals('(')) {
						stack.pop();
					}
					else {
					flag=1;
					break;
					}
				}

			}

			else if(ch[i]=='}') {

				if(stack.isEmpty()) {
					flag=0;
				}
				else{
					if(stack.peek().equals('{')) {
						stack.pop();
					}
					else {
						flag=1;
						break;
					}
				}

			}

			else if(ch[i]==']') {

				if(stack.isEmpty()) {
					flag=0;
				}
				else{
					if(stack.peek().equals('[')) {
						stack.pop();
					}
					else {
						flag=1;
						break;
					}
				}

			}


		}*/

		
	




