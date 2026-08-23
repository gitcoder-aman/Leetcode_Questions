class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans = new ArrayList<>();
        

        for(int i = 0; i < numRows; i++){
            List<Integer>list = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    int prevRow = i-1;
                    int idx1 = j-1;
                    int idx2 = j;

                    int val1 = ans.get(prevRow).get(idx1);
                    int val2 = ans.get(prevRow).get(idx2);
                    list.add(val1+val2);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}