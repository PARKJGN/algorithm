import java.util.Arrays;

public class DFS_5 {

    static int total = 0;
    static int n = 0;
    static int[] input = new int[0];
    static String answer = "NO";
    public static void main(String[] args) {

        input = new int[]{1, 3, 5, 6, 7, 10};
        MySolution(input);
    }

    public static void MySolution(int[] s){

        total = Arrays.stream(s).sum();
        n= s.length;
        recursion(0, 0);
        System.out.println(answer);
    }

    public static void recursion(int s,int sum){

        if(s==n) {
            if(total-sum==sum) {
                answer="YES";
                return;
            }
        }else{
            recursion(s+1,sum+input[s]);
            recursion(s+1,sum);
        }

    }

}
