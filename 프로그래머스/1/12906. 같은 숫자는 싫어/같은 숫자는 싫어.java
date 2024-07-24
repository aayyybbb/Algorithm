import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> numberList = new ArrayList<>();
        int count = -1;
        for(int num : arr){
            if(num != count){
            numberList.add(num);
            count = num;
            }
        }
        int[] answer = new int[numberList.size()];
        for(int i = 0; i < numberList.size(); i++){
            answer[i] = numberList.get(i);
        }
        return answer;
    }
}