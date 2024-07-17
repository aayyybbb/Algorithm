class Solution {
    public String solution(String s) {
        int sn = s.length();
        if(sn%2==0){
            int csn = sn/2;
            return Character.toString(s.charAt(csn-1)) + Character.toString(s.charAt(csn));
        }else{
            int icsn = sn/2;
            return Character.toString(s.charAt(icsn));
        }
    }
}