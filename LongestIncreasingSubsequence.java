
public class LongestIncreasingSubsequence {
	public static void main(String[] args) throws Exception{
        int[] A = {1,3,5,4,7};
        System.out.println(new LongestIncreasingSubsequence().findLengthOfLCIS(A));
    }

    public int findLengthOfLCIS(int[] nums) {
        int max = 1, count = 1;
        if(nums.length == 1) return max;
        if(nums.length == 0) return 0;
        for(int i = 0, j = i + 1; j < nums.length;){
            if(nums[j] > nums[i]){
                count++;
                i++; j++;
            } else {
                max = Math.max(max, count);
                count = 0;
                i = j;
                j = i + 1;
            }
        }
        return max;
    }
}
