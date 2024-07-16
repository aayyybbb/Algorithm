import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = new ArrayList<>();
        for(int n : arr){
        if(n%divisor==0){
        answerList.add(n);
        }
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0; i<answerList.size(); i++){
        answer[i] = answerList.get(i);
        }
        if(answer.length == 0){
        return new int[] {-1};
        }
        Arrays.sort(answer);
        return answer;
    }
}