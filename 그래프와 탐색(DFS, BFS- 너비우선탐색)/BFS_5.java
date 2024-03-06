import java.util.LinkedList;
import java.util.Queue;

public class BFS_5 {
    static int answer = 0;
    public static void main(String[] args) {
        MySolution();
        System.out.println(answer);
    }

    public static void MySolution(){

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()){
            int v = queue.poll();
            answer += v;
            if(v < 4){
                queue.add(v*2);
                queue.add(v*2+1);
            }
        }
    }

    public static void OtherSolution(String s){

    }




}



