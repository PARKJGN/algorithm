import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Time implements Comparable<Time> {
    public int time;
    public char status;

    public Time(int time, char status){
        this.time = time;
        this.status = status;
    }

    @Override
    public int compareTo(Time o) {
        if(this.time==o.time) return this.status-o.status;
            else return this.time-o.time;
    }
}
public class Sort_9 {

    public static void main(String[] args) {

        int[][] input = {{14,18},{12,15},{15,20},{20,30},{5,14}};
        System.out.println(MySolution(input));
    }

    public static int MySolution(int[][] s){
        int answer = 0;
        int cnt = 0;
        List<Time> list = new ArrayList<>();
        for(int[] in: s){
            list.add(new Time(in[0],'s'));
            list.add(new Time(in[1],'e'));
        }

        Collections.sort(list);
        for(Time o:list){
            if(o.status=='s') cnt++;
            else cnt--;
            answer=Math.max(answer,cnt);
        }

        return answer;
    }

    public static void OtherSolution(String s){

    }
}
