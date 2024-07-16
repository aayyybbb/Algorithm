class Solution {
    public String solution(String phone_number) {
        int idx = phone_number.length();
        int pidx = idx - 4;
        String starString = phone_number.substring(0,pidx);
        String answerString = starString.replaceAll(".","*");
        
        String answer = answerString + phone_number.substring(pidx);
        return answer;
    }
}