public class DFS_9 {

    static int answer = Integer.MAX_VALUE;
    static int price = 15;
    static int[] type = {1,2,5};
    public static void main(String[] args) {
        MySolution();
    }

    public static void MySolution(){
        int sum = 0;
        recursion(0,sum);
        System.out.println(answer);
    }

    public static void recursion(int s,int sum){
        if(s>answer) return;
        if(sum>price) return;
        else if(sum==price){
            answer = s;
            return;
        }
        for(int i=0; i<type.length;i++){
            recursion(s+1,sum+type[i]);
        }

    }

}
