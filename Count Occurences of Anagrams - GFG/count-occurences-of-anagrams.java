// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
  
        int n = txt.length(), k = pat.length();
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<k;i++){
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        
        int i=0, j=0, ans=0;
        int count = map.size();
        
        while(j<n){
            
            char fast = txt.charAt(j);
            char slow = txt.charAt(i);
            
            if(map.containsKey(fast)){
                
                map.put(fast,map.get(fast)-1);
                if(map.get(fast)==0)count--;
            }
            
            if(j-i+1<k)j++;
            else{
                
                if(count==0)ans++;
                
                if(map.containsKey(slow)){
                    map.put(slow,map.get(slow)+1);
                    if(map.get(slow)==1)count++;
                }
                
                i++;j++;
            }
            
        }
     
     return ans;   
    }
}