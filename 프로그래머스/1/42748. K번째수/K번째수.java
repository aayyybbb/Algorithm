import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                     .mapToInt(command -> {
                         int[] subArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
                         Arrays.sort(subArray);
                         return subArray[command[2] - 1];
                     })
                     .toArray();
    }
}
