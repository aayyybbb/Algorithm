class Solution {
    public boolean solution(String s) {
          if (s.length() == 4 || s.length() == 6) {
            // 문자열이 숫자로만 구성되어 있는지 확인
            return s.chars().allMatch(Character::isDigit);
        }
        return false;
    }
}