import java.util.Arrays;

public class DFS_8 {

    static int input = 0;
    static int num = 0;
    static int[] tmp = {};

    public static void main(String[] args) {
        input = 4;
        num = 3;
        tmp = new int[num];
        MySolution(input, num);
    }

    public static void MySolution(int i, int n){
        recursion(0);
    }

    public static void recursion(int s){
        if(s==num) {
            System.out.println(Arrays.toString(tmp));
            return;
        }
        for(int i =1; i<=input; i++){
            tmp[s] = i;
            recursion(s+1);
        }
    }

}
