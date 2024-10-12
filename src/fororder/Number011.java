package fororder;

public class Number011 {


    public static int maxArea(int[] height) {
        // // 暴力解法(通过一大半，超时)
        // int maxArea = 0;
        // for(int i = 0; i < height.length; i++) {
        //     for(int j = i + 1; j < height.length; j++) {
        //         int nowArea = 0;
        //         if((nowArea = Math.min(height[j], height[i]) * (j - i)) > maxArea) {
        //             maxArea = nowArea;
        //         }
        //     }
        // }
        // return maxArea;




        // 先算 Math.min(height[0], height[height.length]) * (height.length - 0)
        // 然后两边向中间缩进，只有该索引处值大于left并且area更大才会替换索引值

        // 没有通过测试用例，原因超时
        int i = 0;
        int j = height.length - 1;
        int maxArea = Math.min(height[i], height[j]) * (j - i);
        while(i < j) {
            if(height[i+1] > height[i] &&
                    (Math.min(height[i + 1], height[j]) * (j - i -1)) > maxArea) {
                maxArea = Math.min(height[i + 1], height[j]) * (j - i -1);
                i++;
            }
            if(height[j-1] > height[j] &&
                    (Math.min(height[i], height[j - 1]) * (j - 1 -i)) > maxArea) {
                maxArea = Math.min(height[i], height[j - 1]) * (j - 1 -i);
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
