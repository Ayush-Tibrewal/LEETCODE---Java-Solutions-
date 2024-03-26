class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans ={-1};
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                ans =  new  int[]{i,mp.get(target-nums[i])};
                return ans;
            }else{
                mp.put(nums[i],i);
            }
        
        }
       int[] aa = {-1,-1};
        return aa;
    }
}



       