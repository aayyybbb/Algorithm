class Solution {
    public String solution(String s) {
        String[] numList = s.split(" ");
        
        int[] intList = new int[numList.length];
        for(int i = 0; i < numList.length; i++){
            intList[i] = Integer.parseInt(numList[i]);
        }
        int min = intList[0];
        int max = intList[0];
        for(int a = 0; a < intList.length; a++){
            if(min>=intList[a]){
                min = intList[a];
            }else if(max<=intList[a]){
                max = intList[a];
            }
        }
        return min + " " + max;
    }
}