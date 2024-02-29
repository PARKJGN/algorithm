import java.util.Arrays;

public class Sort_4 {

    public static void main(String[] args) {
        int[] input = {11, 7, 5, 6, 10, 9};
        System.out.println(Arrays.toString(MySolution(input)));
    }

    public static int[] MySolution(int[] s){
        int temp = 0;
        int j = 0;

        for(int i=1; i<s.length;i++){
            temp = s[i];
            for(j=i-1; j>=0; j--){
                if(s[j]>temp){
                    s[j+1] = s[j];
                } else{
                    break;
                }
            }
            s[j+1] = temp;
        }


        return s;
    }

    public static void OtherSolution(String s){

    }

}
