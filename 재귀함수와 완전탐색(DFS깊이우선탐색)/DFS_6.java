public class DFS_6 {
    static int total = 259;

    static int answer = 0;

    static int[] input = {};

    public static void main(String[] args) {

        input = new int[]{81, 58, 42, 33, 61};
        MySolution(input);
    }

    public static void MySolution(int[] s){

        recursion(0,0);
        System.out.println(answer);

    }

    public static void recursion(int idx, int sum){
        if(sum>total) return;
        if(idx==input.length){
           answer = Math.max(answer,sum);
           return;
        }
        recursion(idx+1,sum+input[idx]);
        recursion(idx+1,sum);
    }

}
