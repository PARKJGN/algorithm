import java.util.Arrays;

public class Sort_7 {

    public static void main(String[] args) {

        int[][] input = {{2,7},{1,3},{1,2},{2,5},{3,6}};

        System.out.println(Arrays.deepToString(MySolution(input)));

    }

    public static int[][] MySolution(int[][] s){
        int[][] answer = s;
        Arrays.sort(answer, (a,b)->a[0]==b[0]? a[1] - b[1]: a[0] - b[0]);

        return answer;
    }

    public static void OtherSolution(String s){

    }

}
