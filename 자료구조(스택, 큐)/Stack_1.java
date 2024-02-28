import java.util.Stack;

public class Stack_1 {

    public static void main(String[] args) {
        System.out.println(Solution("(())()"));
    }

    public static boolean Solution(String s){
        Stack<Character> stack1 = new Stack<>();

        for(Character c:s.toCharArray()){
            if(c=='(') stack1.push(c);
            if(c==')'){
                if(stack1.isEmpty()) return false;

                stack1.pop();
            }
        }

        return stack1.isEmpty();

    }


}



