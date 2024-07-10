import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}