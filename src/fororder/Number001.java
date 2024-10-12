package fororder;

import java.util.HashSet;

public class Number001 {

    public static int lengthOfLongestSubstring(String s) {
        // 暴力解法

        int maxNumber = 0;
        for(int j = 0; j < s.length(); j++) {
            int nowNumber = 0;
            HashSet<Character> set = new HashSet();
            for(int i = j; i < s.length(); i++) {
                Character ch = Character.valueOf(s.charAt(i));

                if(set.contains(ch)) {
                    if (nowNumber > maxNumber)
                        maxNumber = nowNumber;
                    break;
                }
                nowNumber++;
                set.add(ch);
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("jcs324 j5342*&(&#(*)@cv"));


        Character ch1 = Character.valueOf('a');
        Character ch2 = Character.valueOf('a');
        System.out.println(ch1.equals(ch2));  // true
        System.out.println(ch1.hashCode() == ch2.hashCode());  // true
    }
}
