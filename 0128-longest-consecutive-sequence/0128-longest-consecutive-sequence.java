class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums) set.add(val);
        int max = 0;
        int starting =-1;

        for(int sum : set){
            if(!set.contains(sum-1))
            starting = sum;
            int len = 1;
            while(set.contains(starting+1)){
                len++;
                starting++;
            }
            max = Math.max(max,len);
        }
    
        return max;
    }
}