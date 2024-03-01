import java.util.Arrays;

public class Sort_8 {

    public static void main(String[] args) {

        int[][] input = {{1,4},{2,3},{3,5},{4,6},{5,7}};
        System.out.println(MySolution(input));

    }

    public static int MySolution(int[][] s){
        int answer = 1;

        Arrays.sort(s,(a,b)->a[1]==b[1]? a[0]-b[0]:a[1]-b[1]);

        int endTime = s[0][1];
        for(int i=1; i<s.length-1; i++){
            if(endTime <= s[i+1][0]){
                endTime = s[i+1][1];
                answer++;
            }
        }
        return answer;
    }

    public static void OtherSolution(String s){

    }

}
