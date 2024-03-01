import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sort_6 {

    public static void main(String[] args) {

        int[] input = {120, 125, 152, 130, 135, 143, 127, 160};
        System.out.println(MySolution(input));

    }

    public static String MySolution(int[] s){
        Integer[] sc2 =  Arrays.stream(s)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(sc2);
        StringBuilder answer = new StringBuilder();

        System.out.println(Arrays.toString(sc2));
        System.out.println(Arrays.toString(s));
        for(int i=0; i<s.length; i++){
            if(sc2[i]!=s[i]) answer.append(i+1);
        }
        return answer.toString();
    }

    public static void OtherSolution(String s){

    }

}
