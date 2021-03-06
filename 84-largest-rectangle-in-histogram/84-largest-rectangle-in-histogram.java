class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] prevSmallers = previousSmaller(heights);
        int[] nextSmallers = nextSmaller(heights);
                
        int n = heights.length;
        int maxArea = 0;
        
        for(int i=0;i<n;i++){
            
            int currArea = (nextSmallers[i] - prevSmallers[i]-1)*heights[i];
            
            if(currArea>maxArea)maxArea = currArea;
                    
        }
                
        return maxArea;
    }
    
    
    
    public int[] previousSmaller(int[] arr){
        
        int n = arr.length;
        int[] ans = new int[n];
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n;i++){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) stack.pop();

            ans[i] = stack.isEmpty() ? -1:stack.peek();

            stack.push(i);

        }
     
        return ans;
    }
    
    
    public int[] nextSmaller(int[] arr){
        
        int n = arr.length;
        int[] ans = new int[n];
        
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) stack.pop();

            ans[i] = stack.isEmpty() ? n:stack.peek();

            stack.push(i);


        }
        
        return ans;
    }
    
    
}