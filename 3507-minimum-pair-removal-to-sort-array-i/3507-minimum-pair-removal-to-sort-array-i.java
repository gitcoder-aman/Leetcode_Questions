class Solution {

    private static int findMinPair(List<Integer>list){

        int minSum = Integer.MAX_VALUE;
        int pos = -1;

        for(int i = 0; i < list.size()-1; i++){

            int sum = list.get(i) + list.get(i+1);
            if(sum < minSum){
                minSum = sum;
                pos = i;
            }
        }
        return pos;
    }
    private static void mergePair(List<Integer>list,int pos){
        list.set(pos,list.get(pos)+list.get(pos+1));
        list.remove(pos+1);
    } 
    private static boolean isSorted(List<Integer>list){
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {

        List<Integer>list = new ArrayList<>();
        for(int n : nums){
            list.add(n);
        }
        int operation = 0;
        while(!isSorted(list)){
            int pos = findMinPair(list);
            mergePair(list,pos);
            operation++;
        }
        return operation;
    }
}