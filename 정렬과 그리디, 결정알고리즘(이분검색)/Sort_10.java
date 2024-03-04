import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort_10 {

    public static void main(String[] args) {

        int[] input = {23, 87, 65, 12, 57, 32, 99, 81};
        System.out.println(MySolution(input));
    }

    public static int MySolution(int[] s){
        int target = 32;
        int lt = 0;
        int rt = s.length-1;
        Arrays.sort(s);

        while (lt<=rt){
            int mid = (rt+lt)/2;
            if(s[mid]==target) return mid+1;
            else if(s[mid]>target) rt = mid-1;
            else lt = mid + 1;
        }

        return 0;
    }

    public static void OtherSolution(String s){

    }

}
