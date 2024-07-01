class Solution {
    public boolean solution(int x) {
        int sum = 0, n = x;

        // n이 0이 될 때까지 반복. n의 모든 자릿수를 처리할 때까지 반복.
        while (n != 0) { 
            
            // n의 마지막 자릿수를 sum과 합
            // n % 10은 n의 마지막 자릿수를 구하는 연산
            sum += n % 10;
            
            // n을 10으로 나누어 마지막 자릿수를 제거
            // n이 0이 될 때까지 반복
            n /= 10;
        }
        
        return x % sum == 0;
    }
}

//수정 전 코드 
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int a = x / 10000;
        int b = (x / 1000) % 10;
        int c = (x / 100) % 10;
        int d = (x / 10) % 10;
        int e = x % 10;
    
        int sum = a + b + c + d + e;
    
    if(x % sum != 0)
        answer = false;
        
        return answer;
    }
}
//조건에 맞춰서 한자리씩 다 계산 후 합했다.
