import java.util.Arrays;

public class Sort_12 {

    public static void main(String[] args) {
        int[] input = {1, 2 , 8, 4, 9};
        System.out.println(MySolution(input, 3));
    }

    public static int MySolution(int[] s, int c){
        int answer = 0;
        Arrays.sort(s);
        int lt = 1;
        int rt = s[s.length-1] - s[0];

        while (lt<=rt){
            int mid = (rt+lt)/2;
            if(count(s, mid)>=c){
                answer = mid;
                lt=mid+1;
            }
            else rt = mid-1;
        }

        return answer;
    }

    public static int count(int[] s, int dist){
        int cnt = 1;
        int endpo = s[0];
        for(int i=1; i<s.length;i++){
            if(s[i]-endpo>=dist){
                cnt++;
                endpo = s[i];
            }
        }
        return cnt;
    }

    public static void OtherSolution(String s){

    }

}
