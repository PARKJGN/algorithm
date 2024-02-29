import java.util.Arrays;

public class Sort_3 {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, -3, -2, 5, 6, -6};
        System.out.println(Arrays.toString(MySolution(input)));
    }

    public static int[] MySolution(int[] s){
        int temp=0;

        for(int i=0;i<s.length-1;i++){
            for(int j=0;j<s.length-1-i;j++){
                if(s[j]>0 && s[j+1] <0){
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
