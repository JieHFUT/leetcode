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
        // 没有通过测试用例，原因超时(由于 i 和 j一般不能相遇，循环不能终止)
        // int i = 0;
        // int j = height.length - 1;
        // int maxArea = Math.min(height[i], height[j]) * (j - i);
        // while(i < j) {
        //     if(height[i+1] > height[i] &&
        //     (Math.min(height[i + 1], height[j]) * (j - i -1)) > maxArea) {
        //         maxArea = Math.min(height[i + 1], height[j]) * (j - i -1);
        //         i++;
        //     }
        //     if(height[j-1] > height[j] &&
        //     (Math.min(height[i], height[j - 1]) * (j - 1 -i)) > maxArea) {
        //         maxArea = Math.min(height[i], height[j - 1]) * (j - 1 -i);
        //         j--;
        //     }
        // }
        // return maxArea;

        // 通过一般测试用例，原因是结果错误，有时候找出来的并不是最大值
        // 例如 [8,2,2,2,2,100000,100000,2,2,8]
        // 这是这种算法思路存在错误
        int i = 0;
        int count = 0;
        int j = height.length - 1;
        int maxArea = Math.min(height[i], height[j]) * (j - i);
        while(count < height.length - 2) {
            count++;
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

        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}));
    }
}
