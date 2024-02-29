import java.util.Stack;

public class Stack_4 {

    public static void main(String[] args) {
        String PostfixExpression = "352+*9-";
        System.out.println(MySolution(PostfixExpression));
    }

    public static int MySolution(String s){
        Stack<Integer> stack = new Stack<>();
        int value1 = 0;
        int value2 = 0;

        for(String c:s.split("")){
            if(c.matches("^[0-9]")) stack.push(Integer.valueOf(c));
            else{
                value1 = stack.pop();
                value2 = stack.pop();

                switch (c){
                    case "+": stack.push(value2+value1);
                                break;
                    case "-": stack.push(value2-value1);
                                break;
                    case "*": stack.push(value2*value1);
                                break;
                    case "/": stack.push(value2/value1);
                                break;
                }
            }
        }
        return stack.pop();
    }

    public static void OtherSolution(String s){

    }

}
