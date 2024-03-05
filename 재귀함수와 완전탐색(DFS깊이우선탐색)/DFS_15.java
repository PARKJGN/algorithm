public class DFS_15 {
    static int[] input;

    static int multiple = 6;

    static int draw = 3;
    public static void main(String[] args) {
        input = new int[]{2, 4, 5, 8, 12};
        MySolution();
    }

    public static void MySolution(){
        recursion(0, 0,0);
    }

    public static void recursion(int s, int s2,int sum){
        if(s==draw) {
            if(sum%multiple==0){
                System.out.println(sum);
            }
            return;
        }

        for(int i =s2; i<input.length;i++){
            recursion(s+1,i+1, sum+input[i]);
        }
    }

}
