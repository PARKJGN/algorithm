public class DFS_1 {

    public static void main(String[] args) {

        int input = 3;
        Solution(input);
    }

    public static void Solution(int i){
        recursion(i);
    }

    public static void recursion(int i){
        if(i!=0) {
            recursion(i-1);
            System.out.print(i);
        }
    }


}



