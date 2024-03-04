public class DFS_7 {

    static int[][] input = {};
    static int timeTotal = 20;
    static int answer = 0;

    public static void main(String[] args) {

        input = new int[][]{{10, 5}, {25, 12}, {15, 8}, {6, 3}, {7, 4}};
        MySolution();
    }

    public static void MySolution(){
        recursion(0,0,0);
        System.out.println(answer);
    }

    public static void recursion(int i,int timeSum, int scoreSum){
        if(timeSum>timeTotal) return;
        if(i==input.length){
            answer = Math.max(answer, scoreSum);
            return;
        }
        recursion(i+1, input[i][1]+timeSum,input[i][0]+scoreSum);
        recursion(i+1, timeSum,scoreSum);

    }

}
