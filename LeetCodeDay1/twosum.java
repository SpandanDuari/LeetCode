class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int len=nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                }

            }
        }
        return res;
        

        
    }
}