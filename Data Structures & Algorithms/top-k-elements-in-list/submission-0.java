class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
             map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer>[] res = new ArrayList[nums.length+1];

        for(int i = 0;i < res.length;i++){
            res[i] = new ArrayList<>();
        }
        int freq = 0;
        int ele = 0;
        for(Map.Entry<Integer,Integer> entry :  map.entrySet()){
            ele = entry.getKey();
            freq = entry.getValue();
            res[freq].add(ele);
        }
        int[] finalRes = new int[k];
        int index = 0;
        for(int  i = res.length - 1; i > 0 && index < k;i--){
            for(int j : res[i]){
                finalRes[index] = j;
                index++;
                if(index == k){
                    return finalRes;
                }
            }
             
        }
        
       

       return finalRes;
    //    int[] res = new int[nums.length];
    //     int count  = 0;
    //    for(int i = 0; i < nums.length; i++){
    //         count  = 1;
    //         for(int  j = i + 1; j < nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 count++;
    //             }
    //         }
    //         res[count] = nums[i];
    //    }

    //     int n = nums.length - 1; 
    //     int index = 0;
    //     int[] finalRes = new int[k];
    //    while(index <= k){
        
    //         if(res[n]>0){
    //             finalRes[index] = res[n];
    //             index++;
    //         }
    //    }

    //     return finalRes;
        
    }
}
