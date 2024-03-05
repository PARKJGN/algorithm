import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class DFS_13 {

    static int[][] dy;

    static int target = 16;

    static boolean[] checked;

    static int[] combi;
    static int[] tmp;
    static int flag = 0;

    public static void main(String[] args) {
        int input = 4;
        int input2 = 16;
        MySolution(input, input2);

    }

    public static void MySolution(int s, int s2){
        dy = new int[s][s];
        combi = new int[s];
        for (int[] ints : dy) {
            Arrays.fill(ints, 0);
        }
        for(int j = 0; j<s; j++){
            combi[j] = recursion(s-1,j);
        }
        checked = new boolean[s+1];
        tmp = new int[s];
        DFS(0,0);
    }

    public static int recursion(int s, int s2){
        if(s2 == 0 || s2 == s) return 1;
        if(dy[s2-1][s-1] != 0) return dy[s2-1][s-1];
        dy[s2-1][s-1] = recursion(s-1, s2-1) + recursion(s-1, s2);
        return dy[s2-1][s-1] ;
    }

    public static void DFS(int s, int sum){
        if(flag==1) return;
        if(s==tmp.length && sum == target) {
            flag=1;
        }else{
            for(int i=1; i<=tmp.length;i++){
                if(checked[i]) continue;
                checked[i] = true;
                tmp[s] = i;
                DFS(s+1, sum+combi[s]*tmp[s]);
                checked[i] = false;
            }
        }


    }


}
