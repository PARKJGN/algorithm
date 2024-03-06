import java.util.Arrays;
import java.util.List;

public class BFS_2 {

    static int nodes = 5;
    static boolean[] checked;
    static int[][] gragh;

    static int answer = 0;

    public static void main(String[] args) {
        int[][] line= {{1,2},{1,3},{1,4},{2,1},{2,3},{2,5},{3,4}
        ,{4,2},{4,5}};
        MySolution(line);
    }

    public static void MySolution(int[][] s){
        gragh = new int[nodes+1][nodes+1];
        checked = new boolean[nodes];
        for(int i = 0; i<s.length; i++){
            gragh[s[i][0]][s[i][1]] = 1;
        }
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int s){
        if(s==nodes) answer++;
        else{
            for(int i =1; i<=nodes; i++){
                if(gragh[s][i]==1 && !checked[i-1]){
                    checked[s-1] = true;
                    DFS(i);
                    checked[s-1] = false;
                }
            }
        }
    }




}



