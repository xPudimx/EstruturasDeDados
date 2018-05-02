public class ED195 {
  public static boolean balanced (String s) {
    MyStack<Character> stack = new LinkedListStack<Character>();
    char aux;

    if(s.length() % 2 != 0)
      return false;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == ')'){
        if(stack.top() != '('){
          return false;
        }
        aux = stack.top();
      }
      else if (s.charAt(i) == ']') {
        if(stack.top() != '['){
          return false;
        }
        aux = stack.top();
      }
      else
        stack.push(s.charAt(i));
    }
    if(stack.top() != null){
      return false;
    }
    return true;
  }
}
