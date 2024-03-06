import java.util.ArrayList;
import java.util.List;

public class BFS_3 {
    static int nodes = 5;
    static boolean[] checked;
    static List<List<Integer>> list;

    static int answer = 0;
    public static void main(String[] args) {
        int[][] line= {{1,2},{1,3},{1,4},{2,1},{2,3},{2,5},{3,4}
                ,{4,2},{4,5}};
        MySolution(line);
    }

    public static void MySolution(int[][] s){
        list= new ArrayList<>();
        checked = new boolean[nodes+1];
        for (int i = 0; i < s.length; i++) {
            list.add(new ArrayList<>());
        }
        for(int i = 0; i<s.length; i++){
            list.get(s[i][0]).add(s[i][1]);
        }
        checked[0] = true;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int s){
        if(s==nodes) answer++;
        else{
            for(int i = 0; i< list.get(s).size(); i++){
                if(!checked[list.get(s).get(i)-1]){
                    checked[list.get(s).get(i)-1] = true;
                    DFS(list.get(s).get(i));
                    checked[list.get(s).get(i)-1] = false;
                }
            }
        }
    }

}



