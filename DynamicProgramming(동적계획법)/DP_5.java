import java.util.Arrays;

public class DP_5 {
    static int endTime;
    static int[][] input;
    public static void main(String[] args) {
        endTime = 20;
        input = new int[][]{{10, 5}, {25, 12}, {15, 8}, {6, 3}, {7, 4}};
        MySolution();
    }

    public static void MySolution(){

        int[] dy = new int[endTime+1];

        for(int i=0; i<input.length; i++){
            int ps = input[i][0];
            int pt = input[i][1];
            for(int j=endTime; j>=pt; j--){
                dy[j] = Math.max(dy[j-pt]+ps, dy[j]);
            }
        }

        System.out.println(Arrays.stream(dy).max().getAsInt());
    }

    public static void OtherSolution(String s){

    }




}



