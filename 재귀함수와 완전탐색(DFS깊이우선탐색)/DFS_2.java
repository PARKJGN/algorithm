import java.util.Stack;

public class DFS_2 {

    public static void main(String[] args) {
        int input = 11;
        MySolution(input);
    }

    public static void MySolution(int i){
        recursion(i);
    }

    public static void recursion(int s){
        if(s/2!=0){
            recursion(s/2);
        }
        System.out.print(s%2);
    }
}
