package fororder;

public class Number008 {

    // 失败
    public static int myAtoi1(String s) {
        int i = 0;
        int ret = 0;
        // 丢弃无用的前导空格
        while (s.charAt(i) == ' '){
            i++;
        }
        // 检查正负号
        if (s.charAt(i) != '-'){
            // 该数为正数
            i++;
            for( ; i < s.length(); i++){
                if (s.charAt(i) == '0'){
                    // 若存在，去除前置的 0
                    continue;
                }
                // 读取数字，直到字符串末尾或者遇到第一个非数字的字符
                //（需要满足[−2 < 31,  2 < 31 − 1]）
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    if (ret > (Integer.MAX_VALUE - s.charAt(i)) / 10 ){
                        return Integer.MAX_VALUE;
                    }
                    ret = ret * 10 + (int) s.charAt(i);
                }
            }
            return ret;
        }else {
            // 该数为负数
            i++;
            for( ; i < s.length(); i++){
                if (s.charAt(i) == '0'){
                    // 若存在，去除前置的 0
                    continue;
                }
                // 读取数字，直到字符串末尾或者遇到第一个非数字的字符（需要满足[−2 < 31,  2 < 31 − 1]）
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    if (ret > (Integer.MAX_VALUE + 1 - s.charAt(i)) / 10 ){
                        return Integer.MIN_VALUE;
                    }
                    ret = ret * 10 + (int) s.charAt(i);
                }
            }
            return ret * -1;
        }
    }


    // sucess
    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int idx = 0;
        while (idx < n && chars[idx] == ' ') {
            // 去掉前导空格
            idx++;
        }
        if (idx == n) {
            //去掉前导空格以后到了末尾了
            return 0;
        }
        boolean negative = false;
        if (chars[idx] == '-') {
            //遇到负号
            negative = true;
            idx++;
        } else if (chars[idx] == '+') {
            // 遇到正号
            idx++;
        } else if (!Character.isDigit(chars[idx])) {
            // 其他符号
            return 0;
        }
        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])) {
            int digit = chars[idx] - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return negative? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            idx++;
        }
        return negative? -ans : ans;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  -00871ts "));

    }
}


//if (ans > (Integer.MAX_VALUE - digit) / 10) {
//        // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
//        // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
//        return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;