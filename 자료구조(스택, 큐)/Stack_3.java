import java.util.Stack;

public class Stack_3 {

    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(MySolution(board, moves));

    }

    public static int MySolution(int[][] board, int[] moves){

        Stack<Integer> stack3 = new Stack<>();
        int answer = 0;
        for(int i:moves){
            for(int j=0; j<board.length; j++){
                if(board[j][i-1]!=0){
                    if(!stack3.isEmpty() && board[j][i-1]==stack3.peek()) {
                        stack3.pop();
                        answer += 2;
                        board[j][i-1]=0;
                        break;
                    } else{
                        stack3.push(board[j][i-1]);
                        board[j][i-1]=0;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void OtherSolution(String s){

    }

}
