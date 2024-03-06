
public class BFS_4 {
    static int[][] input;
    static int[] dx;
    static int[] dy;
    static int answer = 0;

    public static void main(String[] args) {
        input = new int[][]{{0, 0, 0, 0, 0, 0, 0},
                            {0, 1, 1, 1, 1, 1, 0},
                            {0, 0, 0, 1, 0, 0, 0},
                            {1, 1, 0, 1, 0, 1, 1},
                            {1, 1, 0, 0, 0, 0, 1},
                            {1, 1, 0, 1, 1, 0, 0},
                            {1, 0, 0, 0, 0, 0, 0}};

        MySolution(input);
    }

    public static void MySolution(int[][] s){
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, 1, 0, -1};
        input[0][0] = 1;
        DFS(0,0);
        System.out.println(answer);
    }

    public static void DFS(int s, int s2){
        if(s==6 && s2 ==6) answer++;
        else {
            for(int i=0; i<4; i++){
                int nx = s+dx[i];
                int ny = s2+dy[i];
                if(nx>=0 && ny >= 0 && nx <=6 && ny <=6 && input[nx][ny]==0){
                    input[nx][ny] = 1;
                    DFS(nx,ny);
                    input[nx][ny] = 0;
                }

            }
        }


    }




}



