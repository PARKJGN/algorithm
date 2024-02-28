import java.util.Stack;
import java.util.stream.Collectors;

public class Stack_2 {

    public static void main(String[] args) {

        System.out.println(MySolution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));

    }

    public static String MySolution(String s){
        Stack<Character> stack2 = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for(Character c:s.toCharArray()){
            if(c=='(') stack2.push(c);

            else if(c==')') stack2.pop();

            else {
                if(!stack2.contains('(')) answer.append(c);
            }
        }

        return answer.toString();
    }

    public static String OtherSolution(String s){
        Stack<Character> otherStack2 = new Stack<>();

        for(Character c:s.toCharArray()){
            if(c==')') {
                while (otherStack2.pop() != '(');
            } else{
                otherStack2.push(c);
            }
        }

        return otherStack2.stream().map(String::valueOf).reduce((a,b)->a+b).orElse(null);
    }



}
