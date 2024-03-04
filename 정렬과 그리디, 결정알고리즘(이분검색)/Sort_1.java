import java.util.Arrays;
import java.util.Stack;

public class Sort_1 {

    public static void main(String[] args) {
        int[] input = {13, 5, 11, 7, 23, 15};

        System.out.println(Arrays.toString(MySolution(input)));
    }

    public static int[] MySolution(int[] is){
        // 두개의 자료를 비교할때 작은 값의 index
        int idx = 0;
        // 스왑할때 필요한 변수
        int temp = 0;
        for(int i=0;i<is.length;i++){
            idx = i;
            for(int j = i+1; j<is.length; j++){
                if(is[idx]>is[j]) idx = j;
            }
            temp = is[i];
            is[i] = is[idx];
            is[idx] =  temp;
        }

        return is;
    }

    public static void OtherSolution(String s){

    }




}



