class Solution {
    public static String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(c);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}