package fororder;

import java.util.HashMap;

public class Number012 {


//    // 尝试一 超出时间限制
//    public static String intToRoman(int num) {
//
//        StringBuffer buffer = new StringBuffer();
//
//        // 1 <= number <= 3999, 如3749
//        while(num > 0) {
//            // 先算其最高位位数
//            int highest = highest(num);
//            // 当改值以 4 或 9 开头
//            if(hignestNumber(num) == 4) {
//                if(highest == 3) {
//                    // 三位数
//                    buffer.append("CD");
//                    num = num % 10;
//                    continue;
//                } else if(highest == 2) {
//                    // 两位数
//                    buffer.append("XL");
//                    num = num % 10;
//                    continue;
//                } else {
//                    // 个位数
//                    buffer.append("IV");
//                    num = num % 10;
//                    continue;
//                }
//            } else if(hignestNumber(num) == 9) {
//                if(highest == 3) {
//                    // 三位数
//                    buffer.append("CM");
//                    num = num % 10;
//                    continue;
//                } else if(highest == 2) {
//                    // 两位数
//                    buffer.append("XC");
//                    num = num % 10;
//                    continue;
//                } else {
//                    // 个位数
//                    buffer.append("IX");
//                    num = num % 10;
//                    continue;
//                }
//
//            }
//            // 不以 4 或 9 开头
//            if(highest == 4) {
//                if(hignestNumber(num) == 3) {
//                    buffer.append("MMM");
//                    num = num % 10;
//                    continue;
//                }
//
//                if(hignestNumber(num) == 2) {
//                    buffer.append("MM");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 1) {
//                    buffer.append("M");
//                    num = num % 10;
//                    continue;
//                }
//            } else if(highest == 3) {
//                if(hignestNumber(num) == 8) {
//                    buffer.append("DCCC");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 7) {
//                    buffer.append("DCC");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 6) {
//                    buffer.append("DC");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 5) {
//                    buffer.append("D");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 3) {
//                    buffer.append("CCC");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 2) {
//                    buffer.append("CC");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 1) {
//                    buffer.append("C");
//                    num = num % 10;
//                    continue;
//                }
//
//            } else if(highest == 2) {
//                if(hignestNumber(num) == 8) {
//                    buffer.append("LXXX");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 7) {
//                    buffer.append("LXX");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 6) {
//                    buffer.append("LX");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 5) {
//                    buffer.append("L");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 3) {
//                    buffer.append("XXX");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 2) {
//                    buffer.append("XX");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 1) {
//                    buffer.append("X");
//                    num = num % 10;
//                    continue;
//                }
//            } else {
//                if(hignestNumber(num) == 8) {
//                    buffer.append("VIII");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 7) {
//                    buffer.append("VII");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 6) {
//                    buffer.append("VI");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 5) {
//                    buffer.append("V");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 3) {
//                    buffer.append("III");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 2) {
//                    buffer.append("II");
//                    num = num % 10;
//                    continue;
//                }
//                if(hignestNumber(num) == 1) {
//                    buffer.append("I");
//                    num = num % 10;
//                    continue;
//                }
//            }
//            num = num % 10;
//
//        }
//        return buffer.toString();
//    }



    // 成功
    public static String intToRoman(int num) {
        // 获取最高位
        int highest = highest(num);
        StringBuffer buffer = new StringBuffer();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(43, "MMM");
        hashMap.put(42, "MM");
        hashMap.put(41, "M");
        hashMap.put(39, "MC");
        hashMap.put(38, "CCCD");
        hashMap.put(37, "CCD");
        hashMap.put(36, "CD");
        hashMap.put(35, "D");
        hashMap.put(34, "DC");
        hashMap.put(33, "CCC");
        hashMap.put(32, "CC");
        hashMap.put(31, "C");
        hashMap.put(30, "");
        hashMap.put(29, "CX");
        hashMap.put(28, "XXXL");
        hashMap.put(27, "XXL");
        hashMap.put(26, "XL");
        hashMap.put(25, "L");
        hashMap.put(24, "LX");
        hashMap.put(23, "XXX");
        hashMap.put(22, "XX");
        hashMap.put(21, "X");
        hashMap.put(20, "");
        hashMap.put(19, "XI");
        hashMap.put(18, "IIIV");
        hashMap.put(17, "IIV");
        hashMap.put(16, "IV");
        hashMap.put(15, "V");
        hashMap.put(14, "VI");
        hashMap.put(13, "III");
        hashMap.put(12, "II");
        hashMap.put(11, "I");
        hashMap.put(10, "");


        // 更改计划，从低位开始算起，最后反转字符串
        while (num > 0) {
            // 3749
            int toChange = num % 10;
            // 获取该个位数是第几位数
            int high = highest - highest(num) + 1;
            // 计算其对应的 字符串
            buffer.append(numToRoman(high, toChange, hashMap));
            num /= 10;
        }
        return buffer.reverse().toString();
    }
    // 根据该个位数的位数和其值来判断其对应的字符串
    public static String numToRoman(int high, int toChange, HashMap<Integer, String> hashMap) {

        int index = 10 * high + toChange;
        return hashMap.get(index);
    }
    // 获得最高位有几位
    public static int highest(int num) {
        if(num > 0 && num < 10) return 1;
        if(num >= 10 && num < 100) return 2;
        if(num >= 100 && num < 1000) return 3;
        return 4;
    }
    // 获得最高位具体数字
    public static int hignestNumber(int num) {
        if (num < 10 && num >= 0) return num;
        return hignestNumber(num / 10);
    }



    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
}
