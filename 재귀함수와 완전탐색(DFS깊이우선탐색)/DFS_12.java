import java.util.Arrays;

public class DFS_12 {

    static int[][] dy;

    public static void main(String[] args) {
        int input = 33;
        int input2 = 19;

        MySolution(input, input2);
    }

    public static void MySolution(int s, int s2){
        dy = new int[s2][s];
        for(int i = 0; i<dy.length;i++){
            Arrays.fill(dy[i],0);
        }

        int value = recursion(s, s2);
        System.out.println(value);
    }

    public static int recursion(int s, int s2){
        if(s2==1 || s-s2==1) return s;
        if(dy[s2-1][s-1] != 0) return dy[s2-1][s-1];
        dy[s2-1][s-1] = recursion(s-1, s2-1) + recursion(s-1, s2);
        return dy[s2-1][s-1] ;
    }

}
