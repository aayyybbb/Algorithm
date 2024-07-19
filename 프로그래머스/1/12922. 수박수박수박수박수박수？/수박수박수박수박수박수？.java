class Solution {
    public String solution(int n) {
        String waterMelon = "수박";
        String water = "수";
        String answer = "";
        if(n%2 == 0){
            for(int i = 0; i<n/2; i++){
                answer = answer + waterMelon;
            }
        }else if(n%2 != 0){
            for(int i = 0; i<n/2; i++){
                answer = answer + waterMelon;
            }
            return answer + water;
        }
        return answer;
    }
}