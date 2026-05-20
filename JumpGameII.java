public class JumpGameII {
    public int jump(int[] nums)
    {
        int jump = 0, currMax = 0, currEnd = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            currMax = Math.max(currMax, i+nums[i]);
            if(i == currEnd)
            {
                jump++;
                currEnd = currMax;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        JumpGameII jumpGame = new JumpGameII();
        int[] nums1 = {2,3,1,1,4};
        System.out.println("Output: " + jumpGame.jump(nums1)); // Output: 2

        int[] nums2 = {2,3,0,1,4};
        System.out.println("Output: " + jumpGame.jump(nums2)); // Output: 2
    }
    
}
