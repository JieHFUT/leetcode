package fororder;

public class Number014 {

    public static String longestCommonPrefix(String[] strs) {
        // 暴力解法
        StringBuffer buffer = new StringBuffer();
        char[] firstStr = strs[0].toCharArray();
        for(int j = 0; j < firstStr.length; j++) {
            for(int i = 0; i < strs.length; i++) {
                if(j >= strs[i].length() || strs[i].charAt(j) != firstStr[j]) {
                    return buffer.toString();
                }
            }
            buffer.append(firstStr[j]);
        }
        return buffer.toString();
    }



    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }
}
