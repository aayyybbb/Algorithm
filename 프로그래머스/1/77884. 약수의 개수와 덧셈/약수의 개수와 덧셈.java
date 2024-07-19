class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = 0; i + left <= right; i++){
            int num = i + left;
            int count = 0;
            for(int a = 1; a <= num; a++){
                if(num%a == 0){
                    count++;
                }
            }
                            if(count%2 == 0){
                    answer = answer + num;
                }else if(count%2 != 0){
                    answer = answer - num;}
        }
        return answer;
    }
}