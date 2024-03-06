import java.util.Arrays;

public class BFS_7 {

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

    public static void MySolution(int[][] ss){

        for(int i =0; i<ss.length; i++){
            for(int j=0; j<ss.length; j++){
                if(ss[i][j]==1) {
                    answer++;
                    DFS(i, j);
                }
            }
        }
    }

    public static void DFS(int s, int s2){
        if(input[s][s2]==0) return;
        input[s][s2]=0;
        for(int i = 0; i< dx.length; i++){
            int nx = s+dx[i];
            int ny = s2+dy[i];
            if(nx>=0 && ny >=0 && nx < input.length && ny < input.length && input[nx][ny]==1){
                DFS(nx, ny);
            }
        }
    }
}



