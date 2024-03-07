import java.util.Arrays;

public class DP_4 {

    static int total;
    static int[] type;
    static int[] dy;

    public static void main(String[] args) {
        type = new int[]{1, 2, 5};
        total = 15;
        MySolution(type);
        System.out.println(dy[total]);
    }

    public static void MySolution(int[] is){
        dy = new int[total+1];
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i=0; i<type.length; i++){
            for(int j=type[i]; j<dy.length; j++){
                dy[j] = Math.min(dy[j-type[i]]+1, dy[j]);
            }
        }

    }

    public static void OtherSolution(String s){

    }




}



