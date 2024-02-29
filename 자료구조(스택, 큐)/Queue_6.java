import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        System.out.println(MySolution(N, K));
    }

    public static int MySolution(int people, int number){
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        for(int i=0; i<people; i++){
            queue.add(i+1);
        }
        while(queue.size()!=1){
            for(int j=1; j<number; j++){
                queue.add(queue.poll());
            }
            queue.remove();
        }
        answer = queue.poll();
        return answer;
    }

    public static void OtherSolution(String s){

    }

}
