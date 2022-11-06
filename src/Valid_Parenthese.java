import java.util.Stack;

public class Valid_Parenthese {

	public static void main(String[] args) {
		System.out.println(isValid("(])"));
	}
	public static boolean isValid(String s) {
		boolean result = false;
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char curChar = s.charAt(i);
			
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
				stack.push(Character.toString(s.charAt(i)));
			}
			else if(!stack.isEmpty()) {
				if (s.charAt(i)==')') {
					if(stack.peek().equals("(")) {
						stack.pop();
						continue;
					}
					else {
						return false;
					}
				}
				else if (s.charAt(i)==']') {
					if(stack.peek().equals("[")) {
						stack.pop();
						continue;
					}
					else {
						return false;
					}
				}
				else if (s.charAt(i)=='}') {
					if(stack.peek().equals("{")) {
						stack.pop();
						continue;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			
		}
		
		if(stack.isEmpty()) {
			result = true;
		}
		return result;
    }
}
