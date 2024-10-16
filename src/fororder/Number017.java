package fororder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Number017 {

//    public List<String> letterCombinations(String digits) {
//
//        List<String> res = new ArrayList<>();
//
//        char[] digitsArr = digits.toCharArray();
//        // 一共 8 个一维数组，下标为 5 和 7 的一维数组有四个元素，其余是三个元素
//        char[][] zifu = new char[][]{{'a','b','c'},{'d','e','f'},{'g','h','i'},
//                {'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
//        // 暴力解法
//        HashMap<Integer, char[]> map = new HashMap<>();
//        map.put(1, zifu[0]);
//        map.put(2, zifu[1]);
//        map.put(3, zifu[2]);
//        map.put(4, zifu[3]);
//        map.put(5, zifu[4]);
//        map.put(6, zifu[5]);
//        map.put(7, zifu[6]);
//        map.put(8, zifu[7]);
        // 12
        // {'a','b','c'},{'d','e','f'}
        // ad ae af bd be bf cd ce cf


//        // 输入 digitsArr.length 个数字
//        int[] recodeIndex = new int[digits.length()]; // {0, 0}
//        StringBuffer buffer = new StringBuffer();
//        for (int i = 0; i < digitsArr.length; i++) {
//            buffer.append(map.get(digitsArr[i])[recodeIndex[i]]);
//            recodeIndex[i]++;
//        }



//        while(true) {
//            int j = 0;
//            StringBuilder sb = new StringBuilder();
//            // i 为第多少个数字, 一个字符串有 i 个字符
//            for (int i = 0; i < digitsArr.length; i++) {
//                // 这是第 i 个数字
//                // digitsArr[i]
//                // j 是第 i 个字符对应的 字符集
//                char[] zifuArr = map.get(digitsArr[i]);
//                for ( ; j < zifuArr.length; ) {
//                    sb.append(zifuArr[j]);
//                    j++;
//                    break;
//                }
//            }
//        }
//    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }









}
