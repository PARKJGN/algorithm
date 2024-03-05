import java.util.Arrays;

public class DFS_14 {
    static int input = 4;
    static int input2 = 2;
    static int[] tmp = new int[input2];
    public static void main(String[] args) {

        MySolution(input, input2);
    }

    public static void MySolution(int s, int s2){
        recursion(0,1);

    }

    public static void recursion(int s, int s2){
        if(s==input2){
            System.out.println(Arrays.toString(tmp));
            return;
        }
        for(int i =s2; i<=input; i++){
            tmp[s] = i;
            recursion(s+1,i+1);
        }

    }

}
