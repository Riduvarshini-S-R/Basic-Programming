class Solution {
    public int minOperations(int[] nums) {
        int noOfMoves = 0;
        HashMap<Integer,Integer> occurances = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            occurances.put(nums[i],occurances.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i : occurances.entrySet()){
            if(i.getValue()==1)
                return -1;
            noOfMoves+=i.getValue()/3;
            if(i.getValue()%3!=0)
                noOfMoves++;
        }
        return noOfMoves;
    }
}
