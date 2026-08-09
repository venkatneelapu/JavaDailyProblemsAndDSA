class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int maxi=nums[0];
        for(int i=1;i<nums.length;i++){
                if(nums[i]>maxi){
                    ans=Math.max(ans,nums[i]-maxi);
                }
                else{
                    maxi=nums[i];
                }
        }
        return ans;

}
}