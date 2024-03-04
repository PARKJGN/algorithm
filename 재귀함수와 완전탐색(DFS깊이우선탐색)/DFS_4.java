public class DFS_4 {

    static int n;
    static boolean[] checked;

    public static void main(String[] args) {

        n = 3;

        MySolution();

    }

    public static void MySolution(){
        checked = new boolean[n+1];
        recursion(1);
    }

    public static void OtherSolution(String s){

    }

    public static void recursion(int v){
        if(v!=n+1){
            checked[v]=true;
            recursion(v+1);
            checked[v]=false;
            recursion(v+1);
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<= n;i++){
                if(checked[i]) sb.append(i);
            }
            if(!sb.isEmpty()){
                System.out.println(sb.toString());
            }

        }


    }

}
