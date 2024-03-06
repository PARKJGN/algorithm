import java.util.LinkedList;
import java.util.Queue;

public class BFS_6 {
    static int[] dist;
    static int start;
    static int end;
    static int answer = Integer.MAX_VALUE;
    static int[] ch;
    static int[] dis;

    public static void main(String[] args) {
        start = 5;
        end = 14;
        System.out.println(MySolution());
    }

    public static int MySolution(){
        ch = new int[10001];
        dis = new int[10001];
        Queue<Integer> queue = new LinkedList<>();
        ch[start] = 1;
        queue.add(start);
        dis[start] = 0;
        while (!queue.isEmpty()){
            int i = queue.poll();
            for(int nx : new int[]{i - 1, i + 1, i + 5}){
                if(nx==end) return dis[i]+1;
                if(nx>0 && nx<=10000 && ch[nx]==0){
                    ch[nx] = 1;
                    queue.add(nx);
                    dis[nx] = dis[i]+1;
                }
            }
        }
        return -1;
    }

    public static void BFS (int s, int sum){

    }

}



