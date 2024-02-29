import java.util.Stack;

public class Stack_5 {

    public static void main(String[] args) {

        String input = "(((()(()()))(())()))(()())";
        System.out.println(MySolution(input));

    }

    public static int MySolution(String s){
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(s.charAt(i-1)=='('){
                    answer += stack.size();
                }else{
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void OtherSolution(String s){

    }

}
