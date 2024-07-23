import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        String num = Long.toString(n);
        String[] numList = num.split("");
        int [] nums = Arrays.stream(numList).mapToInt(Integer::parseInt).toArray();
        for(int i = answer.length - 1; i >= 0; i--){
            answer[answer.length -1 - i] = nums[i];
        }
        return answer;
}}