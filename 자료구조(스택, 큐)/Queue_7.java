import java.util.LinkedList;
import java.util.Queue;

public class Queue_7 {

    public static void main(String[] args) {

        String input1 = "CBA";
        String input2 = "CBDAGE";
        System.out.println(MySolution(input1,input2));

    }

    public static String MySolution(String a, String b) {

        Queue<Character> queue = new LinkedList<>();
        String answer = "YES";
        for (Character s : a.toCharArray()) {
            queue.offer(s);
        }
        for (Character s : b.toCharArray()) {
            if (queue.contains(s)) {
                if (queue.peek() == s) queue.poll();
                else{
                    answer = "NO";
                    break;
                }
            }
            if(queue.isEmpty()) break;
        }

        return answer;
    }

    public static void OtherSolution(String s){

    }

}
