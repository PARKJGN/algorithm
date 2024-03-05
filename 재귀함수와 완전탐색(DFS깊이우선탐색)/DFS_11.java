public class DFS_11 {

    public static void main(String[] args) {
        int input = 5;

        MySolution(input);
    }

    public static void MySolution(int s){

        int value = recursion(s);
        System.out.println(value);
    }

    public static int recursion(int s){
        if(s==1) return 1;
        return s*recursion(s-1);

    }

}
