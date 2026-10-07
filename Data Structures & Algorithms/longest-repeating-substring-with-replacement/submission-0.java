class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int maxCount = 0; 
        int  l =0;
        for(int r = 0;r<s.length();r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);

            maxCount = Math.max(maxCount, map.get(s.charAt(r)));

            if(r - l +1 -maxCount > k){
                
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)-1);
                l++;

            }
            maxLength = Math.max(maxLength,r-l+1);

        }
        return maxLength;
        
    }
}
