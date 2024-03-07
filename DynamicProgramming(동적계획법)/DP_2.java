
public class DP_2 {

    static int[] dy;
    public static void main(String[] args) {

        int input = 7;
        MySolution(input);
        System.out.println(dy[input]);
    }

    public static void MySolution(int i){

        dy = new int[i+1];
        dy[0] = 1;
        dy[1] = 1;
        dy[2] = 2;

        for(int k=3; k<dy.length;k++){
            dy[k] = dy[k-2] + dy[k-1];
        }

    }

    public static void OtherSolution(String s){

    }




}



