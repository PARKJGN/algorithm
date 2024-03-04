import java.util.Arrays;

public class Sort_4 {

    public static void main(String[] args) {
        int[] input = {11, 7, 5, 6, 10, 9};
        System.out.println(Arrays.toString(MySolution(input)));
    }

    public static int[] MySolution(int[] s){
        // 삽입되는 값을 저장하는 변수
        int temp = 0;
        int j = 0;

        // 인텍스 0은 이미 정렬된 것으로 볼 수 있다.
        for(int i=1; i<s.length;i++){
            temp = s[i];
            // temp 값보다 정렬된 배열에 있는 값이 크면 j번째를 j+1번째로 이동
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
