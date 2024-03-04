public class DFS_3 {

    public static void main(String[] args) {

        Solution(1);
    }

    public static void Solution(int s){

        recursion(s);
    }

    public static void OtherSolution(String s){

    }

    public static void recursion(int s){
        if (s <= 7) {
            recursion(s*2);
            System.out.println(s);
            recursion(s*2+1);
        }
    }

}
