import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_5 {

    public static void main(String[] args) {
        int[] input = {1,2,3,2,6,2,3,5,7};
        System.out.println(Arrays.toString(MySolution(input)));
        System.out.println(Arrays.toString(OtherSolution(input)));
    }

    public static int[] MySolution(int[] s){

        int[] answer = {0, 0, 0, 0, 0};
        int temp = 0;

        for(int i =0; i<s.length;i++){
            if(!Arrays.stream(answer).boxed().toList().contains(s[i])){
                for(int j=answer.length-1;j>0;j--){
                    answer[j] = answer[j-1];
                }
                answer[0] = s[i];

            } else{
                temp = s[i];
                int idx = Arrays.stream(answer).boxed().toList().indexOf(s[i]);
                for(int k= idx-1; k>=0;k--){
                    answer[k+1] = answer[k];
                }
                answer[0] = temp;
            }
        }


        return answer;

    }

    public static int[] OtherSolution(int[] s){

        int[] answer = new int[5];

        for(int x: s){
            int pos = -1;
            for(int i=0; i<answer.length;i++)
                if(x==answer[i]) pos=i;

            if(pos==-1){
                for(int j=answer.length-1; j>=1;j--){
                    answer[j] = answer[j-1];
                }
            }
            else{
                for(int k=pos; k>=1; k--){
                    answer[k] = answer[k-1];
                }
            }
            answer[0] = x;
        }

        return answer;
    }

}