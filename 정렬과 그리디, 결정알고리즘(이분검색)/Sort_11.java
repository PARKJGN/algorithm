import java.util.Arrays;

public class Sort_11 {

    public static void main(String[] args) {

        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Solution(input, 3));

    }

    public static int Solution(int[] s, int num){
        int answer = 0;
        int rt = Arrays.stream(s).sum();
        int lt = Arrays.stream(s).max().orElse(0);

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(Count(s, mid)<=num){
                answer=mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }

        return answer;
    }

    public static int Count(int[] songs, int capacity){
        int cnt = 1;
        int sum = 0;

        for(int x:songs){
            if(sum+x>capacity){
                cnt++;
                sum = x;
            } else sum +=x;
        }

        return cnt;
    }

    public static void OtherSolution(String s){

    }

}
