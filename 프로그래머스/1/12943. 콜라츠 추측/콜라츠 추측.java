class Solution {
    public int solution(int num) {
        int count = 0;
        int limit = 500;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if(num % 2 == 1){
                num = num * 3 + 1;
            }
            count++;
            if (count == limit) {
                return -1;
            }
        }
        return count;
    }
}