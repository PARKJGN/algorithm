import java.util.Arrays;

public class DP_3 {

    static int[] dy;

    public static void main(String[] args) {

        int[] input = {5, 3, 7, 8, 6, 2, 9, 4};
        MySolution(input);
        System.out.println(Arrays.stream(dy).max().orElse(0));
        System.out.println(Arrays.toString(dy));
    }

    public static void MySolution(int[] is){
        dy = new int[is.length];
        dy[0] = 1;
        for(int i = 0; i<is.length;i++){
            for(int j =0; j<i; j++){
                if(is[i]>is[j]) dy[i] = Math.max(dy[j] + 1, dy[i]);
            }

        }

    }

    public static void OtherSolution(String s){

    }




}



