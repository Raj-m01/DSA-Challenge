class Solution {
    public int search(int[] nums, int target) {
        
        int s=0, e=nums.length-1;
        
        while(s<=e){
            
            int mid = s+(e-s)/2;
            
            if(target==nums[mid])
                return mid;
            
            if(nums[s]<=nums[mid]){
                
                if(target<nums[mid] && target>=nums[s])
                    e = mid-1;
                else
                    s = mid+1;
                
            }else{
                
                if(target<=nums[e] && target>nums[mid])
                    s = mid+1;
                else
                    e = mid-1;
                    
            }
            
        }
        
        return -1;
    }
}