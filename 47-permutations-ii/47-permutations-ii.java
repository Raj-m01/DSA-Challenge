class Solution {
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result = new ArrayList();        
        permutaions(nums, new ArrayList(), 0 , result);
        return result;
        
    }
    
    
    public void permutaions(int[] nums, ArrayList<Integer> out, int i, List<List<Integer>> result){
        
        
        if(i>nums.length-1){
            ArrayList<Integer> ans = new ArrayList(out);
            if(!result.contains(ans))result.add(ans);
            return;
        }
        
                
        for(int j=0; j<=out.size(); j++){

            out.add(j,nums[i]);
            permutaions(nums, out, i+1, result);
            out.remove(j);
        }
        
     return;   
    }
}