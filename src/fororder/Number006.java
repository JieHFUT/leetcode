package fororder;

public class Number006 {


    public static String convert(String s, int numRows) {
        int group = numRows * 2 - 2;
        if (group == 0)
            return s;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= numRows; i++) {
            // 第一行 或者 最后一行 添加
            if (i == 1  || i == numRows) {
                int j = 0;
                while (j < s.length()) {
                    if ((j - i + 1) % group == 0) {
                        stringBuffer.append(s.charAt(j));
                    }
                    j++;
                }
            } else {
                // 其他行(i 为当前是第几行)
                int m = 0;
                while (m < s.length()) {
                    if ((m - i + 1) % group == 0 || (m - i + 1 + 2*(i - 1)) % group == 0) {
                        stringBuffer.append(s.charAt(m));
                    }
                    m++;
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));

    }
}
