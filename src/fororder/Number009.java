package fororder;

public class Number009 {
    public static boolean isPalindrome(int x) {
        // 暴力解法
        // 2465642
        String str = String.valueOf(x);
        //
        int count = 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i)) * count;
            count *= 10;
        }
        if (sum == x)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(348532));
        System.out.println(isPalindrome(-39473295));
        System.out.println(isPalindrome(1234554321));
    }
}
