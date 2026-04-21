import java.util.Arrays;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int [] ans= new int [len*2];
        for(int i=0;i<len;i++){
            ans[i]=nums[i];
            ans[i+len]=nums[i];
        }

        return ans;

    }
}
public class LeetCode {
    public static void main(String []args){
        int [] num = {1,2,3};
        int len=num.length;

        Solution s = new Solution();

        int[] result = s.getConcatenation(num);
        System.out.println(Arrays.toString(result));



    }
}
