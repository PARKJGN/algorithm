import java.util.Arrays;
import java.util.Stack;

public class Sort_2 {

    public static void main(String[] args) {
        int[] input = {13, 5, 11, 7, 23, 15};
        System.out.println(Arrays.toString(MySolution(input)));
    }

    public static int[] MySolution(int[] s){
        int temp = 0;

        for(int i=0; i<s.length-1;i++){
            for(int j=0;j<s.length-1-i;j++){
                if(s[j]>s[j+1]){
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] =  temp;
                }
            }
        }

        return s;
    }

    public static void OtherSolution(String s){

    }



}
