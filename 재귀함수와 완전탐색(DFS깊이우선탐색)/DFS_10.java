import java.util.Arrays;

public class DFS_10 {

    static boolean[] checked;
    static int[] tmp = new int[2];
    static int[] input;

    public static void main(String[] args) {
        input = new int[]{3, 6, 9};

        MySolution(input);
    }

    public static void MySolution(int[] s){
        checked = new boolean[3];
        recursion(0);
    }

    public static void recursion(int s){
        if(s==tmp.length) {
            System.out.println(Arrays.toString(tmp));
            return;
        }

        for(int i =0; i<input.length;i++){
            if(checked[i]) continue;
            tmp[s] = input[i];
            checked[i] = true;
            recursion(s+1);
            checked[i] = false;
        }
    }

}
