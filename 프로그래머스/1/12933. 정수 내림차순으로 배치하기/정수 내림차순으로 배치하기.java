 import java.util.*;

 class Solution {
   public long solution(long n) {
       long answer = 0;
       String str=""+n;
       String[] array=str.split("");
       Arrays.sort(array, new Comparator<String>(){
           @Override
           public int compare(String s1, String s2){
               return s2.compareTo(s1);
           }
       });
       String number="";
       for(String s:array){
           number+=s;
       }
       answer=Long.parseLong(number);
       return answer;
   }
 }
 