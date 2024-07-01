class Solution {
    public boolean solution(int x) {
        int sum = 0, n = x;
        
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return x % sum == 0;
    }
}

sum 변수는 각 자릿수의 합을 저장하기 위한 변수
n 변수는 x 값을 복사하여 자릿수를 계산하는 데 사용

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
