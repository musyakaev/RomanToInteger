public class Solution {
    public int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I':
                    value = value + 10 * i;
                case 'V':
                    value = value + 5 * 10 * i;
                default:
                    System.out.println("Такой римской цифры нет");

            }
        }
        return value;
    }
}
