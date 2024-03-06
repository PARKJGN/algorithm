import java.util.LinkedList;
import java.util.Queue;

public class BFS_8 {

    static int[][] input;
    static int answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {

        input = new int[][]{{1, 1, 0, 0, 0, 1, 0},
                          {0, 1, 1, 0, 1, 1, 0},
                          {0, 1, 0, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 1, 1},
                          {1, 1, 0, 1, 1, 0, 0},
                          {1, 0, 0, 0, 1, 0, 0},
                          {1, 0, 1, 0, 1, 0, 0}};

        MySolution(input);
        System.out.println(answer);

    }

    public static void MySolution(int[][] s){

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i<input.length; i++){
            for(int j =0; j<input.length; j++){
                if(input[i][j]==1){
                    answer++;
                    input[i][j]=0;
                    queue.add(new int[]{i, j});
                    while (!queue.isEmpty()){
                        int[] xy = queue.remove();
                        for(int k = 0; k<dx.length; k++){
                            int nx = xy[0] + dx[k];
                            int ny = xy[1] + dy[k];
                            if(nx>=0 && ny >=0 && nx < input.length && ny < input.length && input[nx][ny]==1){
                                queue.add(new int[]{nx, ny});
                                input[nx][ny]=0;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void OtherSolution(String s){

    }




}



